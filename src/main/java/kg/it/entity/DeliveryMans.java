package kg.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name="delivery_mans")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryMans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name= "password", nullable = false )
    private String password;
    @Column(name = "phone_num", nullable = false)
    private String phoneNum ;
    @Column(name = "is_free", nullable = false)
    private Boolean isFree;
    @Column(name = "timeOfRegister")
    private LocalDateTime timeOfRegister;

    @PrePersist
    public void Create(){
        this.timeOfRegister=LocalDateTime.now();
    }

    public DeliveryMans(String name,String password,String phoneNum) {
        this.name= name;
        this.password= password;
        this.phoneNum= phoneNum;
        this.isFree= true;

    }
}
