package activity;

import javax.persistence.*;

@Entity
@Table(name = "ChestWorkout")
public class ChestWorkout {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;
}
