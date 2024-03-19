package ch12.sec08;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);

        String strWeek = switch(week){
            case Calendar.MONDAY -> "월";
            case Calendar.TUESDAY -> "화";
            case Calendar.WEDNESDAY -> "수";
            case Calendar.THURSDAY -> "목";
            case Calendar.FRIDAY -> "금";
            case Calendar.SATURDAY -> "토";
            case Calendar.SUNDAY -> "일";
            default -> throw new IllegalStateException("Unexpected value: " + week);
        };

        int amPm = now.get(Calendar.AM_PM);
        String strAmPM = switch(amPm){
            case Calendar.AM -> "오전";
            case Calendar.PM -> "오후";
            default -> throw new IllegalStateException("Unexpected value: " + amPm);
        };

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println(year + "년 " + month + "월 " + day + "일 "
                + strWeek + "요일 " + strAmPM + " " + hour + "시 " + minute + "분 " + second + "초");
    }
}
