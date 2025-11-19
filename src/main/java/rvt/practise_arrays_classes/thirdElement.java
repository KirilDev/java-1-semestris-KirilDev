package rvt.practise_arrays_classes;

import java.util.Scanner;
import java.util.ArrayList;

public class thirdElement {
    public static void program(String[] args){

        ArrayList<String> nameList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Boolean isTrue = true;
        
        //Implementing that program is asking for user input till it's empty
        while (isTrue) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            nameList.add(name);

            if (name.isEmpty()) {
                isTrue = false;
                System.out.println(nameList.get(2));
                scanner.close();
            }
        }
    }
}
