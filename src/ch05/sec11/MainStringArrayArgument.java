package ch05.sec11;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("프로그램 입력값이 부족");
            System.exit(0);
        }

        int intNum1 = Integer.parseInt(args[0]);
        int intNum2 = Integer.parseInt(args[1]);

        System.out.println("두 수의 합은 " + intNum1 + intNum2 + " 입니다.");
    }
}
