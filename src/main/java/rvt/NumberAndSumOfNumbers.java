package rvt;

import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Boolean isItTrue = true;
        int numberOfNumbers = 0;
        int sumOfNumbers = 0;

        while (isItTrue) {
 
        System.out.println("Give a number: ");
        int userNumber = Integer.valueOf(scanner.nextLine());
        
        if (userNumber == 0) {
            System.out.println("Number of numbers: " + numberOfNumbers);
            System.out.println("Sum of numbers: " + sumOfNumbers);
            isItTrue = false;
        }
        sumOfNumbers = sumOfNumbers + userNumber;
        numberOfNumbers++;
        }

        scanner.close();
    }
}
