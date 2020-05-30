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
   @JoinColumn(name = "deliveryman_id",nullable = false )
   private DeliveryMans deliveryMan;
   @Column(name = "time" ,nullable = false )
   private LocalDateTime time;

   public Lists(Customers customer,OrderBlog orderBlog,DeliveryMans deliveryMan,LocalDateTime time) {
      this.customer=customer;
      this.orderBlog=orderBlog;
      this.deliveryMan=deliveryMan;
      this.time=time;
   }
}
