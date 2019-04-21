package activity;

import javax.persistence.*;

@Entity
@Table(name = "ShouldersWorkout")
public class ShouldersWorkout {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;
}
