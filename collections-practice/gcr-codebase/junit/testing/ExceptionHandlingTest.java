// package Junit.Test.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Junit.Test.Calculator;

class ExceptionHandlingTest {

    @Test
    void testArithmeticException() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> calc.divide(9, 0));
    }
}

