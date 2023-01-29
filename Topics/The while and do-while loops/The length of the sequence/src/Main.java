import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* variable to count the number of integers */
        int count = 0;
        int value = 1;
        /* read a sequence of non-negative integers */
        while (scanner.hasNextInt() && value != 0) {
            /* store the integers */
            value = scanner.nextInt();
            if (value != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}