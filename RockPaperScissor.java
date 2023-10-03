import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    private static String playerChoice;
    private String computerChoice;

    public RockPaperScissor() {
        System.out.println("Welcome to Rock Paper Scissor Lizard Spock.");
    }
    
    public void getPlayerChoice() {
        Scanner choice = new Scanner(System.in);
        System.out.println("What would you like to choose?");
        playerChoice = choice.nextLine();
        String str;
        str = playerChoice.substring(0, 1).toUpperCase();
        playerChoice = str + playerChoice.substring(1);
        
        while (!playerChoice.equalsIgnoreCase("Rock")
        && !playerChoice.equalsIgnoreCase("Paper")
        && !playerChoice.equalsIgnoreCase("Scissors")
        && !playerChoice.equalsIgnoreCase("Lizard")
        && !playerChoice.equalsIgnoreCase("Spock")
        && !playerChoice.equalsIgnoreCase("Done")){
            System.out.println("Incorrect response. Please choose Rock, Paper, Scissors, Lizard, or Spock");
            playerChoice = choice.nextLine();
        }
    }

    public void getComputerChoice() {
        Random rand = new Random();
        int value = rand.nextInt(6);
        if (value == 1) {
            computerChoice = "Rock";
        } else if (value == 2){
            computerChoice =  "Scissors";
        } else if (value == 3){
            computerChoice = "Paper";
        } else if (value == 4) {
            computerChoice = "Lizard";
        } else {
            computerChoice = "Spock";
        }
    }
    
    public void determineWinner() {
        if (computerChoice.equals(playerChoice)) {
            System.out.println("You tied! Both players chose " + playerChoice);
        } else if (playerChoice.equals("Rock") && (computerChoice.equals("Scissors") || computerChoice.equals("Lizard"))) {
            System.out.println("Players Rock crushed the computers " + computerChoice);
        } else if (playerChoice.equals("Paper") && (computerChoice.equals("Rock") || computerChoice.equals("Spock"))){
            if (computerChoice.equals("Rock")) {
                System.out.println("Players Paper surrounded the computer's Rock");
            } else {
                System.out.println("Players Paper disproves the computer's Spock");
            }
        } else if (playerChoice.equals("Scissors") && (computerChoice.equals("Paper") || computerChoice.equals("Lizard"))) {
            if (computerChoice.equals("Paper")) {
                System.out.println("Players Scissors cuts computers Paper");
            } else {
                System.out.println("Players Scissors decapitates computers lizard");
            }
        } else if (playerChoice.equals("Lizard") && (computerChoice.equals("Paper") || computerChoice.equals("Spok"))){
            if (computerChoice.equals("Paper")) {
                System.out.println("Players Lizard eats computers Paper");
            } else {
                System.out.println("Players Lizard poisons computers Spock");
            }
        } else if (playerChoice.equals("Spock") && (computerChoice.equals("Rock") || computerChoice.equals("Scissors"))){
            if (computerChoice.equals("Rock")) {
                System.out.println("Players Spock vaporizes computers Rock");
            } else {
                System.out.println("Players Spock smashes computers Scissors");
            }
        } else if(playerChoice.equals("Done")){
           System.out.println("Done");
        }else{
             System.out.println("the computers " + computerChoice + " beats the players " + playerChoice);
        }
    }
    public static void main(String[] args) {
        RockPaperScissor rps = new RockPaperScissor();

        do{
             rps.getPlayerChoice();
             rps.getComputerChoice();
             rps.determineWinner(); 
        }

        while (!(playerChoice.equals("Done")));
  
    }
}