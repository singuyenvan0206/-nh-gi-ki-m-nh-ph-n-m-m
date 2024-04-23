package org.example;
import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập độ dài cạnh thứ nhất: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập độ dài cạnh thứ hai: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập độ dài cạnh thứ ba: ");
        double c = scanner.nextDouble();


            String triangleType = classifyTriangle(a, b, c);
            System.out.println(triangleType);

    }

    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static String classifyTriangle(double a, double b, double c) {
        if (a == b && b == c) {
            return "Equilateral"; // Tam giác đều
        } else if (a == b || b == c || a == c) {
            return "Isosceles"; // Tam giác cân
        } else if(! isTriangle(a,b,c)){
            return "NotATriangle";
        }
        else {
            return "Scalene"; // Tam giác thường
        }
    }
}
