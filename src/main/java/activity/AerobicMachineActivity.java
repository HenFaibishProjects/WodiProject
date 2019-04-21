package activity;

import javax.persistence.*;

@Entity
@Table(name = "AerobicMachineActivity")
public class AerobicMachineActivity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;
    protected AerobicMachine aerobicMachine;
    protected int timeActive;

    public AerobicMachineActivity(AerobicMachine aerobicMachine, int timeActive) {
        this.aerobicMachine = aerobicMachine;
        this.timeActive = timeActive;
    }

    public AerobicMachineActivity() {
    }

    public AerobicMachine getAerobicMachine() {
        return aerobicMachine;
    }

    public void setAerobicMachine(AerobicMachine aerobicMachine) {
        this.aerobicMachine = aerobicMachine;
    }

    public int getTimeActive() {
        return timeActive;
    }

    public void setTimeActive(int timeActive) {
        this.timeActive = timeActive;
    }

    public int getId() {
        return id;
    }

    public enum AerobicMachine {
        Treadmill,
        StairMill,
        Elliptical,
        RowingMachine,
        SpinBike,
        RecumbentBike
    }

        }





