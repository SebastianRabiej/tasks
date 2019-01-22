package com.szkolenie.zadania;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

//https://en.wikipedia.org/wiki/Binary_search_algorithm
class BinarySearchTest {

    @Test
    public void should_find_element(){
        //given
        List<Element> elements = Arrays.asList(element(2,3), element(1,4), element(5,6), element(10,2), element(7,8));

        //when
        Element result = findElementWithId(7,elements);

        //then
        Assertions.assertThat(result.getValue()).isEqualTo(8);
    }

    private Element element(int id, int value) {
        return new Element(id, value);
    }

    private Element findElementWithId(int id, List<Element> elements) {
        return null;
    }

    class Element{
        private int id;
        private int value;

        Element(int id, int value) {
            this.id = id;
            this.value = value;
        }

        public int getId() {
            return id;
        }

        public int getValue() {
            return value;
        }

    }
}
