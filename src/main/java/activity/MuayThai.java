package activity;

import javax.persistence.*;

@Entity
@Table(name = "MuayThai")
public class MuayThai {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;
}
