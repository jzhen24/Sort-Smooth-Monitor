import java.util.LinkedList;

class Earthquake2 {
  Earthquake2(){}

  // checks whether a datum is a date
  boolean isDate(double anum) { return (int)anum > 10000000; }
  // extracts the month from an 8-digit date
  int extractMonth(double dateNum) { return ((int)dateNum % 10000) / 100; }

  /**
   * Creates daily MaxHzReports for the specified month
   *
   * @param data
   * @param month
   * @return a list of MaxHzReport
   */
  public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {
    LinkedList<MaxHzReport> reports = new LinkedList<>();
    MaxHzReport report = new MaxHzReport(0,0);
    Double date = 0.0;

    for (int i=0; i< data.size()-1;i++) {
      if (isDate(data.get(i))) {
        if (extractMonth(data.get(i)) == month) {
          date = data.get(i);
          reports.add(report);
          continue;
        }
      }
      if (data.get(i) <= 500) {
        if (data.get(i) > report.maxReading) {
          report.maxReading = data.get(i);
          report.date = date;
        }
        if(data.get(i+1) > 500){
          report = new MaxHzReport(i, -1);
        }
      }

    }


    for (MaxHzReport rep : reports) {
      if (rep.maxReading == -1) {
        reports.remove(rep);
      }
    }
    return reports;

  }
}