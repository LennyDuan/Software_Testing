package chapter7CaputingArgumentToDOMs;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Date;

import org.junit.Test;

public class PIMTestOrigin {

    private static final int ONE_HOUR = 60;
    private static final Date START_DATE = new Date();
    
    private static final int MILLIS_IN_MINUTE = 1000 * 60;
    
    private static final Date END_DATE = new Date(START_DATE.getTime()
        + ONE_HOUR * MILLIS_IN_MINUTE);
    @Test
    public void shouldAddNewEventToCalendar() {
        Calendar calendar = mock(Calendar.class);
        PIM pim = new PIM(calendar);
        
        Meeting expectedMeeting = new Meeting(START_DATE, END_DATE);
        
        pim.addMeeting(START_DATE, ONE_HOUR);
        verify(calendar).addEvent(expectedMeeting);
    }

}
