import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;
import java.util.Arrays;

public class ShowExamples {
	ShowManager1 sm1 = new ShowManager1();
	LinkedList<Show> shows = new LinkedList<Show>();
	ShowSummary report1 = new ShowSummary();
	LinkedList<Show> shows1 = new LinkedList<Show>();
	ShowSummary report2 = new ShowSummary();
	LinkedList<Show> shows2 = new LinkedList<Show>();
	ShowSummary report3 = new ShowSummary();
	LinkedList<Show> shows3 = new LinkedList<Show>();
	ShowSummary report4 = new ShowSummary();
	LinkedList<Show> shows4 = new LinkedList<Show>();
	ShowSummary report5 = new ShowSummary();


	public ShowExamples() {
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));
		Show s1 = new Show("Star Trek", 1800, eps1, false);
		shows.add(s1);
		report1.primetime.add(s1);

		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		Show s2 = new Show("Futurama", 1900, eps2, false);
		shows.add(s2);
		report1.primetime.add(s2);

		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		Show s3 = new Show("Animaniacs", 1630, eps3, false);
		shows.add(s3);
		report1.daytime.add(s3);
		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		Show s4 = new Show("Sesame Street", 900, eps4, false);
		shows.add(s4);
		report1.daytime.add(s4);

		LinkedList<Episode> ep1 = new LinkedList<Episode>();
		ep1.add(new Episode("Jasmine", 78));
		ep1.add(new Episode("Steven", 79));
		ep1.add(new Episode("Maria", 80));
		Show show1 = new Show("Names", 1300, ep1, false);
		shows1.add(show1);
		report2.daytime.add(show1);

		LinkedList<Episode> ep2 = new LinkedList<Episode>();
		ep2.add(new Episode("Zhen", 60));
		ep2.add(new Episode("Pham", 61));
		ep2.add(new Episode("Liu", 62));
		Show show2 = new Show("lastNames", 1930, ep2, false);
		shows1.add(show2);
		report2.primetime.add(show2);

		LinkedList<Episode> epi1 = new LinkedList<Episode>();
		epi1.add(new Episode("UMA", 100));
		epi1.add(new Episode("WPI", 120));
		epi1.add(new Episode("NEU", 122));
		Show show3 = new Show("Colleges", 1400, epi1, false);
		shows2.add(show3);
		report3.daytime.add(show3);

		LinkedList<Episode> epi2 = new LinkedList<Episode>();
		epi2.add(new Episode("Fries", 80));
		epi2.add(new Episode("Potatoes", 85));
		epi2.add(new Episode("Mashed", 87));
		Show show4 = new Show("Ways of a Potatoe", 2030, epi2, true);
		shows2.add(show4);
		LinkedList<Episode> epis1 = new LinkedList<Episode>();
		epis1.add(new Episode("Hotdog", 99));
		epis1.add(new Episode("Hamburger", 101));
		epis1.add(new Episode("Grilled Cheese", 103));
		Show show5 = new Show("BBQ", 2230, epis1, false);
		shows3.add(show5);
		report4.latenight.add(show5);

		LinkedList<Episode> epis2 = new LinkedList<Episode>();
		epis2.add(new Episode("Chair", 121));
		epis2.add(new Episode("Desk", 122));
		epis2.add(new Episode("Table", 123));
		Show show6 = new Show("Furniture", 1800, epis2, false);
		shows3.add(show6);
		report4.primetime.add(show6);

		LinkedList<Episode> epis3 = new LinkedList<Episode>();
		epis3.add(new Episode("Vanilla", 130));
		epis3.add(new Episode("Chocolate", 131));
		epis3.add(new Episode("Vanilla and Chocolate", 132));
		Show show7 = new Show("Icecream Flavors", 700, epis3, true);
		shows3.add(show7);

		LinkedList<Episode> episo1 = new LinkedList<Episode>();
		episo1.add(new Episode("Fall", 125));
		episo1.add(new Episode("Spring", 126));
		episo1.add(new Episode("Summer", 127));
		Show show8 = new Show("Seasons", 2045, episo1, false);
		shows4.add(show8);
		report5.primetime.add(show8);

		LinkedList<Episode> episo2 = new LinkedList<Episode>();
		episo2.add(new Episode("Snow", 110));
		episo2.add(new Episode("Rain", 111));
		episo2.add(new Episode("Sun and CLoud", 112));
		Show show9 = new Show("Weather", 900, episo2, false);
		shows4.add(show9);
		report5.daytime.add(show9);
	}
	@Test
	public void instructorTestOrganizeShows() {
		ShowSummary report2 = sm1.organizeShows(shows);
		assertEquals(report1, report2);
	}

	@Test
	public void instructorTestOrganizeShows1() {
		ShowSummary report3 = sm1.organizeShows(shows1);
		assertEquals(report2, report3);

	}
	@Test
	public void instructTestOrganizeShows2(){
		ShowSummary report4 = sm1.organizeShows(shows2);
		assertEquals(report3, report4);
	}
	@Test
	public void instructTestOrganizeShows3(){
		ShowSummary report5 = sm1.organizeShows(shows3);
		assertEquals(report4, report5);
	}
	@Test
	public void instructTestOrganizeShows4(){
		ShowSummary report6 = sm1.organizeShows(shows4);
		assertEquals(report5, report6);
	}
}

/*
Subtasks for Problem 1:
- Divide shows based on the times
    - daytime shows have time 6:00am to 5:00pm
    - primetime shows have time 5:00pm to 10:00pm
    - latenight show have time 10:00pm to 1:00am
- sort the non-special shows into a summary
- summary list contains show lists with their respected times
 */
