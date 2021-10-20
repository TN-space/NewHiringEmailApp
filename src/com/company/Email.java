package com.company;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String pw;
    private String dep;
    private double mailBoxCap;
    private String alEmail;

    // Constructor to receive first and last name
    public Email(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;

        getDep();
        mailBoxCap = setCap();
    }

    // set dep - department
    private void getDep() {
        System.out.print("Enter department: ");
        Scanner input = new Scanner(System.in);
        dep = input.next();
    }

    // Generate random password

    // Set mailbox cap
    private double setCap() {
        System.out.print("Enter mailbox capacity: ");
        Scanner input = new Scanner(System.in);
        double cap = input.nextDouble();
        return cap;
    }

    // Change password
}
