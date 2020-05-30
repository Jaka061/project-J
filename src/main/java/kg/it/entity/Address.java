package kg.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "city", nullable =  false)
    private String city;
    @Column(name = "street", nullable =  false)
    private String street;
    @Column(name = "home", nullable =  false)
    private Integer home;
    @Column(name = "porch")
    private Integer porch;
    @Column(name = "floor")
    private Integer floor;

    public Address(String city,String street,Integer home, Integer porch, Integer floor) {
        this.city=city;
        this.street=street;
        this.home=home;
        this.porch=porch;
        this.floor= floor;

    }
}
