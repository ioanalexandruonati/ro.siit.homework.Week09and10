package firstTry;


import javax.swing.*;

//This was my first try at it, without splitting the string.

public class CalculatorLength2 {

   public static void main(String[] args) {

      String cmd = null;;

      do {

         String measurementUnitOfResult = JOptionPane.showInputDialog("Unitatea de masura a rezultatului, aleasa dintre: mm, cm, m, dm, km");

         String action = JOptionPane.showInputDialog("Introduceti actiunea dorita dintre + sau -:");

         String numberAndMeasurementUnit = JOptionPane.showInputDialog("Introduceti numarul, spatiu si unitatea de masura aleasa dintre: mm, cm, m, dm, km");

         int spacePos = numberAndMeasurementUnit.indexOf(" ");

         double number = Double.parseDouble(numberAndMeasurementUnit.substring(0, numberAndMeasurementUnit.indexOf(" ")));

         String unit = numberAndMeasurementUnit.substring(spacePos + 1, numberAndMeasurementUnit.length()).trim();

         double num = 0;

         String numberAndMeasurementUnit2 = JOptionPane.showInputDialog("Introduceti numarul, spatiu si unitatea de masura aleasa dintre: mm, cm, m, dm, km");

         int spacePos2 = numberAndMeasurementUnit.indexOf(" ");

         double number2 = Double.parseDouble(numberAndMeasurementUnit.substring(0, numberAndMeasurementUnit.indexOf(" ")));

         String unit2 = numberAndMeasurementUnit.substring(spacePos + 1, numberAndMeasurementUnit.length()).trim();

         double num2 = 0;

         String numberAndMeasurementUnit3 = JOptionPane.showInputDialog("Introduceti numarul, spatiu si unitatea de masura aleasa dintre: mm, cm, m, dm, km");

         int spacePos3 = numberAndMeasurementUnit.indexOf(" ");

         double number3 = Double.parseDouble(numberAndMeasurementUnit.substring(0, numberAndMeasurementUnit.indexOf(" ")));

         String unit3 = numberAndMeasurementUnit.substring(spacePos + 1, numberAndMeasurementUnit.length()).trim();

         double num3 = 0;

         Converter a = new Converter(num);
         Converter b = new Converter(num2);
         Converter c = new Converter(num3);

         if (measurementUnitOfResult.equalsIgnoreCase("mm")) {
            switch (unit.toLowerCase()) {
               case "mm":
                  num = number;
                  num2 = number2;
                  num3 = number3;
               case "cm":
                  num = a.convertCentimeterToMilimeter(number);
                  num2 = b.convertCentimeterToMilimeter(number2);
                  num3 = c.convertCentimeterToMilimeter(number3);
               case "dm":
                  num = a.convertDecimeterToMilimeter(number);
                  num2 = b.convertDecimeterToMilimeter(number2);
                  num3 = c.convertDecimeterToMilimeter(number3);
               case "m":
                  num = a.convertMeterrToMilimeter(number);
                  num2 = b.convertMeterrToMilimeter(number2);
                  num3 = c.convertMeterrToMilimeter(number3);
               case "km":
                  num = a.convertKMToMilimeter(number);
                  num2 = b.convertKMToMilimeter(number2);
                  num3 = c.convertKMToMilimeter(number3);
            }
         }
         if (measurementUnitOfResult.equalsIgnoreCase("cm")) {
            switch (unit.toLowerCase()) {
               case "mm":
                  num = a.convertMMToCM(number);
                  num2 = b.convertMMToCM(number2);
                  num3 = c.convertMMToCM(number3);
               case "cm":
                  num = number;
                  num2 = number2;
                  num3 = number3;
               case "dm":
                  num = a.convertDMToCM(number);
                  num2 = b.convertDMToCM(number2);
                  num3 = c.convertDMToCM(number3);
               case "m":
                  num = a.convertMToCM(number);
                  num2 = b.convertMToCM(number2);
                  num3 = c.convertMToCM(number3);
               case "km":
                  num = a.convertKMToCM(number);
                  num2 = b.convertKMToCM(number2);
                  num3 = c.convertKMToCM(number3);
            }
         }
         if (measurementUnitOfResult.equalsIgnoreCase("dm")) {
            switch (unit.toLowerCase()) {
               case "mm":
                  num = a.convertMMToDM(number);
                  num2 = b.convertMMToDM(number2);
                  num3 = c.convertMMToDM(number3);
               case "cm":
                  num = a.convertCMToDM(number);
                  num2 = b.convertCMToDM(number2);
                  num3 = c.convertCMToDM(number3);
               case "dm":
                  num = number;
                  num2 = number2;
                  num3 = number3;
               case "m":
                  num = a.convertMToDM(number);
                  num2 = b.convertMToDM(number2);
                  num3 = c.convertMToDM(number3);
               case "km":
                  num = a.convertKMToDM(number);
                  num2 = b.convertKMToDM(number2);
                  num3 = c.convertKMToDM(number3);
            }
         }
         if (measurementUnitOfResult.equalsIgnoreCase("m")) {
            switch (unit.toLowerCase()) {
               case "mm":
                  num = a.convertMMToM(number);
                  num2 = b.convertMMToM(number2);
                  num3 = c.convertMMToM(number3);
               case "cm":
                  num = a.convertCMToM(number);
                  num2 = b.convertCMToM(number2);
                  num3 = c.convertCMToM(number3);
               case "dm":
                  num = a.convertDMToM(number);
                  num2 = b.convertDMToM(number2);
                  num3 = c.convertDMToM(number3);
               case "m":
                  num = number;
                  num2 = number2;
                  num3 = number3;
               case "km":
                  num = a.convertKMToM(number);
                  num2 = b.convertKMToM(number2);
                  num3 = c.convertKMToM(number3);
            }
         }
         if (measurementUnitOfResult.equalsIgnoreCase("km")) {
            switch (unit.toLowerCase()) {
               case "mm":
                  num = a.convertMMToKM(number);
                  num2 = b.convertMMToKM(number2);
                  num3 = c.convertMMToKM(number3);
               case "cm":
                  num = a.convertCMToKM(number);
                  num2 = b.convertCMToKM(number2);
                  num3 = c.convertCMToKM(number3);
               case "dm":
                  num = a.convertDMToKM(number);
                  num2 = b.convertDMToKM(number2);
                  num3 = c.convertDMToKM(number3);
               case "m":
                  num = a.convertMToKM(number);
                  num2= b.convertMToKM(number2);
                  num3 = c.convertMToKM(number3);
               case "km":
                  num = number;
                  num2 = number2;
                  num3 = number3;

            }

         }

         if(action.equalsIgnoreCase("+")) {
            Calculations m = new Calculations(num, num2, num3);
            double sum = m.addition(num, num2, num3);
            JOptionPane.showMessageDialog(null, sum + measurementUnitOfResult.toString());
         }
         else if (action.equalsIgnoreCase("-")) {
            Calculations m = new Calculations(num, num2, num3);
            double sum = m.subtraction(num, num2, num3);
            JOptionPane.showMessageDialog(null, sum + measurementUnitOfResult.toString());
         }
         cmd = JOptionPane.showInputDialog("Introduceti x pentru a incheia.");
      } while (!cmd.equalsIgnoreCase("x"));
   }
}