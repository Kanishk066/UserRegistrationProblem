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
        if (isValidFirstName && isValidLastName) {
            System.out.println("Valid first name and last name");
        } else if (!isValidFirstName && isValidLastName) {
            System.out.println("Invalid first Name! Please Enter a Valid First Name");
        } else if (isValidFirstName && !isValidLastName) {
            System.out.println("Invalid last Name! Please Enter a Valid Last Name");
        } else {
            System.out.println("Invalid first name and last name!");
        }
    }
}
