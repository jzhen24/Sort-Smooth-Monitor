import java.util.LinkedList;

class ShowManager2 {
	
	ShowManager2() {}

	/**
	 * organizes non-special shows into daytime, primetime, and nightime in a summary
	 *
	 * @param shows
	 * @return a summary with all the list of shows
	 */
	public ShowSummary organizeShows(LinkedList<Show> shows) {

		ShowSummary result = new ShowSummary();

		for (Show s: shows) {
			if (s.broadcastTime >= 600 && s.broadcastTime < 1700 && !(s.isSpecial))
				result.daytime.add(s);
			if (s.broadcastTime >= 1700 && s.broadcastTime < 2200 && !(s.isSpecial))
				result.primetime.add(s);
			if (s.broadcastTime >= 2200 || s.broadcastTime < 100 && !(s.isSpecial))
				result.latenight.add(s);
		}

		return result;
	}
	
}
