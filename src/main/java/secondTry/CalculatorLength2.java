package secondTry;


import statisticsRepo.ComputingEndTime;
import statisticsRepo.ComputingStartTime;
import statisticsRepo.TotalTimeRepo;

import javax.swing.*;
import java.util.ArrayList;

//This was my second try at it, with splitting the string.

public class CalculatorLength2 {

   public static void main(String[] args) {

      ArrayList<Long> longArrayListStartTime = new ArrayList<>();

      long startTime = System.nanoTime();

      ComputingStartTime startTimeOfRun = new ComputingStartTime(startTime, longArrayListStartTime);

      startTimeOfRun.addStartTimeOfRun(startTime);

      String cmd = null;

      do {

         String measurementUnitOfResult = JOptionPane.showInputDialog("Unitatea de masura a rezultatului, aleasa dintre: mm, cm, m, dm, km");

         String numbersAndMeasurementUnit = JOptionPane.showInputDialog("Introduceti o valoare, spatiu, unitatea de masura aleasa dintre: mm, cm, m, dm, km si actiunea dorita. " +
                 "Adaugati toate numerele, unitatile de masura si actiunile dorite, la acest pas, dupa modalitatea tocmai mentionata.");

         String [] numbersAndMeasurementUnitArray = numbersAndMeasurementUnit.split(" ");

         Convert a = new Convert(numbersAndMeasurementUnitArray, measurementUnitOfResult);

         a.convertToResultUnitOfMeasurement(a.convertToMilimeters(numbersAndMeasurementUnitArray, measurementUnitOfResult), measurementUnitOfResult);

         a.calculate();

         JOptionPane.showMessageDialog(null, String.valueOf(a.calculate()));

         cmd = JOptionPane.showInputDialog("Introduceti x pentru a incheia.");
      } while (! cmd.equalsIgnoreCase("x"));

      long endTime = System.nanoTime();

      long totalTime = endTime - startTime;

      ArrayList<Long> longArrayListEndTime = new ArrayList<>();

      ComputingEndTime endTimeOfRun = new ComputingEndTime(endTime, longArrayListEndTime);

      endTimeOfRun.addEndTimeOfRun(endTime);

      TotalTimeRepo totalTimeRepo = new TotalTimeRepo(startTime, endTime);
   }
}