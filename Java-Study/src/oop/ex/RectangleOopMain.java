package oop.ex;

import java.util.Scanner;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);

        System.out.print("가로의 길이를 입력하세요: ");
        rectangle.width = scanner.nextInt();
        System.out.print("세로의 길이를 입력하세요: ");
        rectangle.height = scanner.nextInt();

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.isSquare();
    }
}
