package access;

public class MaxCounter {
    int count;
    int max;

    MaxCounter(int max){
        this.max = max;
    }

    void increment() {
        if (count < max) {
            count++;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    int getCount(){
        return count;
    }
}
