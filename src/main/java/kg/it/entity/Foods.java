package kg.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="foods")
@Data
public class Foods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "cafe_id", nullable = false)
    private Cafe cafe;
    @Column(name = "type", nullable = false)
    private String type;
    @Column(name = "img")
    private String img;
    @Column(name = "price", nullable = false)
    private Integer price;
    @Column(name = "structure", nullable = false)
    private String structure;
    @Column(name = "toBuy")
    private Boolean toBuy;

    public Foods() { }
    public Foods(String name, Cafe cafe, String type, String img, Integer price, String structure) {
        this.name=name;
        this.cafe= cafe;
        this.type=type;
        this.img=img;
        this.price=price;
        this.structure=structure;
        this.toBuy=false;
    }
}
