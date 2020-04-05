package firstTry;

public class Converter {

   double d;

   public Converter (double d) {
      this.d = d;
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



   //        CM
   public double convertMMToCM (double d) {
      double result = d * 10;
      return result;
   }
   public double convertDMToCM(double d) {
      double result = d / 10;
      return result;
   }
   public double convertMToCM(double d) {
      double result = d / 100;
      return result;
   }
   public double convertKMToCM(double d) {
      double result = d * 100000;
      return result;
   }

   //                 DM
   public double convertMMToDM(double d) {
      double result = d / 100;
      return result;
   }
   public double convertCMToDM(double d) {
      double result = d / 10;
      return result;
   }
   public double convertMToDM(double d) {
      double result = d * 10;
      return result;
   }
   public double convertKMToDM(double d) {
      double result = d * 10000;
      return result;
   }

//                   M
public double convertMMToM(double d) {
      double result = d / 1000;
      return result;
   }
   public double convertCMToM(double d) {
         double result = d / 100;
         return result;
      }
   public double convertDMToM(double d) {
           double result = d / 10;
           return result;
        }
   public double convertKMToM(double d) {
              double result = d * 1000;
              return result;
           }

//           KM

   public double convertMMToKM(double d) {
              double result = d / 1000000;
              return result;
           }

   public double convertCMToKM(double d) {
                double result = d / 100000;
                return result;
             }

   public double convertDMToKM(double d) {
                 double result = d / 10000;
                 return result;
              }
   public double convertMToKM(double d) {
                    double result = d / 1000;
                    return result;
                 }
}

