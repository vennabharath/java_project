import java.util.Scanner;

public class fibonacci_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of numbers you want to see: ");
        int num = input.nextInt();

        System.out.println("Enter the " + num + " numbers now");

        int n = 0;
        int p = 0;
        int array_fib[] = new int[num];
        for (int i = 0; i < num; i++) {

            if (i == 1) {
                n = n + 1;
            }
            n = p + n;

            array_fib[i] = n;

            if (i <= 2) {
                p = n;
            } else {
                p = array_fib[i - 1];
            }

            System.out.println(+array_fib[i] + "\t");
            if (i >= 2) {
                double golden_ratio = (array_fib[i] / array_fib[i - 1]);
                System.out.println(" the golden ratio is: " + golden_ratio);
            }

            if (i == 1) {
                p = 0;
            }

        }
        av_array(array_fib);
    }

    public static void av_array(int[] array_of_num) {
        int sum = 0;

        for (int i = 0; i < array_of_num.length; i++) {
            sum = sum + array_of_num[i];
        }
        System.out.println("The sum of numbers is: \n" + sum);
        double avg = (sum / array_of_num.length);
        System.out.println("The average of numbers is: " + avg);

    }
}
