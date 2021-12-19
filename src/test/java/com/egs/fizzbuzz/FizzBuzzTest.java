package com.egs.fizzbuzz;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private static final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeAll
    public static void beforeAll() {
        System.setOut(new PrintStream(outputStream));
    }

    /**
     * Test solveFizzBuzz, method should print FizzBuzz valued from 1 to 100
     */
    @Test
    public void testSolveFizzBuzz() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(3, FizzBuzz.FIZZ);
        map.put(5, FizzBuzz.BUZZ);
        FizzBuzz.solveFizzBuzz(map);

        Assertions.assertEquals(FIZZ_BUZZ_RESULT_1_TO_100, outputStream.toString());
    }

    /**
     * Test getFizzBuzzValue for every possible option:
     * 1. Divisible by 3
     * 2. Divisible by 5
     * 3. Divisible by neither 3 nor 5
     */
    @Test
    public void testGetFizzBuzzValue() {
        Map<Integer, String> map = Map.of(3, FizzBuzz.FIZZ, 5, FizzBuzz.BUZZ);
        Assertions.assertEquals(FizzBuzz.FIZZ, FizzBuzz.getFizzBuzzValue(map, 9));
        Assertions.assertEquals(FizzBuzz.BUZZ, FizzBuzz.getFizzBuzzValue(map, 25));
        Assertions.assertEquals("8", FizzBuzz.getFizzBuzzValue(map, 8));
    }

    private static final String FIZZ_BUZZ_RESULT_1_TO_100 = "1" + System.lineSeparator() +
            "2" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "4" + System.lineSeparator() +
            "Buzz" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "7" + System.lineSeparator() +
            "8" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "Buzz" + System.lineSeparator() +
            "11" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "13" + System.lineSeparator() +
            "14" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "16" + System.lineSeparator() +
            "17" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "19" + System.lineSeparator() +
            "Buzz" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "22" + System.lineSeparator() +
            "23" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "Buzz" + System.lineSeparator() +
            "26" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "28" + System.lineSeparator() +
            "29" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "31" + System.lineSeparator() +
            "32" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "34" + System.lineSeparator() +
            "Buzz" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "37" + System.lineSeparator() +
            "38" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "Buzz" + System.lineSeparator() +
            "41" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "43" + System.lineSeparator() +
            "44" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "46" + System.lineSeparator() +
            "47" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "49" + System.lineSeparator() +
            "Buzz" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "52" + System.lineSeparator() +
            "53" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "Buzz" + System.lineSeparator() +
            "56" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "58" + System.lineSeparator() +
            "59" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "61" + System.lineSeparator() +
            "62" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "64" + System.lineSeparator() +
            "Buzz" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "67" + System.lineSeparator() +
            "68" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "Buzz" + System.lineSeparator() +
            "71" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "73" + System.lineSeparator() +
            "74" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "76" + System.lineSeparator() +
            "77" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "79" + System.lineSeparator() +
            "Buzz" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "82" + System.lineSeparator() +
            "83" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "Buzz" + System.lineSeparator() +
            "86" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "88" + System.lineSeparator() +
            "89" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "91" + System.lineSeparator() +
            "92" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "94" + System.lineSeparator() +
            "Buzz" + System.lineSeparator() +
            "Fizz" + System.lineSeparator() +
            "97" + System.lineSeparator() +
            "98" + System.lineSeparator() +
            "Fizz" + System.lineSeparator();
}
