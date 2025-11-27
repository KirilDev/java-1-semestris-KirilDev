package rvt.ChapterFourtyFour_Exercices;
import java.util.Scanner;

public class NameEcho {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
                
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        scanner.close();
        
        userName = userName.trim();
        int indexOfSpace = userName.indexOf(' ');
        
        if (indexOfSpace >= 0 && indexOfSpace < userName.length() - 1) {
            String before = userName.substring(0, indexOfSpace + 1);
            String after = userName.substring(indexOfSpace + 1).toUpperCase();
            userName = before + after;
        }

        System.out.println(userName);
    }
}
