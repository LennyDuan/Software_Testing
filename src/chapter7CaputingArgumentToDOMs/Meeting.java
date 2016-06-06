package chapter7CaputingArgumentToDOMs;

import java.util.Date;

public class Meeting implements Event {

	private final Date startDate;
	private final Date endDate;

	public Meeting(Date startDate, Date endDate) {
		this.startDate = new Date(startDate.getTime());
		this.endDate = new Date(endDate.getTime());
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

}
