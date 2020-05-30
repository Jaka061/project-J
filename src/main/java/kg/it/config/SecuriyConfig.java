package kg.it.config;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecuriyConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.
                inMemoryAuthentication()
                .withUser("admin").password("{noop}6767").roles("ADMIN").and();
//        for (int i = 0; i <10 ; i++) {
//            auth.inMemoryAuthentication()
//                    .withUser("login"+i).password("{noop}565"+i).roles("USER").and();
//        }
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers(HttpMethod.POST).hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT).hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE).hasRole("ADMIN")
                .antMatchers(HttpMethod.GET).hasRole("ADMIN")
                .antMatchers(HttpMethod.GET ).hasRole("USER")
                .antMatchers(HttpMethod.GET).hasRole("DELIVERYMAN")
                .and().csrf().disable();
    }

    //@Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}
