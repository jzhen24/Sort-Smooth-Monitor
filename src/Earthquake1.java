import java.util.LinkedList;

class Earthquake1 {
  Earthquake1() {
  }

  // checks whether a datum is a date
  boolean isDate(double anum) {
    return (int) anum > 10000000;
  }

  // extracts the month from an 8-digit date
  int extractMonth(double dateNum) {
    return ((int) dateNum % 10000) / 100;
  }

  /**
   * Creates daily MaxHzReports for the specified month
   *
   * @param data
   * @param month
   * @return a list of MaxHzReport
   */
  public LinkedList<MaxHzReport> dailyMaxForMonth(LinkedList<Double> data, int month) {
    LinkedList<MaxHzReport> reports = new LinkedList<>();
    Double max = 0.0;

    for (int i = 0; i < data.size(); i++) {
      if (isDate(data.get(i)) && extractMonth(data.get(i)) == (month)) {
        for (int j = i + 1; j < data.size(); j++) {
            if (data.get(j) > max && data.get(j) <= 500.0 && data.get(j) >= 0) {
              max = data.get(j);
            }
            if(data.get(j) > 500 || data.size() - 1 == j){
              reports.add(new MaxHzReport(data.get(i), max));
              max=0.0;
              break;
            }
          }
        }
        }
    return reports;
  }

}





