package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

//        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200;
//        speaker.showVolume();
        //volume을 private으로 선언했기 때문에 외부에서 직접 접근하지 못한다.
    }
}


//
//private: 모든 외부 호출을 막는다
//default(package-private): 같은 패키지안에서 호출은 허용한다.
//protected:같은 패키지 안에서 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
//public:모든 외부 호출을 허용한다.
