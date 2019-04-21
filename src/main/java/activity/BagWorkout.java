package activity;

import javax.persistence.*;

@Entity
@Table(name = "BagWorkout")
public class BagWorkout {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;
}
