/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @Dalwinder singh
 */
import java.util.Scanner;
public class TestUserprofile {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display welcome message
        System.out.println("Welcome to UserProfile Creation");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

  
        String[] genres = {"Action", "Adventure", "Comedy", "Drama", "Fantasy", "Horror"};

      
        System.out.println("Choose your favourite Genre:");
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // Prompt for and read the user's genre choice
        System.out.print("Enter the number of your favourite genre: ");
        int genreChoice = scanner.nextInt();

        // Validate the input and create the user profile
        if (genreChoice > 0 && genreChoice <= genres.length) {
            String favouriteGenre = genres[genreChoice - 1];
            System.out.println("UserProfile Created!");
            System.out.println("Name: " + name + ", Favourite Genre: " + favouriteGenre);
        } else {
            System.out.println("Invalid genre choice. UserProfile not created.");
        }

        scanner.close();
    }
}


