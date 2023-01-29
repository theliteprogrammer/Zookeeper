import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* read in the number the Collatz Conjecture will start from */
        int number = scanner.nextInt();
        /* print out the first number */
        System.out.print(number + " ");
        /* output the terms */
        while (number != 1) {
            /* if the number is even divide it in half */
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }
            /* print out the next number */
            System.out.print(number + " ");
        }
    }
}
