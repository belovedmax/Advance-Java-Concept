import java.util.Scanner;
public class ExceptionalHanding {
    public static int quotient(int numerator, int denominator) {
        return numerator/denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numerator:");
        int numerator = scanner.nextInt();

        System.out.println("Enter the denominator:");
        int denominator = scanner.nextInt();

        int result = quotient(numerator, denominator);
        System.out.printf("%n Result: %d / %d = %d%n", numerator,denominator,result);


    }

}
