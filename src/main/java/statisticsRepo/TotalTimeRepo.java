package statisticsRepo;

import java.util.ArrayList;

public class TotalTimeRepo {
   long startTime;
   long endTime;
   long totalTime;
   ArrayList<Long> totalTimes = new ArrayList<>();

   public TotalTimeRepo (long startTime, long endTime) {
      this.startTime = startTime;
      this.endTime = endTime;
      totalTime = endTime - startTime;
   }

   public void addTotalTimesToArray (long totalTime) {
      totalTimes.add(totalTime);
   }
}
