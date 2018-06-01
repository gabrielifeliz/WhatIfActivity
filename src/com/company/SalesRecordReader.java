package com.company;

import java.util.Scanner;

public class SalesRecordReader {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter customer ID: ");
        int customerID = keyboard.nextInt();

        System.out.print("Enter customer name: ");
        // Clean up any remaining newline
        // Otherwise, the program will skip the input of customer name
        keyboard.nextLine();
        String customerName = keyboard.nextLine();

        System.out.print("Enter sales amount: ");
        double salesAmount = keyboard.nextDouble();

        System.out.print("Enter tax code: ");
        // Clean up any remaining newline
        // Otherwise, the program will skip the input of tax code
        keyboard.nextLine();
        String taxCode = keyboard.nextLine();

        // Initialize total amount due to zero
        double totalAmountDue = 0;

        if (taxCode.equalsIgnoreCase("NPF")) {
            // Don't charge tax if tax code equals to NPF
            totalAmountDue = salesAmount;
        } else if (taxCode.equalsIgnoreCase("BIZ")) {
            // Add a tax charge of 4.5% from sales amount to total amount due
            totalAmountDue = salesAmount + (salesAmount * 0.045);
        } else if (taxCode.equalsIgnoreCase("NRM")) {
            // Add a tax charge of 6% from sales amount to total amount due
            totalAmountDue = salesAmount + (salesAmount * 0.06);
        }

        // Display sales report
        System.out.println();
        System.out.println("Customer ID: "+ customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Sales Amount: $" + salesAmount);
        System.out.println("Tax Code: " + taxCode);
        System.out.println("Total Amount Due: " + totalAmountDue);

    }
}
