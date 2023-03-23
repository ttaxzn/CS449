import static org.junit.Assert.*;

import org.junit.Test;

public class GameSelectionTest {

	@Test
	public void radioCheck() {
		GUI junit = new GUI();
		boolean result = junit.gameSelected();
		assertEquals(false, result);
	}
}
