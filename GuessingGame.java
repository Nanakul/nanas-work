import java.util.Scanner;

public class GuessingGame {
  
  public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    int attemptsNum = 0;
    final int maxAttempts = 5;
    int random = 1 + (int) (Math.random() * 100);
    int guess = 0;

    System.out.println("I'm thinking of a number between 1 and 100. Can you guess it in less than 5 tries?");

    while(guess != random && attemptsNum < maxAttempts) {
      guess = console.nextInt();
      attemptsNum++;

      if(guess > random) {
        System.out.println("Gotta think lower!");
      } else if (guess < random) {
        System.out.println("Gotta think higher!");
      } else {
        System.out.println("Congratulations, you win! It took you " + attemptsNum + " attempt(s)");
      }
    }
    if (attemptsNum == maxAttempts)
    System.out.println("You lose! The number was: " + random);
  }
}
