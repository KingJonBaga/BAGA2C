package AirFare;

import java.util.Scanner;

public class AirFare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter distance in kilometers: ");
        double distance = scanner.nextDouble();
   
        System.out.print("Enter Class (1 for Economy, 2 for Business): ");
        int classChoice = scanner.nextInt();

        double baseFarePerKm;
  
        if (classChoice == 1) {
            baseFarePerKm = 250;
        } else if (classChoice == 2) {
            baseFarePerKm = 500;
        } else {
            System.out.println("Invalid class selection.");
            scanner.close();
            return;
        }

        double totalFare = distance * baseFarePerKm;

        
        if (distance > 1000) {
            totalFare *= 0.90;
        }

        System.out.printf("Total fare: %.2f%n", totalFare);

        scanner.close();
    }
}
