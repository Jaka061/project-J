package kg.it.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecuriyConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.
                inMemoryAuthentication()
                .withUser("admin").password("{noop}6767").roles("ADMIN").and()
                .withUser("user").password("{noop}0000").roles("USER").and()
                .withUser("cafe").password("{noop}4774").roles("CAFE").and()
                .withUser("deliveryman").password("{noop}8686").roles("DELIVERYMAN");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().disable().cors().and().csrf().disable().authorizeRequests()

        .antMatchers(HttpMethod.GET , "/api/food").permitAll()
        .antMatchers(HttpMethod.GET, "/api/cafe").permitAll()
        .antMatchers(HttpMethod.GET, "/api/contacts").permitAll()

                .antMatchers(HttpMethod.GET,"/api/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST,"/api/contacts").hasRole("ADMIN")


                .antMatchers("api/delivery/**").hasRole("ADMIN")
                .antMatchers("api/list/**").hasRole("ADMIN")
                .antMatchers("api/orderBlog/**").hasRole("ADMIN")
                .antMatchers("api/userR/**").hasRole("ADMIN")
                .antMatchers("api/address/**").hasRole("ADMIN")
                .antMatchers("/api/cafe/**").hasRole("ADMIN")


                .antMatchers(HttpMethod.PUT ,"/api/cafe/**").hasRole("CAFE")
                .antMatchers(HttpMethod.GET ,"/api/list/C/**").hasRole("CAFE")
                .antMatchers(HttpMethod.POST ,"/api/food/**").hasRole("CAFE")
                .antMatchers(HttpMethod.POST,"api/contacts/**").hasRole("CAFE")

                .antMatchers(HttpMethod.GET,"api/list/Cs/**").hasRole("USER")
                .antMatchers(HttpMethod.POST,"api/orderBlog").hasRole("USER")
                .antMatchers(HttpMethod.GET,"api/orderBlog").hasRole("DELIVERYMAN")
                .antMatchers(HttpMethod.GET,"api/list/D/**").hasRole("DELIVERYMAN");

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
