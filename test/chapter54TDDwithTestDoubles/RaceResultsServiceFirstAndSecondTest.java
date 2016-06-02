package chapter54TDDwithTestDoubles;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class RaceResultsServiceFirstAndSecondTest {

	RaceResultsService raceResults = new RaceResultsService();
	Client clientA = mock(Client.class, "clientA");
	Client clientB = mock(Client.class, "clientB");
	Message message = mock(Message.class);

	@Test
	public void ZeronoSubscribeClientCanNotReceiveMessage() {
		raceResults.send(message);

		verify(clientA, never()).receive(message);
		verify(clientB, never()).receive(message);

	}

	@Test
	public void OnesubscribedClientShouldReceiveMessage() {

		raceResults.addSubscriber(clientA);
		raceResults.send(message);
		verify(clientA).receive(message);
	}

	@Test
	public void AllmessageShouldBeSentToAllSubscribedClients() {

		raceResults.addSubscriber(clientA);
		raceResults.addSubscriber(clientB);
		raceResults.send(message);

		verify(clientA).receive(message);
		verify(clientB).receive(message);
	}

	@Test
	public void shouldOnlySubscribeOnce() {
		raceResults.addSubscriber(clientA);
		raceResults.addSubscriber(clientA);
		raceResults.send(message);

		verify(clientA, times(1)).receive(message);
	}

	@Test
	public void unsubscribeClientShouldNotReceiveMessage() {
		raceResults.addSubscriber(clientA);
		raceResults.removeSubscriber(clientA);
		raceResults.send(message);
		verify(clientA, never()).receive(message);

	}

}
