package activity;

import javax.persistence.*;

@Entity
@Table(name = "Bjj")
public class Bjj {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;
}
