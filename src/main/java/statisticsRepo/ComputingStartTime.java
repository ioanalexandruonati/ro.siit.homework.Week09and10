package statisticsRepo;

import java.util.ArrayList;

public class ComputingStartTime {
   long startTime = System.nanoTime();
   ArrayList<Long> longArrayListStartTimes = new ArrayList<>();

   public ComputingStartTime (long startTime, ArrayList<Long> longArrayList) {
      this.startTime = startTime;
      this.longArrayListStartTimes = longArrayList;
   }

   public void addStartTimeOfRun (long startTime) {
      longArrayListStartTimes.add(startTime);
   }
}


