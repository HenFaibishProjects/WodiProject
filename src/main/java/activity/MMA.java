package activity;

import javax.persistence.*;

@Entity
@Table(name = "MMA")
public class MMA {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;
}
