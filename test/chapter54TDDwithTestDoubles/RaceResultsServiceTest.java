package chapter54TDDwithTestDoubles;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class RaceResultsServiceTest {

	@Test
    public void subscribedClientShouldReceiveMessage() {
        RaceResultsService raceResults = new RaceResultsService();
        Client client = mock(Client.class);
        Message message = mock(Message.class);
        
        raceResults.addSubscriber(client);
        raceResults.send(message);
        
        verify(client).receive(message);


        
    }

}
