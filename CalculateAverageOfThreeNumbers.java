import java.util.Scanner;

public class CalculateAverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.printf("The average of %.2f, %.2f, and %.2f is: %.2f%n", num1, num2, num3, average);
    }
}