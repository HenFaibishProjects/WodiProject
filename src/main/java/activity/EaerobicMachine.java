package activity;



public enum EaerobicMachine {

    Sunday("Sunday"),
    Monday("Monday"),
    Tuesday("Tuesday"),
    Wednesday("Wednesday"),
    Thursday("Thursday"),
    Friday("Friday"),
    Saturday("Saturday");

    private String EDaysOfTheWeek;

    EaerobicMachine(String day) {
        this.EDaysOfTheWeek = day;
    }

    public String getDay() {
        return EDaysOfTheWeek;
    }
}