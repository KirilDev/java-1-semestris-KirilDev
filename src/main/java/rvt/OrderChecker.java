package rvt;

import java.util.Scanner;
public class OrderChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int screwDiscount = 5;
        final int nutDiscount = 3;
        final int washerDiscount = 1;

        System.out.print("Skrūvju daudzums: ");
        int screws = Integer.valueOf(scanner.nextInt());
        
        System.out.print("Uzgriežņu daudzums: ");
        int nuts = Integer.valueOf(scanner.nextInt());
        
        System.out.print("Paplāksņu daudzums: ");
        int washers = Integer.valueOf(scanner.nextInt());
        
        Checker(screws, nuts, washers, screwDiscount, nutDiscount, washerDiscount);
        scanner.close();
    }
    public static void Checker(int screw, int nut, int washer, int screwDiscount, int nutDiscount, int washerDiscount ){
        if (nut > screw){
            System.out.println("Parpaudi pasutijumu: Par maz uzgriežņu...");
        }
        else if (washer < screw){
            System.out.println("Parpaudi pasutijumu: Par maz papkāksņu...");
        }
        else {
            int result = (screw * screwDiscount) + (nut * nutDiscount) + (washer * washerDiscount);
            System.out.println(result);
        }
    }
}
