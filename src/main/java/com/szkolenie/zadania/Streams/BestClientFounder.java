package com.szkolenie.zadania.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

class ClientService {

    private Comparator<Client> comparator = Comparator.comparingInt(c -> c.getPoints().getValue());

    int compareClients(Client client1, Client client2){
        return comparator.compare(client1, client2);
    }

    Client createClient(Function<String,Client> createFunction, String status){
        return createFunction.apply(status);
    }

    //TASK1 - MAKE THIS CODE BETTER
    Client findBestClient(List<Client> clients) {
        Client bestClient = null;
        for (Client client : clients) {
            if (client.getStatus().equals("VIP")) {
                if (bestClient == null || bestClient.getPoints().getValue() < client.getPoints().getValue()) {
                    bestClient = client;
                }
            }
        }
        return bestClient;
    }
}
