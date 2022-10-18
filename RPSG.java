package RockPaperScissorsGame;

import java.util.Random;
import java.util.Scanner;

public class RPSG {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
            String playerMove = scan.next();
            boolean flag = true;

            if (playerMove.equals("r") || playerMove.equals("rock")) {
                playerMove = ROCK;
            } else if (playerMove.equals("p") || playerMove.equals("paper")) {
                playerMove = PAPER;
            } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
                playerMove = SCISSORS;
            } else {
                System.out.println("Invalid Input.Try Again...");
                flag = false;
            }


            Random random = new Random();
            int computerRandomNumber = random.nextInt(3);
            String computerMove = "";

            switch (computerRandomNumber) {
                case 0:
                    computerMove = ROCK;
                    break;
                case 1:
                    computerMove = PAPER;
                    break;
                case 2:
                    computerMove = SCISSORS;
                    break;
            }

            if (flag) {
                System.out.printf("The computer chose %s.%n", computerMove);
            }

            if (playerMove.equals(ROCK) && computerMove.equals(SCISSORS) ||
                    (playerMove.equals(PAPER) && computerMove.equals(ROCK) ||
                            (playerMove.equals(SCISSORS) && computerMove.equals(PAPER)))) {
                System.out.println("You win.");
                break;
            } else if ((playerMove.equals(SCISSORS) && computerMove.equals(ROCK) ||
                    (playerMove.equals(ROCK) && computerMove.equals(PAPER) ||
                            (playerMove.equals(PAPER) && computerMove.equals(SCISSORS))))) {
                System.out.println("You lose.");
                break;
            }else{
                System.out.println("This game was a draw.");
                break;
            }


        }


    }
}
