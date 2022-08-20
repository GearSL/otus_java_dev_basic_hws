package kz.ibr.homeworks.lesson12.resources;

import java.util.Objects;

public class Client {
    int clientAge;
    String clientName;

    public Client(int clientAge, String clientName){
        this.clientAge = clientAge;
        this.clientName = clientName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client clients = (Client) o;
        return clientAge == clients.clientAge && clientName.equals(clients.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, clientAge);
    }

    @Override
    public String toString() {
        return "Clients{" +
                "clientAge=" + clientAge +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}
