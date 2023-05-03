package com.bl.userregistration;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();
        boolean isValid = firstName.matches("[A-Z][a-zA-Z]{2,}");
        if (isValid){
            System.out.println("Name is Valid");
        }
        else
            System.out.println("Name is Invalid!");
    }
}
