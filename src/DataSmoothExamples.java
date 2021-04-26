import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class DataSmoothExamples
{
	LinkedList<Show> shows = new LinkedList<Show>();
	LinkedList<Double> showResults = new LinkedList<Double>();
	DataSmooth1 D1 = new DataSmooth1();
	LinkedList<Show> shows1 = new LinkedList<Show>();
	LinkedList<Double> showResults1 = new LinkedList<Double>();
	DataSmooth1 D2 = new DataSmooth1();
	LinkedList<Show> shows2 = new LinkedList<Show>();
	LinkedList<Double> showResults2 = new LinkedList<Double>();
	DataSmooth1 D3 = new DataSmooth1();
	LinkedList<Show> shows3 = new LinkedList<Show>();
	LinkedList<Double> showResults3 = new LinkedList<Double>();
	DataSmooth1 D4 = new DataSmooth1();
	LinkedList<Show> shows4 = new LinkedList<Show>();
	LinkedList<Double> showResults4 = new LinkedList<Double>();
	DataSmooth1 D5 = new DataSmooth1();
	public DataSmoothExamples()
	{
		LinkedList<Episode> eps1 = new LinkedList<Episode>();
		eps1.add(new Episode("Best of Both Worlds", 88));
		eps1.add(new Episode("The Ultimate Computer", 49));
		eps1.add(new Episode("Trials and Tribble-ations", 43));
		shows.add(new Show("Star Trek", 1800, eps1, false));

		LinkedList<Episode> eps2 = new LinkedList<Episode>();
		eps2.add(new Episode("Fear of a Bot Planet", 23));
		eps2.add(new Episode("The Why of Fry", 21));
		eps2.add(new Episode("Roswell that Ends Well", 23));
		eps2.add(new Episode("Meanwhile", 22));
		shows.add(new Show("Futurama", 1900, eps2, false));

		LinkedList<Episode> eps3 = new LinkedList<Episode>();
		eps3.add(new Episode("Yakko's World", 4));
		eps3.add(new Episode("Hello Nice Warners", 8));
		eps3.add(new Episode("Where Rodents Dare", 9));
		shows.add(new Show("Animaniacs", 1630, eps3, false));

		LinkedList<Episode> eps4 = new LinkedList<Episode>();
		eps4.add(new Episode("The Letter W", 59));
		eps4.add(new Episode("The Letter P", 57));
		eps4.add(new Episode("The Letter I", 58));
		shows.add(new Show("Sesame Street", 900, eps4, false));

		showResults.add(60.0);
		showResults.add(29.75);
		showResults.add(29.08333);
		showResults.add(58.0);
		LinkedList<Episode> ep1 = new LinkedList<Episode>();
		ep1.add(new Episode("Jasmine", 78));
		ep1.add(new Episode("Steven", 79));
		ep1.add(new Episode("Maria", 80));
		Show show1 = new Show("Names", 1300, ep1, false);
		shows1.add(show1);

		LinkedList<Episode> ep2 = new LinkedList<Episode>();
		ep2.add(new Episode("Zhen", 60));
		ep2.add(new Episode("Pham", 61));
		ep2.add(new Episode("Liu", 62));
		Show show2 = new Show("lastNames", 1930, ep2, false);
		shows1.add(show2);

		showResults1.add(79.0);
		showResults1.add(61.0);

		LinkedList<Episode> epi1 = new LinkedList<Episode>();
		epi1.add(new Episode("UMA", 100));
		epi1.add(new Episode("WPI", 120));
		epi1.add(new Episode("NEU", 122));
		Show show3 = new Show("Colleges", 1400, epi1, false);
		shows2.add(show3);

		LinkedList<Episode> epi2 = new LinkedList<Episode>();
		epi2.add(new Episode("Fries", 80));
		epi2.add(new Episode("Potatoes", 85));
		epi2.add(new Episode("Mashed", 87));
		Show show4 = new Show("Ways of a Potatoe", 2030, epi2, false);
		shows2.add(show4);

		showResults2.add(114.0);
		showResults2.add(84.0);
		LinkedList<Episode> epis1 = new LinkedList<Episode>();
		epis1.add(new Episode("Hotdog", 99));
		epis1.add(new Episode("Hamburger", 101));
		epis1.add(new Episode("Grilled Cheese", 103));
		Show show5 = new Show("BBQ", 2230, epis1, false);
		shows3.add(show5);

		LinkedList<Episode> epis2 = new LinkedList<Episode>();
		epis2.add(new Episode("Chair", 121));
		epis2.add(new Episode("Desk", 122));
		epis2.add(new Episode("Table", 123));
		Show show6 = new Show("Furniture", 1800, epis2, false);
		shows3.add(show6);

		LinkedList<Episode> epis3 = new LinkedList<Episode>();
		epis3.add(new Episode("Vanilla", 130));
		epis3.add(new Episode("Chocolate", 131));
		epis3.add(new Episode("Vanilla and Chocolate", 132));
		Show show7 = new Show("Icecream Flavors", 700, epis3, false);
		shows3.add(show7);

		showResults3.add(101.0);
		showResults3.add(118.0);
		showResults3.add(131.0);

		LinkedList<Episode> episo1 = new LinkedList<Episode>();
		episo1.add(new Episode("Fall", 125));
		episo1.add(new Episode("Spring", 126));
		episo1.add(new Episode("Summer", 127));
		Show show8 = new Show("Seasons", 2045, episo1, false);
		shows4.add(show8);

		LinkedList<Episode> episo2 = new LinkedList<Episode>();
		episo2.add(new Episode("Snow", 110));
		episo2.add(new Episode("Rain", 111));
		episo2.add(new Episode("Sun and CLoud", 112));
		Show show9 = new Show("Weather", 900, episo2, false);
		shows4.add(show9);

		LinkedList<Episode> episo3 = new LinkedList<Episode>();
		episo3.add(new Episode("Lettuce", 154));
		episo3.add(new Episode("Tomatoes", 156));
		episo3.add(new Episode("Bacon", 128));
		Show show10 = new Show("BLT Burger", 1000, episo3, false);
		shows4.add(show10);

		showResults4.add(126.0);
		showResults4.add(127.666666667);
		showResults4.add(146.0);
	}
	@Test
	public void instructorTestDS()
	{
		LinkedList<Double> runtimes = D1.dataSmooth(shows);

		for(int i = 0; i < runtimes.size(); i++)
		{
			assertEquals(runtimes.get(i), showResults.get(i), .01);
		}
	}
	@Test
	public void instructorTestDS1()
	{
		LinkedList<Double> runtimes = D2.dataSmooth(shows1);

		for(int i = 0; i < runtimes.size(); i++)
		{
			assertEquals(runtimes.get(i), showResults1.get(i), .01);
		}
	}
	@Test
	public void instructorTestDS2()
	{
		LinkedList<Double> runtimes = D3.dataSmooth(shows2);

		for(int i = 0; i < runtimes.size(); i++)
		{
			assertEquals(runtimes.get(i), showResults2.get(i), .01);
		}
	}
	@Test
	public void instructorTestDS3()
	{
		LinkedList<Double> runtimes = D4.dataSmooth(shows3);

		for(int i = 0; i < runtimes.size(); i++)
		{
			assertEquals(runtimes.get(i), showResults3.get(i), .01);
		}
	}
	@Test
	public void instructorTestDS4()
	{
		LinkedList<Double> runtimes = D5.dataSmooth(shows4);

		for(int i = 0; i < runtimes.size(); i++)
		{
			assertEquals(runtimes.get(i), showResults4.get(i), .01);
		}
	}

}

/*
Subtasks for Problem 2
- sort through each show and the episodes
- get each episodes run time and add it all up
- average runtimes and add to the regular averages list
- smoothing
    - create a new list for the smooth averages
    - add first index and last index to the front and end of the list
    - sort through the list and average the number before and after the given index, if not the first or last index in the list
 */