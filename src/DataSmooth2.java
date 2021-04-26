import java.util.LinkedList;

class DataSmooth2 {
  DataSmooth2(){}

    /**
     * calculates the average smoothed runtime for each show's episodes
     *
     * @param shows
     * @return a list of smoothed runtime Doubles
     */
  public LinkedList<Double> dataSmooth(LinkedList<Show> shows) 
  {
      double sum = 0.0;
      LinkedList<Double> avg = new LinkedList<Double>();

      for (Show s : shows) {
          for(Episode e: s.episodes)
          {
              sum += e.runTime;
          }
          avg.add(sum/s.episodes.size());
          sum = 0.0;
      }

      LinkedList<Double> smoothAvg = new LinkedList<>();
      smoothAvg.add(avg.getFirst());
      for (int j = 1; j < avg.size() - 1; j++) {
          double smoothSum = avg.get(j) + avg.get(j + 1) + avg.get(j -1);
          double dataSmoothAverage = smoothSum / 3;
          smoothAvg.add(dataSmoothAverage);
      }
      return smoothAvg;
  }
  }
