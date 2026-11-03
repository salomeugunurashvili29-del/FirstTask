package org.example;

public class Main {
    public static void main(String[] args) {
//task 1
        double productPrice = 150;
        double finalPrice;

        if (productPrice >= 100) {
            finalPrice = productPrice - (productPrice * 10 / 100);
        } else {
            finalPrice = productPrice;

        }
        System.out.println(" ფასი: " + finalPrice + " ლარი");

        //task 2
        String correctUsername = "admin";
        String correctPassword = "12345";

        String username = "admin";
        String password = "12345";

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password");
        }


//task 3
        int[] testResults = {1, 0, 1, 1, 0};

        int passed = 0;
        int failed = 0;

        for (int i = 0; i < 5; i++) {

            if (testResults[i] == 1) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);

//task 4
        String status = "PROCESccsdSING";

        switch (status) {
            case "NEW":
                System.out.println("Order received");
                break;

            case "PROCESSING":
                System.out.println("Order is being prepared");
                break;

            case "SHIPPED":
                System.out.println("Order is on the way");
                break;

            case "DELIVERED":
                System.out.println("Order delivered");
                break;

            default:
                System.out.println("Unknown status");
        }

        // task 5
        String text = "გამარჯობა";

        int count = 0;


        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (letter == 'ა' || letter == 'ე' || letter == 'ი' ||
                    letter == 'ო' || letter == 'უ') {
                count++;
            }
        }

        System.out.println("ხმოვანი ასოების რაოდენობა: " + count);


        int length = text.length();

        System.out.println("სტრინგის სიგრძე: " + length);


        if (length % 2 == 0) {
            System.out.println("ლუწი");
        } else {
            System.out.println("კენტი");
        }
    }

    }

