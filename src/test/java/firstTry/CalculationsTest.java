package firstTry;

import org.junit.Assert;
import org.junit.Test;

public class CalculationsTest {

   @Test
       public void additionTest () {
           Calculations a = new Calculations(10,10,10);
           a.addition(10,10,10);
           Assert.assertEquals(30,a.addition(10,10,10), 0);

       }
}