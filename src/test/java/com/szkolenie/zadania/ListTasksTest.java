package com.szkolenie.zadania;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ListTasksTest {

    @Test
    public void should_sort_list() {
        //given
        List<Integer> integers = Arrays.asList(11, 6, 3, 8, 1, 4);

        //when
        List<Integer> result = sortList(integers);

        //then
        Assertions.assertThat(result).containsExactly(1, 3, 4, 6, 8, 11);
    }

    @Test
    public void should_delete_duplicates_in_list() {
        //given
        List<Integer> integers = Arrays.asList(6, 6, 3, 8, 11, 4, 11);

        //when
        List<Integer> result = deleteDuplications(integers);

        //then
        Assertions.assertThat(result).containsExactlyInAnyOrder(6, 3, 8, 11, 4);
    }

    @Test
    public void should_swap_list_elements() {
        //given
        List<Integer> integers = Arrays.asList(5, 2, 1);

        //when
        swap(integers, 0, 2);

        //then
        Assertions.assertThat(integers).containsExactly(1, 2, 5);
    }

    //do not use sort methods
    private List<Integer> sortList(List<Integer> integers) {

        for (int j = 0; j < integers.size(); j++) {
            for (int i = 1; i < integers.size() - j; i++) {
                if (integers.get(i) < integers.get(i - 1)) {
                    swap(integers, i - 1, i);
                }
            }
        }
        return integers;
    }

    private void swap(List<Integer> list, int firstIndex, int secondIndex) {
        int temp = list.get(firstIndex);

        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, temp);
    }


    //do not use filter methods
    private List<Integer> deleteDuplications(List<Integer> integers) {
        return null;
    }
}
