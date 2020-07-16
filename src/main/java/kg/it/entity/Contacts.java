package kg.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "contacts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numbers")
    private String  numbers;
    @Column(name = "website")
    private String website;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;

    public Contacts(String numbers,String website,String email,String address) {
        this.numbers=numbers;
        this.address=address;
        this.email=email;
        this.website=website;
    }
}
