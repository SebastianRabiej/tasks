package com.szkolenie.zadania.Streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ClientServiceTest {

    @Test
    public void testCreating(){
        //given
        ClientService service = new ClientService();

        //when
        final Client resultClient = service.createClient((status) -> new Client("NORMAL"), "VIP");

        //then
        assertThat(resultClient.getStatus()).isEqualTo("NORMAL");
    }

    @Test
    public void should_find_numbers_higher_than_10(){
        //given
        List<Integer> list = Arrays.asList(2,3,10,11,23,4,111,232);

        //when
        List<Integer> result = null;

        //then
        assertThat(result).contains(11,23,111,232);
    }

    @Test
    public void should_print_every_number_divisible_by_2(){
        //given
        List<Integer> list = Arrays.asList(2,3,10,11,23,4,111,232);

        //then -- print
        List<Integer> result = null;
    }

    @Test
    public void should_return_only_distinct_values(){
        //given
        List<Integer> list = Arrays.asList(2,3,10,3,23,2,111,10);

        //when
        List<Integer> result = null;

        //then
        assertThat(result).contains(2,3,10,23,111);
    }

    @Test
    public void should_create_clients_from_status_list(){
        //given
        List<String> list = Arrays.asList("VIP", "NORMAL");

        //when
        List<Client> result = null;

        //then
        assertThat(result.get(0).getStatus()).isEqualTo("VIP");
        assertThat(result.get(1).getStatus()).isEqualTo("NORMAL");
    }

    @Test
    public void should_flat_list_of_lists(){
        //given
        List<List<String>> list = Arrays.asList(
            Arrays.asList("VIP"),
            Arrays.asList("NORMAL"));

        //when
        List<String> result = null;
        //then
        assertThat(result).contains("VIP", "NORMAL");
    }
}
