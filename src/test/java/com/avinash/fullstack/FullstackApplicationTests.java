package com.avinash.fullstack;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class FullstackApplicationTests {

	@Tag("slow")
	@Test
	 void testAdd() {
		assertEquals(42, Integer.sum(19, 23));
	}
	@Tag("fast")
	@Test
	 void testDivide() {
		assertThrows(ArithmeticException.class, () -> {
			Integer.divideUnsigned(42, 0);
		});
	}

}
