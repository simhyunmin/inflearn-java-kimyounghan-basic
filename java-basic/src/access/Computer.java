package access;

public class Computer {
    private int volt;

    public Computer(int volt) {
        this.volt = volt;
    }

    void voltUp(){
        if(volt >= 100){
            System.out.println("전력 과다 공급");
        }else{
            volt += 10;
            System.out.println("전력 10 증가");
        }
    }

    void voltDown(){
        volt-=10;
    }
    void showVolt(){
        System.out.println("현재 전력: "+volt);
    }
}
