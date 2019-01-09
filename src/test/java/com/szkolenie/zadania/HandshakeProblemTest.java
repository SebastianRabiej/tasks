package com.szkolenie.zadania;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

//At a party, everyone shook hands with everybody else. There were 66 handshakes. How many people were at the party?
class HandshakeProblemTest {

    @Test
    public void should_give_answer_for_ten_handshakes(){
        //given
        int numberOfHandshakes = 10;

        //when
        int result = HandshakeProblemSolver.calculateNumberOfPeople(numberOfHandshakes);

        //then
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void should_give_answer_for_zero_handshakes(){
        //given
        int numberOfHandshakes = 0;

        //when
        int result = HandshakeProblemSolver.calculateNumberOfPeople(numberOfHandshakes);

        //then
        assertThat(result).isEqualTo(1);
    }

    //Write Code for 66
}
