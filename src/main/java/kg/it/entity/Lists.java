package kg.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "list")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lists {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Long id;
   @ManyToOne
   @JoinColumn(name = "customer_id",nullable = false )
   private Customers customer;
   @ManyToOne
   @JoinColumn(name = "order_id",nullable = false )
   private OrderBlog orderBlog;
   @ManyToOne
   @JoinColumn(name = "cafe_id")
   private Cafe cafe;
   @ManyToOne
   @JoinColumn(name = "deliveryman_id",nullable = false )
   private DeliveryMans deliveryMan;
   @Column(name = "time" ,nullable = false )
   private LocalDateTime timeofdelivery;


   @PrePersist
   public void Create(){
      this.timeofdelivery=LocalDateTime.now();
   }

   public Lists(Customers customer,OrderBlog orderBlog,Cafe cafe,DeliveryMans deliveryMan) {
      this.customer=customer;
      this.cafe=cafe;
      this.orderBlog=orderBlog;
      this.deliveryMan=deliveryMan;
   }
}
