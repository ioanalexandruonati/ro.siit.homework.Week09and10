package firstTry;

public class Calculations {

   double d;
   double d2;
   double d3;

   public Calculations (double d, double d2, double d3) {
      this.d = d;
      this.d2 = d2;
      this.d3 = d3;
   }

   public double addition(double d, double d2, double d3){
      double sum = d + d2 + d3;
      return sum;
   }
   public double subtraction(double d, double d2, double d3){
       double sum = d - d2 - d3;
         return sum;
    }
}
