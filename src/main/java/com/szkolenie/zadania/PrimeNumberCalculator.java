package com.szkolenie.zadania;

import java.util.ArrayList;
import java.util.List;

class PrimeNumberCalculator {
    public static List<Integer> calculatePrimeNumbersLowerThan(int maximumNumber) {

        List<Integer> result = new ArrayList<>();
        for (int i = 2; i < maximumNumber; i++) {
            if (isPrimeNumber(i)) {
                result.add(i);
            }
        }

        return result;
    }

    private static boolean isPrimeNumber(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}