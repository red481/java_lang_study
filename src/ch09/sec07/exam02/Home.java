package ch09.sec07.exam02;

public class Home {
    private RemoteControl rc = new RemoteControl(){
        @Override
        public void turnOn(){
            System.out.println("TV을 켭니다.");
        }

        @Override
        public void turnOff(){
            System.out.println("TV을 끕니다.");
        }
    };

    public void use1(){
        rc.turnOn();
        rc.turnOff();
    }

    public void use2(){
        RemoteControl rc = new RemoteControl(){
            @Override
            public void turnOn(){
                System.out.println("Audio를 켭니다.");
            }

            @Override
            public void turnOff(){
                System.out.println("Audio를 끕니다.");
            }
        };
        rc.turnOn();
        rc.turnOff();
        }

        public void use3(RemoteControl rc){
            rc.turnOn();
            rc.turnOff();
    }
}
