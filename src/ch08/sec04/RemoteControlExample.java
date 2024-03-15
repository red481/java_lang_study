package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {

        RemoteControl rc = new Television();

        rc.turnOn();
        rc.setVolume(7);
        rc.turnOff();

        rc.setMute(true);
        rc.setMute(false);

    }
}
