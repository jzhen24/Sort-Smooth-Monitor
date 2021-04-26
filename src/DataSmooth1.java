import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.LinkedList;

class DataSmooth1 {
  DataSmooth1(){}

    /**
     * calculates the average smoothed runtime for each show's episodes
     *
     * @param shows
     * @return a list of smoothed runtime Doubles
     */
  public LinkedList<Double> dataSmooth(LinkedList<Show> shows) 
  {
	  LinkedList<Double> averages = new LinkedList<>();
	  Double sum;
	  for(Show s: shows) {
	      sum=0.0;
          for (int i = 0; i < s.episodes.size(); i++) {
              sum += (Double)s.episodes.get(i).runTime;
          }
          averages.add(sum/s.episodes.size());
      }
	  LinkedList<Double> finalAverages = new LinkedList<>();
	  finalAverages.add(averages.get(0));
	  for(int i = 1; i <= averages.size() - 2; i++){
	      finalAverages.add((averages.get(i-1) + averages.get(i) + averages.get(i+1))/3);
      }
	  finalAverages.add(averages.get(averages.size()-1));
	  return finalAverages;

  }
}