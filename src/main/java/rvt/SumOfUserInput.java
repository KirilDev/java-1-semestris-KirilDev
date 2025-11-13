package rvt;

import java.util.Scanner;

public class SumOfUserInput {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter numbers: ");
            int number = scanner.nextInt();
            statistics.addNumber(number);

        }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Average: " + statistics.average());

        scanner.close();
    }
}
