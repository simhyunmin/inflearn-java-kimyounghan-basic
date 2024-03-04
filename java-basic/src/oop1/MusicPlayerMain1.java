package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean is0n = false;

        is0n = true;
        System.out.println("음악 플레이어를 시작합니다.");

        volume++;
        System.out.println("음악 플레이어 볼륨:"+volume);

        volume--;
        System.out.println("음악 플레이어 볼륨:"+volume);

        System.out.println("음악 플레이어 상태 확인");
        if(is0n){
            System.out.println("음악 플레이어 ON, 볼륨:"+volume);
        }else{
            System.out.println("음악 플레이어 OFF, 볼륨:"+volume);
        }
    }

}
