package ch08.sec04;

import ch07.sec11.Person;

public class Audio implements RemoteControl{

    private int volume;

    @Override
    public void turnOn(){
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff(){
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume(int volume){
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 오디오 볼륨: " + this.volume);
    }

    private int memoryVolume;

    @Override
    public void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리 합니다.");
            memoryVolume = volume;
            setVolume(RemoteControl.MIN_VOLUME);
        }else{
            System.out.println("무음 해제 합니다.");
            setVolume(memoryVolume);
        }
    }
}
