

import Login.SystemLogin;
import activity.*;
import dao.GymWorkoutImplement;
import dao.UserDaoImpl;
import org.testng.annotations.Test;

import java.sql.SQLException;
import java.util.Date;

public class StartNg {



    @Test( enabled = false)
    public  void GymWorkout(Date startTime, Date endTime, Date dateDay, EDaysOfTheWeek dayOfTheWeek, ActivityLocation activityLocation, int effort, String comments, BicepsWorkout
            bicepsWorkout, TrapeziusWorkout trapeziusWorkout, TricepsWorkout tricepsWorkout, LegsWorkout legsWorkout, ShouldersWorkout shouldersWorkout, DorsiWorkout dorsiWorkout, AerobicMachineActivity.AerobicMachine aerobicMachine, int timeActive, AbsWorkout absWorkout)  {
        Date date = new Date();
        date.setTime(1497096009);

        GymWorkoutImplement gymWorkoutImplement = new GymWorkoutImplement();


    }

    @Test( enabled = true)
    public  void GymWorkout()  {
        Date date = new Date();
        date.setTime(1497096009);

        GymWorkoutImplement gymWorkoutImplement = new GymWorkoutImplement();
        gymWorkoutImplement.addGymWorkout(date,date,date,EDaysOfTheWeek.Friday,ActivityLocation.Guest_Gym,3,"comments",
                null,null,null,null,null,null,AerobicMachineActivity.AerobicMachine.Elliptical,30,null);


    }

    @Test (enabled = true)
    public void addUser() {
    UserDaoImpl userDaoImpl = new UserDaoImpl();
    userDaoImpl.addUser("henlogin","mypassword","hen","faib","male","address1","address2","Citu",2131,"coun","ff");

    }


    @Test (enabled = true)
    public void login() throws Exception {
        SystemLogin.run("henlogin","mypassword");
    }
}

