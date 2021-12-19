package com.egs.fizzbuzz;

import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class FizzBuzz {

    protected static final String FIZZ = "Fizz";
    protected static final String BUZZ = "Buzz";

    private static final int FROM = 1;
    private static final int TO = 101;

    public static void main(String[] args) {
        solveFizzBuzz(Map.of(3, FizzBuzz.FIZZ, 5, FizzBuzz.BUZZ));
    }

    /**
     * Method for solve FizzBuzz problem
     */
    public static void solveFizzBuzz(Map<Integer, String> map) {
        IntStream.range(FROM, TO)
                .mapToObj(num -> getFizzBuzzValue(map, num))
                .forEach(System.out::println);
    }

    /**
     * Method which returns FizzBuzz value for specific number
     *
     * @param number Number to check FizzBuzz value
     * @return FizzBuzz value
     */
    protected static String getFizzBuzzValue(Map<Integer, String> map, int number) {
        Optional<Map.Entry<Integer, String>> optional = map.entrySet()
                .stream()
                .filter(integerStringEntry -> number % integerStringEntry.getKey() == 0)
                .findFirst();
        if (optional.isPresent()) {
            return optional.get().getValue();
        } else {
            return String.valueOf(number);
        }
    }
}
