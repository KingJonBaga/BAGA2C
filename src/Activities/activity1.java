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
public class activity1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scanner = new Scanner(System.in);
     
     System.out.print("Enter name:");
     String name = scanner.nextLine();
     
     System.out.print("Enter marks in Science: ");
     int science = scanner.nextInt();
     
     System.out.print("Enter marks in History: ");
     int history = scanner.nextInt();
     
     System.out.print("Enter marks in Math: ");
     int math = scanner.nextInt();
     
     System.out.print("Enter marks in Soc: ");
     int soc = scanner.nextInt();
     
     System.out.print("Enter marks in Arts: ");
     int arts = scanner.nextInt();
     
     

     int totalMarks = science + history + math + soc + arts;
     double percentage = totalMarks/5.0;
     

     String remarks;
     if (percentage < 70){
         remarks = "Fail";
     } else if (percentage <= 75){
         remarks = "Poor";
     } else if (percentage <=80){
         remarks = "Fair";
     } else if (percentage <=85){
         remarks = "Good";
     } else if (percentage <= 90){
         remarks = "Very Good";
     } else {
         remarks = "Excellent";
     }
     
     
      System.out.println("\nTotal Marks: " + totalMarks);
      System.out.printf("Total percentage: %.2f\n", percentage);
      System.out.println("Remarks: " + remarks);
      
      
      if (percentage >= 70){
          System.out.println("\nCongrats" + name + "You Passed. ");
      } else {
          System.out.println("\nTry Again" + name + ".");
      }
      
      scanner.close();
     }
     }