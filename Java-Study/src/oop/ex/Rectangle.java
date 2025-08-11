package oop.ex;

public class Rectangle {
    int width;
    int height;


    void calculateArea() { //넓이 메소드
        int area = width * height;
        System.out.println("넓이: " + area);
    }
    void calculatePerimeter() { // 둘레 길이 메소드
        int perimeter = 2 * (width + height);
        System.out.println("둘레 길이: "+ perimeter);
    }
    void isSquare() {//정사각형 메소드
        boolean square;
        if(width == height){
            square = true;
            System.out.println("정사각형 여부: "+square);
        }
        else{
            square = false;
            System.out.println("정사각형 여부: "+square);
        }
    }
}

