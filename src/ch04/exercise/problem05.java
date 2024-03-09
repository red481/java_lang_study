package ch04.exercise;

public class problem05 {
    public static void main(String[] args) {
         int x = 1, y = 1;

        System.out.println("****4x + 5y = 60 란 식이 주어질 때  x와 y의 해는? x와 y는 10 이하의 자연수이다.****");
         for(x = 1; x <= 10; x++){
             int isY = 60 - (4 * x);
             if(isY % 5 == 0){
                 System.out.println("(" + x + ", " + isY / 5 + ")");
             }
         }

        System.out.println("프로그램 종료");
    }
}
