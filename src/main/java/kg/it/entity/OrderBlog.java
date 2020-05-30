package kg.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "order_blog")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderBlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "login")
    private  String login;
    @Column( name = "number")
    private  Integer number;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
    @Column(name = "time_of_delivery")
    private LocalTime timeOfDelivery;
    @Column(name = "payWay")
    private String payWay;
    @Column(name = "payment")
    private Integer payment;

    public OrderBlog(String login,Integer number,Address address,LocalTime timeOfDelivery,String payWay,Integer payment) {
        this.login=login;
        this.number=number;
        this.address=address;
        this.timeOfDelivery=timeOfDelivery;
        this.payWay=payWay;
        this.payment=payment;
    }


}
