package com.egs.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {

    private static final String FIZZ_BUZZ = "FizzBuzz";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    private static final int FROM = 1;
    private static final int TO = 100;

    public static void main(String[] args) {
        solveFizzBuzz();
    }

    /**
     * Method for solve FizzBuzz problem
     */
    public static void solveFizzBuzz() {
        IntStream.range(FROM, TO)
                .mapToObj(FizzBuzz::getFizzBuzzValue)
                .forEach(System.out::println);
    }

    /**
     * Method which returns FizzBuzz value for specific number
     * @param number    Number to check FizzBuzz value
     * @return          FizzBuzz value
     */
    private static String getFizzBuzzValue(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return FIZZ_BUZZ;
        }
        if (number % 3 == 0) {
            return FIZZ;
        }
        if (number % 5 == 0) {
            return BUZZ;
        }
        return String.valueOf(number);
    }
}
