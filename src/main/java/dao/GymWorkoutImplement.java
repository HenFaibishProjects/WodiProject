package dao;

import Connections.HibernateStructInfo;
import activity.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GymWorkoutImplement extends HibernateStructInfo implements GymWorkoutDao {


    public GymWorkout getUniqueObjectResultBylId(int id) {
        beginTranscation();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<GymWorkout> criteria = builder.createQuery(GymWorkout.class);
        Root<GymWorkout> root = criteria.from(GymWorkout.class);
        criteria.select(root);
        criteria.select(root).where(builder.gt(root.get("id"),id));
        return (GymWorkout) criteria;
    }



    @Override
    public void addGymWorkout(Date startTime, Date endTime, Date dateDay, EDaysOfTheWeek dayOfTheWeek, ActivityLocation activityLocation, int effort, String comments, BicepsWorkout bicepsWorkout, TrapeziusWorkout trapeziusWorkout, TricepsWorkout tricepsWorkout, LegsWorkout legsWorkout, ShouldersWorkout shouldersWorkout, DorsiWorkout dorsiWorkout, AerobicMachineActivity.AerobicMachine aerobicMachine, int timeActive, AbsWorkout absWorkout) {
        AerobicMachineActivity aerobicMachineActivity = new AerobicMachineActivity(aerobicMachine,timeActive);
        List<AerobicMachineActivity> aerobicMachineActivitiesList = new ArrayList<>();
        aerobicMachineActivitiesList.add(aerobicMachineActivity);
        GymWorkout gymWorkout = new GymWorkout(startTime,endTime,dateDay,dayOfTheWeek,activityLocation,effort,comments,
                bicepsWorkout,trapeziusWorkout,tricepsWorkout,legsWorkout,shouldersWorkout,dorsiWorkout,aerobicMachineActivitiesList,absWorkout);
        beginTranscation();
        super.saveOrUpdate(gymWorkout);
        String username = System.getProperty("user.name");
    }

    @Override
    public void ModifyGymWorkoutaerobicMachineActivities(int id,AerobicMachineActivity.AerobicMachine aerobicMachine, int timeActive) {
        AerobicMachineActivity aerobicMachineActivity = new AerobicMachineActivity(aerobicMachine,timeActive);
        List<AerobicMachineActivity> aerobicMachineActivitiesList = new ArrayList<>();
        GymWorkout gymWorkout = getUniqueObjectResultBylId(id);
        gymWorkout.getAerobicMachineActivityList().add(aerobicMachineActivity);
        super.saveOrUpdate(gymWorkout);

    }
}
