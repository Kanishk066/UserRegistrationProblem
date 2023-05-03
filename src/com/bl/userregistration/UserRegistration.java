package com.bl.userregistration;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();
        boolean isValidFirstName = firstName.matches("[A-Z][a-zA-Z]{2,}");
        System.out.println("Enter your last name: ");
        String lastname = sc.nextLine();
        boolean isValidLastName = lastname.matches("[A-Z][a-zA-Z]{2,}");
        System.out.println("Enter your email:");
        String email = sc.nextLine();
        boolean isValidEmail = email.matches("[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,}){1,2}");

        if (isValidFirstName && isValidLastName && isValidEmail) {
            System.out.println("Valid first name, last name, and email!");
        } else if (!isValidFirstName && isValidLastName && isValidEmail) {
            System.out.println("Invalid first name! Please enter a valid first name that starts with a capital letter and has at least 3 characters.");
        } else if (isValidFirstName && !isValidLastName && isValidEmail) {
            System.out.println("Invalid last name! Please enter a valid last name that starts with a capital letter and has at least 3 characters.");
        } else if (isValidFirstName && isValidLastName && !isValidEmail) {
            System.out.println("Invalid email! Please enter a valid email address that matches the format abc.xyz@bl.co.in.");
        } else if (!isValidFirstName && !isValidLastName && isValidEmail) {
            System.out.println("Invalid first name and last name! Please enter valid names that start with a capital letter and have at least 3 characters.");
        } else if (!isValidFirstName && isValidLastName && !isValidEmail) {
            System.out.println("Invalid first name and email! Please enter a valid first name that starts with a capital letter and has at least 3 characters, and a valid email address that matches the format abc.xyz@bl.co.in.");
        } else if (isValidFirstName && !isValidLastName && !isValidEmail) {
            System.out.println("Invalid last name and email! Please enter a valid last name that starts with a capital letter and has at least 3 characters, and a valid email address that matches the format abc.xyz@bl.co.in.");
        } else {
            System.out.println("Invalid first name, last name, and email! Please enter valid names that start with a capital letter and have at least 3 characters, and a valid email address that matches the format abc.xyz@bl.co.in.");
        }
    }
}
