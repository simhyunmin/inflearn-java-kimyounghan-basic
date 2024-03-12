package access;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer1 = new Computer(80);
        System.out.println("요구되는 전력량 100까지 올려주십시오");
        computer1.voltUp();
        computer1.voltUp();
        computer1.voltUp();

       // computer1.volt = 200;
    }
}
