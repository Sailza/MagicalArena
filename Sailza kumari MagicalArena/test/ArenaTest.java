import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ArenaTest {
    @Test
    public void testFightOutcome() {
        Player player1 = new Player(50, 5, 10);
        Player player2 = new Player(100, 10, 5);
        Arena arena = new Arena(player1, player2);
        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        arena.startFight();
        
        String output = outContent.toString();
        assertTrue(output.contains("Player 1 has died. Player 2 wins!") || 
                   output.contains("Player 2 has died. Player 1 wins!"));
    }
}
