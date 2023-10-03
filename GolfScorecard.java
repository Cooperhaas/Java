import java.util.Scanner;

public class GolfScorecard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Define the number of players and holes
        int numPlayers = 2; // You can change this to the desired number of players
        int numHoles = 18;  // You can change this to the number of holes in your round
        
        // Create a 2D array to store scores for each player and each hole
        int[][] scores = new int[numPlayers][numHoles];
        
        System.out.println("Welcome to the Multi-Player Golf Scorecard App!");
        
        // Input scores for each player and each hole
        for (int player = 0; player < numPlayers; player++) {
            System.out.println("\nEnter scores for Player " + (player + 1) + ":");
            for (int hole = 1; hole <= numHoles; hole++) {
                System.out.print("Enter score for Hole " + hole + ": ");
                scores[player][hole - 1] = scanner.nextInt();
            }
        }
        
        // Display the scorecard
        System.out.println("\nGolf Scorecard:");
        for (int hole = 1; hole <= numHoles; hole++) {
            System.out.print("Hole " + hole + ": ");
            for (int player = 0; player < numPlayers; player++) {
                System.out.print("Player " + (player + 1) + ": " + scores[player][hole - 1] + " ");
            }
            System.out.println();
        }
        
        // Close the scanner
        scanner.close();
    }
}
