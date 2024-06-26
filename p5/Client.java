// Client.java
package p5;

import java.net.*;
import java.rmi.*;
import java.util.*;

public class Client {

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
        try {
            P_Interface obj1 = (P_Interface) Naming.lookup("rmi://localhost:3000/Palindrome");
            Scanner sc = new Scanner(System.in);
            boolean continueP = true;
            while (continueP) {
                System.out.println("\nChoose the type of input");
                System.out.println("1. Integer");
                System.out.println("2. String");
                System.out.println("3. Exit");

                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter an integer: ");
                        int inputint = sc.nextInt();
                        sc.nextLine();
                        boolean isPalindromeint = obj1.palindrome_check(String.valueOf(inputint));
                        System.out.println(inputint + " is a palindrome: " + isPalindromeint);
                        break;
                        
                    case 2:
                        System.out.print("Enter a string: ");
                        String inputString = sc.nextLine();
                        inputString = inputString.toLowerCase();
                        boolean isPalindromeString = obj1.palindrome_check(inputString);
                        System.out.println(inputString + " is a palindrome: " + isPalindromeString);
                        break;

                    case 3:
                        System.out.println("Exiting the program");
                        continueP = false;
                        break;

                    default:
                        System.out.println("Invalid choice !!!");
                        break;
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

    }

}
