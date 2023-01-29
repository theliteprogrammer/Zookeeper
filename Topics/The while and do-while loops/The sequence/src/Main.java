import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* read in the number of terms */
        int numberOfTerms = scanner.nextInt();
        /* create an array of length: numberOfTerms */
        int[] numbers = new int[numberOfTerms];
        /* a variable to keep track of the element number */
        int index = 0;
        /* read in a sequence of integers */
        if (numberOfTerms <= 100) {
            while(scanner.hasNextInt() && index <= numberOfTerms) {
                int number = scanner.nextInt();
                /* make sure the number does not exceed 30000 */
                if (number <= 30000) {
                    /* store the number in an array with corresponding index number */
                    numbers[index] = number;
                }
                /* increment count by 1 */
                index += 1;
            }
        }

        /* count numbers divisible by 4 */
        int howManyBy4 = 0;
        index = 0;
        while (index < numberOfTerms) {
            /* if the number is divisible by 4 */
            if (numbers[index] % 4 == 0) {
                howManyBy4 += 1;
            }
            index += 1;
        }

        // reset the index to zero
        index = 0;
        int count = 0;

        /* create an array to store them */
        int[] divisible = new int[howManyBy4];
        while (index < numberOfTerms) {
            if (numbers[index] % 4 == 0) {
                divisible[count] = numbers[index];
                count++;
            }
            index += 1;
        }

        /* find the maximum number divisible by 4 */
        index = 1;
        int max = divisible[0]; // initialize max is the first value

        while (index < howManyBy4) {
            if (max < divisible[index]) {
                max = divisible[index];
            }
            index += 1;
        }
        /* print out the maximum */
        System.out.println(max);
    }
}
