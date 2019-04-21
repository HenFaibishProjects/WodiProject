package activity;

import javax.persistence.*;

@Entity
@Table(name = "TrapeziusWorkout")
public class TrapeziusWorkout {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;
}
