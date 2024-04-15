package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void test_un() {
		assertEquals(FizzBuzz.fizzbuzz(1),"1");
	}
	
	@Test
	void test_deux() {
		assertEquals(FizzBuzz.fizzbuzz(2), "2");
	}
}
