package ch12.sec04;

public class InExample {
    public static void main(String[] args) throws Exception {
        int speed = 0;
        int keyCode = 0;

        while(true){
            if(keyCode != 13 && keyCode != 10){ // Enter 키가 아닐 경우
                if(keyCode == 49){ // 1을 읽었을 경우
                    speed++;
                }else if(keyCode == 50){ // 2를 읽었을 경우
                    speed--;
                }else if(keyCode == 51){ // 3을 읽었을 경우
                    break;
                }
                System.out.println("----------------------------");
                System.out.println("1: 증속 | 2: 감속 | 3: 중지");
                System.out.println("현재 속도: " + speed);
                System.out.println("선택 : ");
            }

            keyCode = System.in.read(); // 키보드로부터 입력을 받음
            System.out.println(keyCode);
        }

    }
}
