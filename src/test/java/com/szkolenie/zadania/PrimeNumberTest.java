package com.szkolenie.zadania;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class PrimeNumberTest {

    @Test
    public void should_return_4_prime_numbers(){
        //when
        List<Integer> result = PrimeNumberCalculator.calculatePrimeNumbersLowerThan(10);

        //then
        assertThat(result).containsExactlyInAnyOrder(2,3,5,7);
    }

    @Test
    public void should_return_0_prime_numbers(){
        //when
        List<Integer> result = PrimeNumberCalculator.calculatePrimeNumbersLowerThan(2);

        //then
        assertThat(result).isEmpty();
    }
}
