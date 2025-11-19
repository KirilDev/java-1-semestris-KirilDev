/* 
 * This is Java program that allows to make a simple drawing by initlizing an amount of starts at every line.
*/


package rvt.practise_arrays_classes;

import java.util.Scanner;

public class drawUsingNumbers {
    public static void program(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of lines you want to see: ");
        int size = scanner.nextInt();

        int sizeStore[] = new int[size];

        for (int i = 0; i < sizeStore.length; i++) {
            System.out.println("Enter the number of " + (i + 1) + " element: ");
            sizeStore[i] = scanner.nextInt();
        }
        scanner.close();
        printStars(sizeStore);

    }
    public static void printStars(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
