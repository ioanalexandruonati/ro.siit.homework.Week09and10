package statisticsRepo;

import java.util.ArrayList;

public class ComputingEndTime {

   long endTime = System.nanoTime();
   ArrayList<Long> longArrayListStartTimes = new ArrayList<>();

   public ComputingEndTime (long endTime, ArrayList<Long> longArrayList) {
      this.endTime = endTime;
      this.longArrayListStartTimes = longArrayList;
   }

   public void addEndTimeOfRun (long endTime) {
      longArrayListStartTimes.add(endTime);
   }
}

