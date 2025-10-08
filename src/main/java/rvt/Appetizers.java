package rvt;

import java.util.Scanner;

public class Appetizers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ievadi preci: ");
        String productName = scanner.nextLine();

        System.out.print("Ievadi cenu: ");
        double productPrice = 0;
        productPrice = Double.parseDouble(scanner.nextLine());
    

        System.out.println("Ekspress piegāde (0 -> nē; 1 -> jā): ");
        double specialOrder = 0;
        specialOrder = Double.parseDouble(scanner.nextLine());


        payCheckMaker(productName, productPrice, specialOrder);
        scanner.close();
    }

    public static void payCheckMaker(String productName, double productPrice, double specialOrder) {
        double summary = productPrice;
        double standardOrderPrice = 2.00;
        double specialOrderPrice = 3.00;

        System.out.println("Rēķins:");
        System.out.println("  " + productName);

        if (specialOrder == 1) { 
            summary += specialOrderPrice;
            System.out.println("  " + "piegāde: " + specialOrderPrice);
        } else { 
            summary += standardOrderPrice;
            System.out.println("  " + "piegāde: " + standardOrderPrice);
        }
        System.out.println("  " + "kopā: " + summary);
    }
}
