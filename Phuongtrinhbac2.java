public class QuadraticEquationSolver {

    public static void main(String[] args) {
        // Giả sử a, b, và c là các hệ số của phương trình bậc hai
        double a = 1; // Ví dụ: x^2
        double b = 5; // Ví dụ: + 5x
        double c = 6; // Ví dụ: + 6

        // Tính delta (b^2 - 4ac)
        double delta = b * b - 4 * a * c;

        // Kiểm tra nghiệm của phương trình
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt: x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: x = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }
}
