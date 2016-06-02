package chapter54TDDwithTestDoubles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class RaceResultsService {

	private Collection<Client> clients = new HashSet<Client>();

	public void addSubscriber(Client client) {
		// TODO Auto-generated method stub

		clients.add(client);
	}

	public void send(Message message) {
		// TODO Auto-generated method stub
		for (Client client : clients) {
			client.receive(message);
		}
	}

	public void removeSubscriber(Client clientA) {
		// TODO Auto-generated method stub
		clients.remove(clientA);
	}

}
