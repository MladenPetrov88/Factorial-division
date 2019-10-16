import java.util.Scanner;

public class FactorialDivision {

    public static double factorialDivision(double firstNumber, double secondNumber) {
        double result = findFirstFactorial(firstNumber) / findSecondFactorial(secondNumber);;

        return result;

    }

    public static double findFirstFactorial(double firstNumber) {
        double firstFactorial = 1;

        for (int i = 1; i <= firstNumber; i++) {
            firstFactorial = firstFactorial * i;
        }

        return firstFactorial;
    }

    public static double findSecondFactorial(double secondNumber) {
        double secondFactorial = 1;


        for (int i = 1; i <= secondNumber; i++) {
            secondFactorial = secondFactorial * i;
        }

        return secondFactorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        double result = factorialDivision(firstNumber, secondNumber);
        if (firstNumber >= 0 && secondNumber > 0) {
            System.out.printf("%.2f", result);

        }
    }
}