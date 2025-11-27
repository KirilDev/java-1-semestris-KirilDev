package rvt.ChapterFourtyFour_Exercices;

import java.util.Scanner;

public class TitleApplier {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        final String mister = "Mr. ";
        final String missis = "Ms. ";

        String[] femaleNameStrings = {"Amy", "Buffy", "Cathy"};
        String[] maleNameStrings = {"Elroy", "Fred", "Graham"};

        while (true) {
            System.out.println("Enter a name: ");
            String userInput = scanner.nextLine();
            
            boolean isFemale = false;
            boolean isMale = false;
            
            if (userInput.trim().isEmpty()) {
                break;
            } 

            for (String name : femaleNameStrings) {
            if (userInput.toLowerCase().startsWith(name.toLowerCase())) {
                System.out.println(missis + userInput);
                isFemale = true;
            }
            }

            for (String name : maleNameStrings) {
            if (userInput.toLowerCase().startsWith(name.toLowerCase())) {
                System.out.println(mister + userInput);
                isMale = true;
            }
            }

            if (!isFemale && !isMale) {
                System.out.println("Name is not found!!!");
            }
            
            
        }
        System.out.println(" ");
    }
}
