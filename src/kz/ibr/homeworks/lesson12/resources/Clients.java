package kz.ibr.homeworks.lesson12.resources;

import java.util.Objects;

public class Clients {
    int clientAge;
    String clientName;

    public Clients(int clientAge, String clientName){
        this.clientAge = clientAge;
        this.clientName = clientName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clients clients = (Clients) o;
        return clientAge == clients.clientAge && clientName.equals(clients.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName);
    }

    @Override
    public String toString() {
        return "Clients{" +
                "clientAge=" + clientAge +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}
