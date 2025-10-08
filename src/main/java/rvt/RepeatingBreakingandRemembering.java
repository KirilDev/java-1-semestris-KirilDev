package rvt;

import java.util.Scanner;

public class RepeatingBreakingandRemembering {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int evenNumbers = 0;
        int oddNumbers = 0;
        int sum = 0;
        int count = 0;
        
        System.out.println("Give numbers: ");
        while (true) {
            int userNumber = Integer.valueOf(scanner.nextLine());
            if (userNumber == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            sum += userNumber;
            count++;
            if (userNumber % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        float average = (float) sum / count;
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);

        scanner.close();
    }
}
