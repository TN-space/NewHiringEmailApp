package com.company;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String dep;
    private double mailBoxCap;
    private String altEmail;
    private String companySuffix = ".abcompany.com";

    // Constructor to receive first and last name
    public Email(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;

        // Call method asking for department
        this.dep = getDep();
        // Call method asking for box cap
        this.mailBoxCap = setCap();
        // Call method to generate random pw
        this.password = setInitialPW(7);
        // Combine element to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + dep + companySuffix;
        System.out.println(email);
    }

    // set dep - department
    private String getDep() {
        System.out.print("Enter department: ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    // Generate random password
    private String setInitialPW(int length) {
        String pwSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] pw =  new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * pwSet.length());
            pw[i] = pwSet.charAt(rand);
        }
        return new String(pw);
    }

    // Set mailbox cap
    private double setCap() {
        System.out.print("Enter mailbox capacity: ");
        Scanner input = new Scanner(System.in);
        double cap = input.nextDouble();
        return cap;
    }

    // Change password
    public void changePW() {
        System.out.print("Enter new password: ");
        Scanner input = new Scanner(System.in);
        this.password = input.next();
    }

    // Set alternative email
    public void setAltEmail(String altE) {
        this.altEmail = altE;
    }

    public String getAltEmail() {return altEmail;}
    public double getMailBoxCap() {return mailBoxCap;}
    public String getPassword() {return password;}

    // show all relevant data (name, company email, mailbox capacity)
    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nEmail: " + email +
                "\nMailbox capacity: " + mailBoxCap + "mb." +
                "\nPassword: " + password;
    }
}
