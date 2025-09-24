package rvt;

import java.util.Scanner;

public class OrderChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cena ar atlaidi
        final int screwDiscount = 5;
        final int nutDiscount = 3;
        final int washerDiscount = 1;

        System.out.print("Skrūvju daudzums: ");
        int screws = Integer.valueOf(scanner.nextInt());

        System.out.print("Uzgriežņu daudzums: ");
        int nuts = Integer.valueOf(scanner.nextInt());

        System.out.print("Paplāksņu daudzums: ");
        int washers = Integer.valueOf(scanner.nextInt());

        // Dodisim funkcijai Checker informaciju par lielotaja pasutujumu un cenas par
        // precem.
        Checker(screws, nuts, washers, screwDiscount, nutDiscount, washerDiscount);
        scanner.close();
    }

    public static void Checker(int screw, int nut, int washer, int screwDiscount, int nutDiscount, int washerDiscount) {
        if (nut > screw) {
            System.out.println("Parpaudi pasutijumu: Par maz uzgriežņu...");
            System.out.println(" ");
            OrderChecker.main(null);
        } else if (washer < screw) {
            System.out.println("Parpaudi pasutijumu: Par maz papkāksņu...");
            System.out.println(" ");
            OrderChecker.main(null);
        } else {
            // Viss summejam un iedosim lelotaju rezultats
            int result = (screw * screwDiscount) + (nut * nutDiscount) + (washer * washerDiscount);
            System.out.println(result);
        }
    }
}
