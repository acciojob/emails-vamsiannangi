package com.driver;
import java.util.*;
public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public Email() {

    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter old password");
        String currentPassword = sc.nextLine();
        int n = newPassword.length();

        if (currentPassword.equals(oldPassword)) {
            if (n >= 8) {
                boolean hasUpperCase = false;
                boolean hasLowerCase = false;
                boolean hasDigit = false;
                boolean hasSpecialChar = false;

                for (int i = 0; i < n; i++) {
                    char ch = newPassword.charAt(i);

                    if (Character.isUpperCase(ch)) {
                        hasUpperCase = true;
                    } else if (Character.isLowerCase(ch)) {
                        hasLowerCase = true;
                    } else if (Character.isDigit(ch)) {
                        hasDigit = true;
                    } else if (!Character.isLetterOrDigit(ch)) {
                        hasSpecialChar = true;
                    }
                }

                if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
                    this.password = newPassword;
                    System.out.println("Password changed successfully.");
                } else {
                    System.out.println("New password does not meet the criteria.");
                }
            } else {
                System.out.println("New password should contain at least 8 characters.");
            }
        } else {
            System.out.println("Old password is incorrect.");
        }
    }
}
