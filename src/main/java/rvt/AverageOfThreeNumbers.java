package rvt;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("Give first number: ");
                numbers[i] = scanner.nextInt();
            }
            if (i == 1) {
                System.out.println("Give second number: ");
                numbers[i] = scanner.nextInt();
            }
            if (i == 2) {
                System.out.println("Give third number: ");
                numbers[i] = scanner.nextInt();
            }
        }
        int length = numbers.length;
        float average, sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        average = sum / length;
        System.out.println(average);
        scanner.close();

    }
}
