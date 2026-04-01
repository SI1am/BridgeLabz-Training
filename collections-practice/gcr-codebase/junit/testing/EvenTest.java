// package Junit.Test.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import Junit.Test.EvenCheck;

public class EvenTest {
	private EvenCheck evencheck;
    @BeforeEach
    void setup() {
        evencheck=new EvenCheck();
    }
    @ParameterizedTest
    @ValueSource(ints= {2,4,6,8,10,12})
    void evenTesting(int a) {
        assertTrue(evencheck.isEven(a));
    }
    @ValueSource(ints= {3,7,9,11,13,15,33})
    void oddTesting(int b) {
    	assertFalse(evencheck.isEven(b));
    }
    
}