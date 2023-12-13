import java.util.Scanner;

public class print_double {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter the numbers");
            numbers[i] = input.nextDouble();
        }
        print_num(numbers);
    }

    public static void print_num(double[] numbers) {
        System.out.println("The array contains");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(+numbers[i]);
        }
    }
}
