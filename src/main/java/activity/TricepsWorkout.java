package activity;

import javax.persistence.*;

@Entity
@Table(name = "TricepsWorkout")
public class TricepsWorkout {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;
}
