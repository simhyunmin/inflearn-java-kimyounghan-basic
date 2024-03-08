package static3;

public class MathArrayUtils {

    private MathArrayUtils() {
        System.out.println("인스턴스 생성 불가");
    }

    static int sum(int[] array){
        int sum = 0;
        for(int s : array){
            sum += s;
        }

        return sum;
    }
    static double average(int[] array){
        int sum = sum(array);
        double avg = sum / (double)array.length;
        return avg;
    }

    static int min(int[] array){
        int min = array[0];
        for(int s : array){
            if(min > s){
                min = s;
            }
        }
        return min;
    }

    static int max(int[] array){
        int max = array[0];
        for(int s : array){
            if(max < s){
                max = s;
            }
        }
        return max;
    }
}
