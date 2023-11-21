package de.cas.mse.exercise.diamond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DiamondTest {

	@Test
	public void diamond3_shouldPrint() {
		StringBuffer expected = new StringBuffer();
		expected.append(" *\n");
		expected.append("***\n");
		expected.append(" *\n");

		String actual = new DiamondBuilder().buildDiamond(3);
		assertEquals(expected.toString(), actual);
		System.out.println(actual);
	}

	@Test
	public void diamond5_shouldPrint() {
		StringBuffer expected = new StringBuffer();
		expected.append("  *\n");
		expected.append(" ***\n");
		expected.append("*****\n");
		expected.append(" ***\n");
		expected.append("  *\n");

		String actual = new DiamondBuilder().buildDiamond(5);
		assertEquals(expected.toString(), actual);
		System.out.println(actual);
	}

	@Test
	public void diamond0_shouldReturnNull() {
		assertEquals(null, new DiamondBuilder().buildDiamond(0));
	}

	@Test
	public void diamondNegative_shouldReturnNull() {
		assertEquals(null, new DiamondBuilder().buildDiamond(-1));
	}

	@Test
	public void diamondEven_shouldReturnNull() {
		assertEquals(null, new DiamondBuilder().buildDiamond(10));
	}
}
