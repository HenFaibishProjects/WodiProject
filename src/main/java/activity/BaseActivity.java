package activity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class BaseActivity {
    protected Date startTime;
    protected Date endTime;
    protected  Date dateDay;
    @Enumerated(EnumType.STRING)
    protected EDaysOfTheWeek dayOfTheWeek;
    @Enumerated(EnumType.STRING)
    protected ActivityLocation activityLocation;
    protected int effort;
    protected String comments;


    public BaseActivity(Date startTime, Date endTime, Date dateDay, EDaysOfTheWeek dayOfTheWeek, ActivityLocation activityLocation, int effort) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.dateDay = dateDay;
        this.dayOfTheWeek = dayOfTheWeek;
        this.activityLocation = activityLocation;
        this.effort = effort;
    }

    public BaseActivity() {
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getDateDay() {
        return dateDay;
    }

    public void setDateDay(Date dateDay) {
        this.dateDay = dateDay;
    }

    public EDaysOfTheWeek getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(EDaysOfTheWeek dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public ActivityLocation getActivityLocation() {
        return activityLocation;
    }

    public void setActivityLocation(ActivityLocation activityLocation) {
        this.activityLocation = activityLocation;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}

