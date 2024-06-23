import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Player 1's health, strength, and attack:");
        Player player1 = new Player(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.println("Enter Player 2's health, strength, and attack:");
        Player player2 = new Player(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        Arena arena = new Arena(player1, player2);
        arena.startFight();

        scanner.close();
    }
}
