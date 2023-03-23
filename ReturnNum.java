import static org.junit.Assert.*;

import org.junit.Test;

public class ReturnNum {

	@Test
	public void Stacktest() {
		GUI junit = new GUI();
		int result = junit.getNum();
		assertEquals(3, result);
	}


}
