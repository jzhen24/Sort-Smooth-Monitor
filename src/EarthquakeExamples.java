import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

public class EarthquakeExamples {
  Earthquake1 E1 = new Earthquake1();
  LinkedList<Double> noData = new LinkedList<Double>();
  LinkedList<Double> threeDates = new LinkedList<Double>();
  LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> OctReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> DecReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> JanReports = new LinkedList<MaxHzReport>();
  LinkedList<MaxHzReport> FebReports = new LinkedList<MaxHzReport>();


  public EarthquakeExamples() {
    threeDates.add(20151013.0);
    threeDates.add(10.0);
    threeDates.add(5.0);
    threeDates.add(20151020.0);
    threeDates.add(40.0);
    threeDates.add(50.0);
    threeDates.add(45.0);
    threeDates.add(20151101.0);
    threeDates.add(6.0);
    threeDates.add(20151216.0);
    threeDates.add(45.0);
    threeDates.add(61.0);
    threeDates.add(-63.0);
    threeDates.add(20150113.0);
    threeDates.add(-12.0);
    threeDates.add(15.0);
    threeDates.add(20150227.0);
    threeDates.add(400.0);
    threeDates.add(300.0);
    threeDates.add(200.0);
    NovReports.add(new MaxHzReport(20151101.0, 6.0));
    OctReports.add(new MaxHzReport(20151013.0, 10.0));
    OctReports.add(new MaxHzReport(20151020.0, 50.0));
    DecReports.add(new MaxHzReport(20151216.0, 61.0));
    JanReports.add(new MaxHzReport(20150113.0, 15.0));
    FebReports.add(new MaxHzReport(20150227.0, 400.0));
  }
  @Test
  public void instructorTestEQ() {
    assertEquals(NovReports,
            E1.dailyMaxForMonth(threeDates, 11));
  }

  @Test
  public void instructorTestEQ1() {
    assertEquals(OctReports,
            E1.dailyMaxForMonth(threeDates, 10));

  }
  @Test
  public void instructorTestEQ2() {
    assertEquals(DecReports,
            E1.dailyMaxForMonth(threeDates, 12));
  }
  @Test
  public void instructorTestEQ3() {
    assertEquals(JanReports,
            E1.dailyMaxForMonth(threeDates, 01));
  }
  @Test
  public void instructorTestEQ4() {
    assertEquals(FebReports,
            E1.dailyMaxForMonth(threeDates, 02));
  }
}

/*
Subtasks for problem 3:
- Check for given month
- Look at data from every day from month
- Find max of each day
- Create reports for each day
- Put all reports in a list
 */
