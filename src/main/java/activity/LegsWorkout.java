package activity;

import javax.persistence.*;

@Entity
@Table(name = "LegsWorkout")
public class LegsWorkout {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;
}
