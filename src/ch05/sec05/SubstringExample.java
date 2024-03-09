package ch05.sec05;

public class SubstringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6);
        String secondNum = ssn.substring(7);

        System.out.println("주민등록번호 앞자리는 " + firstNum + " 입니다.");
        System.out.println("주민등록번호 뒷자리는 " + secondNum + " 입니다.");
    }
}
