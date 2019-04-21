package dao;

import activity.*;
import java.util.Date;


public interface GymWorkoutDao {

    void addGymWorkout(
            Date startTime, Date endTime, Date dateDay, EDaysOfTheWeek dayOfTheWeek, ActivityLocation activityLocation, int effort,
            String comments , BicepsWorkout bicepsWorkout , TrapeziusWorkout trapeziusWorkout , TricepsWorkout tricepsWorkout, LegsWorkout legsWorkout , ShouldersWorkout shouldersWorkout , DorsiWorkout dorsiWorkout,
            AerobicMachineActivity.AerobicMachine aerobicMachine, int timeActive, AbsWorkout absWorkout);

     void ModifyGymWorkoutaerobicMachineActivities(int id,AerobicMachineActivity.AerobicMachine aerobicMachine, int timeActive);


    }
