package rvt;

import java.util.Scanner;
public class ChapterSixty {
    public static void main(String[] args){
        //TODO: https://chortle.ccsu.edu/javaLessons/chap60/progExercises60.html

        Scanner scanner = new Scanner(System.in);

        System.out.println("Precise, which exercise you would like to run (1-5): ");
        int userChoice = Integer.valueOf(scanner.nextLine());
        
        switch (userChoice) {
            case 1:
                ex1();
                break;
            case 2:
                ex2();
                break;
            case 3:
                ex3();
                break;
            case 4:
                ex4();
                break;
            case 5:
                ex5();
                break;
            default:
                System.out.println("You're trying to perform wrong task...Try again...");
                main(args);
                break;
        }

        scanner.close();
    }
    public static void ex1(){
        //Array Sum
        int[] val = {0, 1, 2 ,3};
        int sumFirst = 0;
        for (int i = 0; i < val.length; i++) {
            sumFirst = sumFirst + val[i];
        //  System.out.println(sumFirst);
        }
        System.out.println(sumFirst);
    }
    public static void ex2(){
        //Two Arrays
        int[] valSecond = {13, -4, 82, 17};
        int[] twice = new int[4];

        System.out.println("Original array: " + valSecond[0] + " " + valSecond[1] + " " + valSecond[2] + " " + valSecond[3]);

        //array object
        twice[0] = valSecond[0] * 2;
        twice[1] = valSecond[1] * 2;
        twice[2] = valSecond[2] * 2;
        twice[3] = valSecond[3] * 2;

        System.out.println("Original array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3]);
    }
    public static void ex3(){
        //Three arrays

        int[] valA = {13, -22, 82, 17};
        int[] valB = {-12, 24, -79, -13};
        int[] sum = new int[4];

        for (int i = 0; i < sum.length; i++) {
            sum[i] = valA[i] + valB[i];
        }
        
    System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
    }
    public static void ex4(){
        //Same Sum
        int[] valAFourth = { 13, -22,  82,  17};
        int[] valBFourth = {  0,   0,   0,   0};

        valBFourth[0] = 25 - valAFourth[0];
        valBFourth[1] = 25 - valAFourth[1];
        valBFourth[2] = 25 - valAFourth[2];
        valBFourth[3] = 25 - valAFourth[3];

        System.out.println( "valA: " + valAFourth[0] + " " + valAFourth[1] + " " + valAFourth[2] + " " + valAFourth[3] );
        System.out.println( "valB: " + valBFourth[0] + " " + valBFourth[1] + " " + valBFourth[2] + " " + valBFourth[3] );
        System.out.println( "sum:  " + (valAFourth[0]+valBFourth[0]) + " " + (valAFourth[1]+valBFourth[1]) + " " + (valAFourth[2]+valBFourth[2]) + " " + (valAFourth[3]+valBFourth[3]) );
   }
    public static void ex5(){
        //Reverse Order
        int[] valFifth = {0, 1, 2, 3};
        int temp;
        System.out.println("Original Array: " + valFifth[0] + " " + valFifth[1] + " " + valFifth[2] + " " + valFifth[3] );
            for (int i = 0; i < valFifth.length / 2; i++) {
                temp = valFifth[i];
                valFifth[i] = valFifth[valFifth.length - 1 - i];
                valFifth[valFifth.length - 1 - i] = temp;
            }
 
        System.out.println("Reversed Array: " + valFifth[0] + " " + valFifth[1] + " " + valFifth[2] + " " + valFifth[3] );

    }
}