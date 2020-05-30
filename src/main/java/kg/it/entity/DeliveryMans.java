package kg.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



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
    private Integer phoneNum ;
    @Column(name = "is_free", nullable = false)
    private Boolean isFree;

    public DeliveryMans(String name,String password,Integer phoneNum) {
        this.name= name;
        this.password= password;
        this.phoneNum= phoneNum;
        this.isFree= true;
    }
}
