package kg.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cafe")
@Data
public class Cafe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "name", nullable = false, unique = true)
    private String name ;
    @Column(name = "password ",nullable = false)
    private String password;
    @ManyToOne
    @JoinColumn(name = "contacts",nullable = false)
    private Contacts conacts;

    public Cafe() {}

    public Cafe(String name, String password, Contacts contacts) {
        this.name=name;
        this.password=password;
        this.conacts=contacts;
    }
}
