 package com.java.games;

//import java packages
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int randomNo = r.nextInt(100) + 1;
        int userInput,choice,attempts = 0;
        
       // Display welcome message and game instructions
        System.out.println("welcome to the number guessing game!!!!!");
        System.out.println("You have to guess a number between 1 to 100");
        
        System.out.println("You have two options to play the game:");
        System.out.println("Either you can guess the number in a limited number of attempts or you can guess the number until you get it right.\n");
        
        // Display options for the game mode
        System.out.println("[--------------------------------]");
        System.out.println("Press 1 for limited attempts");
        System.out.println("Press 2 for unlimited attempts");
        System.out.println("[--------------------------------]\n");

        // Get user's choice for the game mode
        System.out.print("Enter your choice (1 or 2): ");
        choice = s.nextInt();

         // Validate the choice
        if(choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Please restart the game and choose either 1 or 2.");
            return; // Exit if the choice is invalid
        }
   
       
        while(true)
        {
           
            System.out.print("Enter any number (1 to 100) :");
            userInput = s.nextInt();

            if(userInput == randomNo){
                System.out.println("congratulations! You guessed the number correctly.\n");
                break;
            }else if(userInput < randomNo){
                System.out.println("Your guess is too low. Try again.\n");
            }
            else if(userInput > randomNo){
                System.out.println("Your guess is too high. Try again.\n");
            }else{
                System.out.println("Invalid input. Please enter a number between 1 and 100.\n");
            }
            
             // Check if the user has chosen the limited attempts mode
             if(choice == 1){
                attempts++;
                // Check if the user has used all attempts
                if(attempts == 5){
                    System.out.println("\nYou have used all your attempts.\nThe correct number was: " + randomNo);
                    break;
                } else {
                    System.out.println("You have " + (5 - attempts) + " attempts left.\n");
                }
             }   
        }
        
          
        System.out.println("\nThank you for playing the game!");
        
       
    }
}
