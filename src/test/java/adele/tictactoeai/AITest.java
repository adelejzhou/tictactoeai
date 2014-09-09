package adele.tictactoeai;

import org.junit.*;
import static org.junit.Assert.*;

public class AITest {
	/**
	 * Run the AI(TicTacToe) constructor test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testAIConstrutor()
		throws Exception {
		TicTacToe game = new TicTacToe(true);

		AI result = new AI(game);

		assertNotNull(result);
	}

	/**
	 * Run the void aiMove() method test.
	 *
	 * @throws Exception
	 *
	 */
	@Test
	public void testAiMove()
		throws Exception {
		AI fixture = new AI(new TicTacToe(true));

		fixture.aiMove();

	}
}