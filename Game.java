/*

A number-guessing game.

*/

import java.util.Scanner;
import java.util.Random;

public class Game {
  public static void main(String[] args){
    System.out.println("Hello, and welcome to the Guessing Game!");
    System.out.println("What is your name?");
    
    Scanner input = new Scanner(System.in);

    String name = input.nextLine();

    System.out.println("Nice to meet you, " + name + "! Let's play!");

    System.out.println("I'm thinking of a number between 1 and 100.");

    Random rand = new Random();
    int number = rand.nextInt(100);
    int guesses = 0;

    System.out.println("Here is the number: " + number);

    System.out.println("Can you guess the number? Type your guess.");

    while (true) {
      int guess;
      try {
        guess = input.nextInt();
      } catch(InputMismatchException e) {
        String bad_input = input.next();
        System.out.println("Please type a number.");
        continue;
      }

      if (guess < 1 || guess > 100) {
        System.out.println(guess + " is not between 1 and 100. Please try again.");
        continue;
      }

      guesses = guesses + 1;

      if (guess < number) {
        System.out.println("Too low. Try higher?");

      } else if (guess > number) {
        System.out.println("Too high. Try lower?");

      } else {
        System.out.println("You got it! Nice work, " + name + "!");
        System.out.println("You guessed the number in " + guesses + " tries.");

        break;
      }
    }
  }
}
}

}
