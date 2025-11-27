package rvt.ChapterFourtyFour_Exercices;

import java.util.Scanner;

public class MicrovaweMenu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cook time -> ");
        int userInput = Integer.valueOf(scanner.nextLine());
        int userInputLengh = String.valueOf(userInput).length();
        String temp = Integer.toString(userInput);

        System.out.println(userInput);
        System.out.println(userInputLengh);

        if (userInputLengh < 2) {
            System.out.println("Wrong time size...!");
            main(null);
        }
        else if (userInputLengh == 3) {
            StringBuilder sb = new StringBuilder(temp);
            sb.insert(1, ":");
            sb.toString();
            System.out.println(sb + " min");
        }
        else if (userInputLengh == 4){
            StringBuilder sb = new StringBuilder(temp);
            sb.insert(2, ":");
            sb.toString();
            System.out.println(sb + " mins");
        }
    }
}
