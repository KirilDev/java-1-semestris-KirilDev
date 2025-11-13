package rvt;
import java.util.Scanner;

public class SumOfUserInput {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter numbers (max 5): ");
        int limit = 5;
        while (scanner.hasNextInt() && statistics.getCount() < limit) {
            int number = scanner.nextInt();
            statistics.addNumber(number);
        }
        
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Average: " + statistics.average());
        
        scanner.close();
    }

    public static class Statistics {
        private int count;
        private int counter;

        public Statistics() {
            this.count = 0;
            this.counter = 0;
        }

        public void addNumber(int number) {
            count = count + number;
            counter++;
        }

        public int getCount() {
            return counter;
        }

        public int sum() {
            return count;
        }

        public double average() {
            return (double) count / counter;
        }
    }
}
