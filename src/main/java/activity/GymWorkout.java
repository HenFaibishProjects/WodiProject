package activity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "GymWorkout")
public class GymWorkout extends BaseActivity {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    protected int id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    protected AbsWorkout absWorkout;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    protected BicepsWorkout bicepsWorkout;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    protected TrapeziusWorkout trapeziusWorkout;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    protected TricepsWorkout tricepsWorkout;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    protected LegsWorkout legsWorkout;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    protected ShouldersWorkout shouldersWorkout;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    protected DorsiWorkout dorsiWorkout;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    protected List<AerobicMachineActivity> aerobicMachineActivityList;

    public GymWorkout(Date startTime, Date endTime, Date dateDay, EDaysOfTheWeek dayOfTheWeek, ActivityLocation activityLocation, int effort, String comments, BicepsWorkout bicepsWorkout, TrapeziusWorkout trapeziusWorkout, TricepsWorkout tricepsWorkout, LegsWorkout legsWorkout, ShouldersWorkout shouldersWorkout, DorsiWorkout dorsiWorkout, List<AerobicMachineActivity> aerobicMachineActivityList, AbsWorkout absWorkout) {
        super(startTime, endTime, dateDay, dayOfTheWeek, activityLocation, effort);
        this.absWorkout = absWorkout;
        this.bicepsWorkout = bicepsWorkout;
        this.trapeziusWorkout = trapeziusWorkout;
        this.tricepsWorkout = tricepsWorkout;
        this.legsWorkout = legsWorkout;
        this.shouldersWorkout = shouldersWorkout;
        this.dorsiWorkout = dorsiWorkout;
        this.aerobicMachineActivityList = aerobicMachineActivityList;
    }

    public GymWorkout(AbsWorkout absWorkout, BicepsWorkout bicepsWorkout, TrapeziusWorkout trapeziusWorkout, TricepsWorkout tricepsWorkout, LegsWorkout legsWorkout, ShouldersWorkout shouldersWorkout, DorsiWorkout dorsiWorkout, List<AerobicMachineActivity> aerobicMachineActivityList) {
        this.absWorkout = absWorkout;
        this.bicepsWorkout = bicepsWorkout;
        this.trapeziusWorkout = trapeziusWorkout;
        this.tricepsWorkout = tricepsWorkout;
        this.legsWorkout = legsWorkout;
        this.shouldersWorkout = shouldersWorkout;
        this.dorsiWorkout = dorsiWorkout;
        this.aerobicMachineActivityList = aerobicMachineActivityList;
    }

    public GymWorkout() {
    }

    public AbsWorkout getAbsWorkout() {
        return absWorkout;
    }

    public void setAbsWorkout(AbsWorkout absWorkout) {
        this.absWorkout = absWorkout;
    }

    public BicepsWorkout getBicepsWorkout() {
        return bicepsWorkout;
    }

    public void setBicepsWorkout(BicepsWorkout bicepsWorkout) {
        this.bicepsWorkout = bicepsWorkout;
    }

    public TrapeziusWorkout getTrapeziusWorkout() {
        return trapeziusWorkout;
    }

    public void setTrapeziusWorkout(TrapeziusWorkout trapeziusWorkout) {
        this.trapeziusWorkout = trapeziusWorkout;
    }

    public TricepsWorkout getTricepsWorkout() {
        return tricepsWorkout;
    }

    public void setTricepsWorkout(TricepsWorkout tricepsWorkout) {
        this.tricepsWorkout = tricepsWorkout;
    }

    public LegsWorkout getLegsWorkout() {
        return legsWorkout;
    }

    public void setLegsWorkout(LegsWorkout legsWorkout) {
        this.legsWorkout = legsWorkout;
    }

    public ShouldersWorkout getShouldersWorkout() {
        return shouldersWorkout;
    }

    public void setShouldersWorkout(ShouldersWorkout shouldersWorkout) {
        this.shouldersWorkout = shouldersWorkout;
    }

    public DorsiWorkout getDorsiWorkout() {
        return dorsiWorkout;
    }

    public void setDorsiWorkout(DorsiWorkout dorsiWorkout) {
        this.dorsiWorkout = dorsiWorkout;
    }

    public List<AerobicMachineActivity> getAerobicMachineActivityList() {
        return aerobicMachineActivityList;
    }

    public void setAerobicMachineActivityList(List<AerobicMachineActivity> aerobicMachineActivityList) {
        this.aerobicMachineActivityList = aerobicMachineActivityList;
    }

    public int getId() {
        return id;
    }
}
