package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void fizz_un() {
		assertEquals(FizzBuzz.fizzbuzz(1),"1");
	}
	
	@Test
	void fizz_deux() {
		assertEquals(FizzBuzz.fizzbuzz(2), "2");
	}
	
	@Test
	void fizz_trois() {
		assertEquals(FizzBuzz.fizzbuzz(3), "fizz");
	}
	
	@Test
	void fizz_quelque_valeurs () {
		assertEquals(FizzBuzz.fizzbuzz(4), "4");
		assertEquals(FizzBuzz.fizzbuzz(7), "7");
		assertEquals(FizzBuzz.fizzbuzz(400), "400");
		
	}
	
	@Test
	void fizz_cinq() {
		assertEquals(FizzBuzz.fizzbuzz(5), "buzz");
	}
	
	
	
}
