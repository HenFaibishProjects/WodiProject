package activity;

import javax.persistence.*;

@Entity
@Table(name = "DorsiWorkout")
public class DorsiWorkout {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;
}
