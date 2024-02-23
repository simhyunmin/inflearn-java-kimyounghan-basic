package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAge = {15, 17};
        int[] studentGrade = {90, 80};

        for(int i = 0; i < studentNames.length; i ++){
            System.out.println("이름: "+studentNames[i]+" 나이: "+studentAge[i]+" 성적: "+ studentGrade[i]);
        }

        //배열을 사용해서 코드 변경을 최소화하는데는 성공했지만, 한 학생의 데이터가 세 개의 배열에 나누어져 있다.
        //따라서 데이터를 변경할 때 매우 조심해서 작업해야 한다. 예를 들어서 학생 2의 데이터를 제거하려면 각각의 배열마다 학생 2의 요소를
        //정확하게 찾아서 제거해야 한다.
        //그리고 학생의 데이터를 관리하기 위해 3개 배열의 인덱스 순서를 항상 정확하게 맞추어야 한다.
        //이렇게 하면 특정 학생의 데이터를 변경할 때 실수할 가능성이 매우 높다.
    }
}
