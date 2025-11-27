package rvt.ChapterFourtyFour_Exercices;
import java.util.Scanner;

public class charAtExercise {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
    
       System.out.println("Enter a string: ");
       String userInput = scanner.nextLine();

       scanner.close();

       for (int i = 0; i < userInput.length(); i++) {
        System.out.println(userInput.charAt(i));
       }
    }
}
