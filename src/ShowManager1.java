import java.util.LinkedList;

class ShowManager1 {
	
	ShowManager1() {}

	/**
	 * organizes non-special shows into daytime, primetime, and nightime in a summary
	 *
	 * @param shows
	 * @return a summary with all the list of shows
	 */
	public ShowSummary organizeShows(LinkedList<Show> shows)
	{
		LinkedList<Show> regularHours = new LinkedList<>();
		for(Show s : shows){
			if (!(s.broadcastTime > 100.0 && s.broadcastTime < 600.0) && !(s.isSpecial))
				regularHours.add(s);
		}
		LinkedList<Show> dayTime = new LinkedList<>();
		LinkedList<Show> primeTime = new LinkedList<>();
		LinkedList<Show> lateNight = new LinkedList<>();
		for(Show s : regularHours){
			if(s.broadcastTime > 600.0 && s.broadcastTime < 1700.0)
				dayTime.add(s);
			if(s.broadcastTime > 1700.0 && s.broadcastTime < 2200.0)
				primeTime.add(s);
			if(s.broadcastTime > 2200.0 || s.broadcastTime < 100.0)
				lateNight.add(s);
		}
		ShowSummary nonSpecial = new ShowSummary(dayTime, primeTime, lateNight);
		return nonSpecial;
	}
	
}
