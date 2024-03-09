package ch05.sec12;

public enum Week {
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일"),
    SATURDAY("토요일"),
    SUNDAY("일요일");

    final private String date;

    public String getDate(){
        return date;
    }

    private Week(String date){
        this.date = date;
    }
}
