/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activities;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class activity4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter Employee Name: ");
            String employeeName = scanner.nextLine();
            
            System.out.print("Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble();
            
            System.out.print("Enter total hours worked this week: ");
            double hoursWorked = scanner.nextDouble();
            
            double grossWage = hourlyRate * hoursWorked;
            double contribution = grossWage * 0.10;
            double netWage = grossWage - contribution;
            
            System.out.println("\nOutput: ");
            System.out.println("----Wage Summary----");
            
            System.out.println("Employee: " + employeeName);
            
            System.out.println("Hourly Rate :₱%.2f%n");
            System.out.printf("Hours Worked: %.0f%n", hoursWorked);
            System.out.printf("Contribution (10%%):₱%.2f%n", contribution);
            
            System.out.println("-------------------------------");
            System.out.printf("Net Weekly Wage:₱%.2f%n", netWage);
        }
    }
}
