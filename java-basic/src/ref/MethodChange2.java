package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : "+dataA.value);
        System.out.println(dataA);
        changeReference(dataA);
        System.out.println("메서드 호출 전 : "+dataA.value);
    }

    public static void changeReference(Data dataX){
        System.out.println(dataX);
        dataX.value = 20;
    }
}
