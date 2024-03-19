/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bogoley_hometask2;

/**
 *
 * @author beb19
 */
import java.util.Scanner;

public class Bogoley_HomeTask2 {
    public static void main(String[] args) {
        TelephoneManager manager = new TelephoneManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bogoley Bogdan Evgenyevich, Variant 2, Group RIBO-01-22");
            System.out.println("Enter command number:");
            System.out.println("1. Add new telephone");
            System.out.println("2. Delete my the serial number");
            System.out.println("3. Delete all telephones");
            System.out.println("4. Get out");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter series:");
                    String model = scanner.nextLine();
                    System.out.println("Enter serial number:");
                    String serialNumber = scanner.nextLine();
                    System.out.println("Enter color:");
                    String color = scanner.nextLine();
                    System.out.println("Is it a mobile phone? (true/false):");
                    boolean isMobile = scanner.nextBoolean();
                    manager.addTelephone(new Telephone(model, serialNumber, color, isMobile));
                    break;
                case 2:
                    System.out.println("Enter serial number to remove:");
                    String serialToRemove = scanner.nextLine();
                    manager.removeTelephone(serialToRemove);
                    break;
                case 3:
                    manager.removeAllTelephones();
                    break;
                case 4:
                    System.out.println("Shut down.");
                    return;
                default:
                    System.out.println("You entered an invalid command number.");
            }
        }
    }
}
