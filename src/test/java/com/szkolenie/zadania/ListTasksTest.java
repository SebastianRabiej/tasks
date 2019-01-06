package com.szkolenie.zadania;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ListTasksTest {

    @Test
    public void should_sort_list(){
        //given
        List<Integer> integers = Arrays.asList(1,6,3,8,11,4);

        //when
        List<Integer> result = sortList(integers);

        //then
        Assertions.assertThat(result).containsExactlyInAnyOrder(1,3,4,6,8,11);
    }

    @Test
    public void should_filter_list(){
        //given
        List<Integer> integers = Arrays.asList(6,6,3,8,11,4,11);

        //when
        List<Integer> result = deleteDuplications(integers);

        //then
        Assertions.assertThat(result).containsExactlyInAnyOrder(6,3,8,11,4);
    }

    //do not use sort methods
    private List<Integer> sortList(List<Integer> integers) {
        return null;
    }

    //do not use filter methods
    private List<Integer> deleteDuplications(List<Integer> integers) {
        return null;
    }
}
