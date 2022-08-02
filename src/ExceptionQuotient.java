import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionQuotient {


    public static int quotient(int numerator, int denominator)
            //throws ArithmeticException
    {
        return numerator / denominator;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {

                System.out.println("Enter the numerator:");
                int numerator = scanner.nextInt();

                System.out.println("Enter the denominator:");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%n Result: %d / %d = %d%n", numerator, denominator, result);

                continueLoop = false;}

            catch (InputMismatchException inputMismatchException)
            {
                System.err.printf("%n Exception : %s%n, InputMismatchException", inputMismatchException);
                scanner.nextLine();
                System.out.printf("You must enter a integer. please try again. %n%n");

            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%n Exception: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denomination. please try again. %n%n");
            }
        }
        while (continueLoop);
        }
    }
