package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
        System.out.println("현재 시간 : " + now.format(dtf));

        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년 후 : " + result1.format(dtf));

        LocalDateTime result2 = now.minusMonths(2);
        System.out.println("2달 전 : " + result2.format(dtf));

        LocalDateTime result3 = now.plusDays(7);
        System.out.println("7일 후 : " + result3.format(dtf));
    }
}
