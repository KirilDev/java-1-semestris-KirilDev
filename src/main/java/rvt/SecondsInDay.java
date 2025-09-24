package rvt;

import java.util.Scanner;
public class SecondsInDay {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of the days: ");
        int userResult = Integer.valueOf(scanner.nextLine());
        scanner.close();
        calculation(userResult);
    }
    public static void calculation(Integer amount){
        int result = amount * 24 * 60 * 60;
        System.out.println(result);
    }
}
