package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student(); //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;


        Student student2 = new Student(); //x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;
//        Student[] students = {student1, student2};
        Student[]  students = new Student[]{student1, student2};
       //Student[] students = {student1, student2};
        for(int i = 0; i < students.length; i ++){
            Student s = students[i];
            System.out.println("이름:"+s.name +" 나이:"+s.age + " 성적:"+s.grade);

        }

//        for (Student s : students) {
//            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
//
//        }
    }

}


// String은 클래스이다. 따라서 참조형이다. 그런데 기본형처럼 문자 값을 바로 대입할 수 있다.
//문자는 자주 다뤄지기 때문에 자바에서 특별하게 편의 기능을 제공한다.

//참조형 대입은 객체의 위치를 가리키는 참조값만 복사되기 때문에 실제 건물이 복사가 되는 게 아니고,
//같은 건물을 찾아갈 수 있는 방법이 하나 늘어날 뿐 아예 다른 객체로 탄생하는 것이 아니다.
