package Lab2;
import java.util.Scanner;

public class Lab2_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputWidth = scanner.nextDouble();
        double inputHeight = scanner.nextDouble();

        Rectangle rect = new Rectangle(inputWidth, inputHeight);

        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());

        scanner.close();
    }
}

class Rectangle {
    double Width;
    double Height;

    Rectangle(double width, double height) {
        Width = width;
        Height = height;
    }

    double getArea() {
        return Width * Height;
    }

    double getPerimeter() {
        return 2 * (Width + Height);
    }
}