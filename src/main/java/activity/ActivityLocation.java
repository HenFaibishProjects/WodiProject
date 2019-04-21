package activity;

public enum ActivityLocation {

        Home_Gym("Home_Gym"),
        Guest_Gym("Guest_Gym"),
        MA_home("MA_home"),
        MA_guest("MA_guest"),
        OutSide("OutSide");

        private String activityLocation;

    ActivityLocation(String location) {
            this.activityLocation = location;
        }

        public String getDay() {
            return activityLocation;
        }
    }

