package com.szkolenie.zadania;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringTasksTest {

    @Test
    public void should_make_all_chars_in_string_capital(){
        //given
        String stringToChange = "I hate mondays";

        //when
        String result = makeCapital(stringToChange);

        //then
        Assertions.assertThat(result).isEqualTo("I HATE MONDAYS");
    }

    @Test
    public void should_delete_additional_spaces(){
        //given
        String stringToChange = "I   hate  mondays";

        //when
        String result = deleteAdditionalSpaces(stringToChange);

        //then
        Assertions.assertThat(result).isEqualTo("I hate mondays");
    }

    private String makeCapital(String stringToChange) {
        return "";
    }

    private String deleteAdditionalSpaces(String stringToChange) {
        return "";
    }
}
