package com.szkolenie.zadania;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringTasksTest {

    @Test
    public void should_make_all_chars_in_string_capital() {
        //given
        String textToChange = "I hate mondays";

        //when
        String result = makeCapital(textToChange);

        //then
        Assertions.assertThat(result).isEqualTo("I HATE MONDAYS");
    }

    @Test
    public void should_delete_additional_spaces() {
        //given
        String stringToChange = " I   hate  mondays";

        //when
        String result = deleteAdditionalSpaces(stringToChange);

        //then
        Assertions.assertThat(result).isEqualTo(" I hate mondays");
    }

    private String makeCapital(String textToChange) {
        String resultText = "";
        for (int i = 0; i < textToChange.length(); i++) {
            char character = (textToChange.charAt(i));
            if (character >= 97 && character <= 122) {
                resultText += (char) (character - 32);
            } else {
                resultText += character;
            }
        }
        return resultText;
    }

    private String deleteAdditionalSpaces(String textToChange) {
        String resultString = "";
        for (char character : textToChange.toCharArray()) {
            if (character != ' ') {
                resultString += character;
            } else {
                if (resultString.length() == 0 || resultString.charAt(resultString.length() - 1) != ' ') {
                    resultString += character;
                }
            }
        }
        return resultString;
    }
}
