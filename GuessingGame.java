import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    userPrompt();
    playGame();
    tryAgain();
  }

  //This method prompts the user to think of a number.
  public static void userPrompt() {

    //Prompt the user to think of a number
    System.out.println("I'm thinking of a number between 1 and 100. Can you guess it in less than 5 tries?");
  }

  //This method starts the game.
  public static void playGame() {
      
    //Import the scanner
    Scanner console = new Scanner(System.in);
    
    //Set Parameters
    int attemptsNum = 0;
    final int maxAttempts = 5;
    int random = 1 + (int) (Math.random() * 99);
    int guess = 0;
  
    //Write a while statement that says "while guess DOES NOT = the random parameter AND
    //the number of attempts parameter is less than the max attempts parameter.
    while(guess != random && attemptsNum < maxAttempts) {
      guess = console.nextInt();
      attemptsNum++;

    //Write an IF statement for the following scenarios:
    //1.)If guess is greater than random, print guess lower.
    //2.)If guess is less than random, print guess higher.
    //3.)Else You won in X amount of tries!
      if(guess > random) {
        System.out.println("Gotta think lower!");
      } else if (guess < random) {
        System.out.println("Gotta think higher!");
      } else {
        System.out.println("Congratulations, you win! It took you " + attemptsNum + " attempt(s)");
      }
    }
    //Write an IF statement that says if their number of attempts is
    //equal to the max number of tries, they lose automatically and the
    //random number is printed.
    if (attemptsNum == maxAttempts)
    System.out.println("You lose! The number was: " + random);
  }
  
  //This method allows the user to try again
  public static void tryAgain() {

    //Set parameters
    Scanner console = new Scanner(System.in);
    String playAgain;
    boolean yn;

    System.out.println("Would you like to play again? Y/N?");

    //Write a while statement that allows the user to choose whether or
    //not they want to play again.
    while(true) {
      playAgain = console.nextLine().trim().toLowerCase(); //trim gets rid of excess whitespace. and using toLowerCase will always convert their answer to one that isn't case sensitive.
      if(playAgain.equals("y")) {
        yn = true;
        break; //Using break to jump out of loop if it meets a requirement.
      } else if(playAgain.equals("n")) {
        yn = false;
        break; //Using break to jump out of loop if it meets a requirement.
      } else {
        System.out.println("Sorry, I didn't catch that. Please answer y/n");
      }
    }

    //Write an IF statement that says if boolean variable yn is true, restart all methods.
    //IF false, then byebye xD
    if(yn) {
      userPrompt();
      playGame();
      tryAgain();
    } else {
      System.out.println("Thanks for playing!");
    }
  }
}
