package secondTry;

public class Convert {
   String[] arrayWithNumbersAndUnitsOfMeasurement;
   double convertedToMilimeter;
   String unitOfMeasurementOfResult;
   double resultFinalConvertedToUnitOfMeasurement;


   public Convert (String[] arrayWithNumbersAndUnitsOfMeasurement, String unitOfMeasurementOfResult) {
      this.arrayWithNumbersAndUnitsOfMeasurement = arrayWithNumbersAndUnitsOfMeasurement;
      this.unitOfMeasurementOfResult = unitOfMeasurementOfResult;
   }

   //       MM


   public double convertDecimeterToMilimeter (double d) {
      double result = d * 100;
      return result;
   }

   public double convertCentimeterToMilimeter (double d) {
      double result = d * 10;
      return result;
   }

   public double convertMeterrToMilimeter (double d) {
      double result = d * 1000;
      return result;
   }

   public double convertKMToMilimeter (double d) {
      double result = d * 10000;
      return result;
   }


//   //        CM
//   public double convertMMToCM (double d) {
//      double result = d * 10;
//      return result;
//   }
//
//   public double convertDMToCM (double d) {
//      double result = d / 10;
//      return result;
//   }
//
//   public double convertMToCM (double d) {
//      double result = d / 100;
//      return result;
//   }
//
//   public double convertKMToCM (double d) {
//      double result = d * 100000;
//      return result;
//   }
//
//   //                 DM
//   public double convertMMToDM (double d) {
//      double result = d / 100;
//      return result;
//   }
//
//   public double convertCMToDM (double d) {
//      double result = d / 10;
//      return result;
//   }
//
//   public double convertMToDM (double d) {
//      double result = d * 10;
//      return result;
//   }
//
//   public double convertKMToDM (double d) {
//      double result = d * 10000;
//      return result;
//   }
//
//   //                   M
//   public double convertMMToM (double d) {
//      double result = d / 1000;
//      return result;
//   }
//
//   public double convertCMToM (double d) {
//      double result = d / 100;
//      return result;
//   }
//
//   public double convertDMToM (double d) {
//      double result = d / 10;
//      return result;
//   }
//
//   public double convertKMToM (double d) {
//      double result = d * 1000;
//      return result;
//   }
//
//   //           KM
//
//   public double convertMMToKM (double d) {
//      double result = d / 1000000;
//      return result;
//   }
//
//   public double convertCMToKM (double d) {
//      double result = d / 100000;
//      return result;
//   }
//
//   public double convertDMToKM (double d) {
//      double result = d / 10000;
//      return result;
//   }
//
//   public double convertMToKM (double d) {
//      double result = d / 1000;
//      return result;
//   }


//   convert to Milimeter regardless of the unit measurement of the numbers that were given and sum of subtract

   public String convertToMilimeters (String[] arrayWithNumbersAndUnitsOfMeasurement, String unitOfMeasurementofResult) {
      for (String p : arrayWithNumbersAndUnitsOfMeasurement) {
         if (p.indexOf(p) % 2 == 1 && p.toString().equalsIgnoreCase(unitOfMeasurementofResult)) {
            switch ((String.valueOf((p.indexOf(p) % 2 == 0)))) {
               case "mm":
                  convertedToMilimeter = Double.valueOf(String.valueOf(p.indexOf(p) % 2 == 0)).doubleValue();
               case "cm":
                  convertedToMilimeter = convertCentimeterToMilimeter(Double.valueOf(String.valueOf(p.indexOf(p) % 2 == 0)).doubleValue());
               case "dm":
                  convertedToMilimeter = convertDecimeterToMilimeter((Double.valueOf(String.valueOf(p.indexOf(p) % 2 == 0)).doubleValue()));
               case "m":
                  convertedToMilimeter = convertMeterrToMilimeter(Double.valueOf(String.valueOf(p.indexOf(p) % 2 == 0)).doubleValue());
               case "km":
                  convertedToMilimeter = convertKMToMilimeter(Double.valueOf(String.valueOf(p.indexOf(p) % 2 == 0)).doubleValue());
            }
         }
      }
      return String.valueOf(convertedToMilimeter);
   }

//   convert to the result's unit of measurement mentioned at the beginnig;

   public String convertToResultUnitOfMeasurement (String converterNumber, String unitOfMeasurementOfResult) {

      if (unitOfMeasurementOfResult.equalsIgnoreCase("MM")) {
         resultFinalConvertedToUnitOfMeasurement = Double.valueOf(converterNumber);
      } else if (unitOfMeasurementOfResult.equalsIgnoreCase("CM")) {
         resultFinalConvertedToUnitOfMeasurement = Double.valueOf(converterNumber) / 10;
      } else if (unitOfMeasurementOfResult.equalsIgnoreCase("DM")) {
         resultFinalConvertedToUnitOfMeasurement = Double.valueOf(converterNumber) / 100;
      } else if (unitOfMeasurementOfResult.equalsIgnoreCase("M")) {
         resultFinalConvertedToUnitOfMeasurement = Double.valueOf(converterNumber) / 1000;
      } else if (unitOfMeasurementOfResult.equalsIgnoreCase("KM")) {
         resultFinalConvertedToUnitOfMeasurement = Double.valueOf(converterNumber) / 1000000;
      }
      return String.valueOf(resultFinalConvertedToUnitOfMeasurement);
   }

   public double calculate () {
      double result = 0;
      for (String p:arrayWithNumbersAndUnitsOfMeasurement){
         if (p.indexOf(p) % 3 == 0 && p.toString().equalsIgnoreCase("+")) {
            result = + resultFinalConvertedToUnitOfMeasurement;
         }
         else if(p.indexOf(p) % 3 == 0 && p.toString().equalsIgnoreCase("-")){
             result = - resultFinalConvertedToUnitOfMeasurement;
         }
      }
      return result;
   }
}
