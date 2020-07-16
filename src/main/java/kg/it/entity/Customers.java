package kg.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;
    @Column(name = "login",nullable = false,unique = true)
    private String login;
    @Column(name= "password", nullable = false )
    private String password;
    @Column(name = "phone_num",nullable = false )
    private String phoneNum ;
    @Column(name = "balance",nullable = false )
    private Integer balance;
    @Column(name = "timeOfRegister")
    private LocalDateTime timeOfRegister;

    @PrePersist
    public void Create(){
        this.timeOfRegister=LocalDateTime.now();
    }

    public Customers(String login,String password,String phoneNum,Integer balance) {
        this.login= login;
        this.password= password;
        this.phoneNum= phoneNum;
        this.balance=balance;
    }
}
