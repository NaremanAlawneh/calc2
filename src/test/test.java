package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import code.converter;

public class test {

	@Test
	public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() {
		// Arrange
		int a = 10;
		int b = 20;
		converter c = new converter();

		int result = c.add(a, b);

		Assert.assertTrue(result > 0);
	}

	@Test
	public void testSum_BothNumbersAreNegative_ShouldReturnNegNumber() {
		// Arrange
		int a = -10;
		int b = -20;
		converter c = new converter();

		int result = c.add(a, b);

		Assert.assertTrue(result < 0);
	}
}
