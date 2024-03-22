package com.operation.calculator;
 import java.util.*;
public class Opertion {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Welcome to the Calculator!");

     while (true) {
         System.out.println("\nChoose an operation:");
         System.out.println("1. Addition (+)");
         System.out.println("2. Subtraction (-)");
         System.out.println("3. Multiplication (*)");
         System.out.println("4. Division (/)");
         System.out.println("5. Exit");

         System.out.print("Enter your choice: ");
         int choice = sc.nextInt();

         if (choice == 5) {
             System.out.println("Exiting Calculator. Goodbye!");
             break;
         }

         System.out.print("Enter the first number: ");
         double num1 = sc.nextDouble();

         System.out.print("Enter the second number: ");
         double num2 = sc.nextDouble();
         double result;
         
         switch (choice) {
         case 1:
             Addition addition = new Addition();
               result =addition.add(num1, num2);
               System.out.println("result:"+ result);
             break;
         case 2:
             Subtraction sub = new Subtraction();;
               result=sub.sub(num1, num2);
               System.out.println("result:"+ result);
             break;
         case 3:
             Multiplication multipy = new Multiplication();
               result=multipy.multiply(num1,num2);
               System.out.println("result:"+ result);
             break;
         case 4:
             Division div = new Division();
               result=div.div(num1,num2);
               System.out.println("result:"+ result);
             break;
         default:
             System.out.println("Invalid choice! Please choose again.");
     }
   
     }
     sc.close();
 }
}
