package activity;



public enum EDaysOfTheWeek {

    Sunday("Sunday"),
    Monday("Monday"),
    Tuesday("Tuesday"),
    Wednesday("Wednesday"),
    Thursday("Thursday"),
    Friday("Friday"),
    Saturday("Saturday");

    private String eDaysOfTheWeek;

    EDaysOfTheWeek(String day) {
        this.eDaysOfTheWeek = day;
    }

    public String getDay() {
        return eDaysOfTheWeek;
    }
}