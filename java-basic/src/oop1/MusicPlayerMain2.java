package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);
    }
    static void on(MusicPlayerData data){
        data.is0n = true;
        System.out.println("음악 플레이어를 시작합니다.");

    }
    static void off(MusicPlayerData data){
        data.is0n = false;
        System.out.println("음악 플레이어를 시작합니다.");

    }
    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 볼륨:"+data.volume);
    }
    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 볼륨:"+data.volume);
    }
    static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if(data.is0n){
            System.out.println("음악 플레이어 ON, 볼륨:"+data.volume);
        }else{
            System.out.println("음악 플레이어 OFF, 볼륨:"+data.volume);
        }
    }
}
