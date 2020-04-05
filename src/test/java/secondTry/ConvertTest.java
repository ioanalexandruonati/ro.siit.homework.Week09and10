package secondTry;


import org.junit.Test;
import org.junit.Assert;

public class ConvertTest {

   @Test
   public void additionTest () {
      String s = "15 km + 10 Km";
      String unitOfMeasurement = "km";
      String[] array = s.split(" ");
      Convert a = new Convert(array, unitOfMeasurement);
      a.convertToResultUnitOfMeasurement(a.convertToMilimeters(array, unitOfMeasurement), unitOfMeasurement);
      a.calculate();
      Assert.assertEquals(25, a.calculate());
   }
}
