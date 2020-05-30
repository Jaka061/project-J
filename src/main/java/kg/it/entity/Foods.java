package kg.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="foods")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "type", nullable = false)
    private String type;
    @Column(name = "img")
    private String img;
    @Column(name = "cafe_name", nullable = false)
    private String cafeName;
    @Column(name = "price", nullable = false)
    private Integer price;
    @Column(name = "structure", nullable = false)
    private String structure;
    @Column(name = "toBuy")
    private Boolean toBuy;

    public Foods(String name,String type,String img,String cafeName,Integer price,String structure) {
        this.name=name;
        this.type=type;
        this.img=img;
        this.cafeName=cafeName;
        this.price=price;
        this.structure=structure;
        this.toBuy=false;
    }

}
