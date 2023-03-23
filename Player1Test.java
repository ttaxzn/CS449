import static org.junit.Assert.*;

import org.junit.Test;

public class Player1Test {

	@Test
	public void radioCheck() {
		GUI junit = new GUI();
		boolean result = junit.player1Select();
		assertEquals(false, result);
	}
}
