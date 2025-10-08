package rvt;

import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        
        System.out.println("First number? : ");
        int firstNumber = Integer.valueOf(scanner.nextLine());


        System.out.println("Second number? : ");
        int secondNumber = Integer.valueOf(scanner.nextLine());

        scanner.close();

        for (int i = firstNumber; i <secondNumber; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
