package evenNumber;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Please enter the number: ");
        number = scanner.nextInt();
        int count = 0;
        int sum = 0;
        double average;

        scanner.close();

        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                count++;
                sum += i;
            }
        }
        average = sum / count;
        System.out.println(average);
    }
}
