import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test1 {
	
	// test isAvailable function
	@Test
	void test1() {
		SnackMachine mySnackMachine = new SnackMachine();
		mySnackMachine.fillMachine();
		boolean expectedAvailable = true;
		assertEquals(expectedAvailable, mySnackMachine.isAvailable(5));
	}

	// test for products list after initialize mySnackMachine class.
	@Test
	void test2() {
		SnackMachine mySnackMachine = new SnackMachine();
		
		int expected_zero_size = 0;
		assertEquals(expected_zero_size,mySnackMachine.getProducts().size());
		
	}
	
	// test for products list after initialize mySnackMachine class and filing it.
	@Test
	void test3() {
		SnackMachine mySnackMachine = new SnackMachine();
		mySnackMachine.fillMachine();
		int expected_25_size = 25;
		assertEquals(expected_25_size, mySnackMachine.getProducts().size());
		
	}
	
	
}
