package oop1;

public class RectangleOopMain {
    int width;
    int height;
     void showPerimeter(){
        System.out.println("둘레 길이: "+ 2*(width*height));
    }

    void showSquareCheck(){
        System.out.println("정사각형 여부:"+(width == height));
    }

    void showArea(){
        System.out.println("넓이: "+width*height);
    }

}
