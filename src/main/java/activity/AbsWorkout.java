package activity;

import javax.persistence.*;

@Entity
@Table(name = "AbsWorkout")
public class AbsWorkout {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;

}
