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

        if (isTriangle(a, b, c)) {
            String triangleType = classifyTriangle(a, b, c);
            System.out.println("Loại tam giác: " + triangleType);
        } else {
            System.out.println("NotATriangle.");
        }
    }

    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static String classifyTriangle(double a, double b, double c) {
        if (a == b && b == c) {
            return "Equilateral"; // Tam giác đều
        } else if (a == b || b == c || a == c) {
            return "Isosceles"; // Tam giác cân
        } 
        else {
            return "Scalene"; // Tam giác thường
        }
    }
}
