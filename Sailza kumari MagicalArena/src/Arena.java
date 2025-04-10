import java.util.Random;

public class Arena {
    private Player player1;
    private Player player2;
    private Random random;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.random = new Random();
    }

    public void startFight() {
        while (player1.isAlive() && player2.isAlive()) {
            takeTurn(player1, player2);
            if (player2.isAlive()) {
                takeTurn(player2, player1);
            }
        }

        if (!player1.isAlive()) {
            System.out.println("Player 1 has died. Player 2 wins!");
        } else {
            System.out.println("Player 2 has died. Player 1 wins!");
        }
    }

    private void takeTurn(Player attacker, Player defender) {
        int attackRoll = random.nextInt(6) + 1;
        int defenseRoll = random.nextInt(6) + 1;

        int attackDamage = attacker.getAttack() * attackRoll;
        int defenseStrength = defender.getStrength() * defenseRoll;
        int damage = Math.max(0, attackDamage - defenseStrength);

        defender.reduceHealth(damage);

        System.out.println("Attacker rolls: " + attackRoll + " (damage: " + attackDamage + ")");
        System.out.println("Defender rolls: " + defenseRoll + " (strength: " + defenseStrength + ")");
        System.out.println("Damage dealt: " + damage);
        System.out.println("Defender health: " + defender.getHealth());
         System.out.println("insert successfully: " + defender.getHealth());
    }
}
