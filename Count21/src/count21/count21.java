package count21;

import java.util.Random;
import java.util.Scanner;

public class count21 {

    public static void main(String[] args) {
    	count21();
       
}

	public static void count21() {
	int player1 = 0;
    int player2 = 0;

    Scanner scanner = new Scanner(System.in);

    while (player1 <= 21 && player2 <= 21) {
        System.out.println("POINTS");
        System.out.println("player1: " + player1);
        System.out.println("CPU: " + player2);

        int player1points = getPlayer1Input(scanner);

        // Check if player1points is greater than 3 
        while (player1points > 3 && player1points < 1) {
            System.out.println("Invalid input. Please enter a number between 1 and 3.");
            player1points = getPlayer1Input(scanner);
        }

        player1 = player1points + player1;

        Random rand = new Random();
        int upperbound = 3;
        int randomnum = rand.nextInt(upperbound) + 1;
        player2 = randomnum + player2;

        if (player1 > 21) {
            System.out.println("YOU LOST");
        }

        if (player2 > 21) {
            System.out.println("YOU WON");
        }
    }

    scanner.close();
}

private static int getPlayer1Input(Scanner scanner) {
    System.out.println("player1, enter a number from 1 to 3: ");
    return scanner.nextInt();
}
}

