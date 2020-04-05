package statisticsRepo;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ComputingTimeTest {

   long startTime = System.nanoTime();
   ArrayList<Long> longArrayList = new ArrayList<>();

   long endTime = System.nanoTime();
   ArrayList<Long> longArrayList2 = new ArrayList<>();

   long totalTime = endTime - startTime;

   ArrayList<Long> longArrayList3 = new ArrayList<>();

   @Test
   public void addTimeOfRun (long startTime) {

      longArrayList.add(startTime);

      Assert.assertEquals(System.nanoTime(), startTime, 0);
   }

   public void addTimeOfEnd (long endTime) {

      longArrayList2.add(endTime);

      Assert.assertEquals(System.nanoTime(), endTime, 0);
   }

   @Test
   public void isTotalTimeAccuate (long startTime, long end) {

      longArrayList3.add(totalTime);

      Assert.assertEquals(totalTime, endTime - startTime, 0);
      Assert.assertEquals(longArrayList3.get(1), longArrayList2.get(1) - longArrayList.get(1), 0);
   }
}