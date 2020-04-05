package firstTry;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {


    @Test
    public void convertMMtoKMTest () {
        Converter a = new Converter(10);
        a.convertMMToKM(10);
        Assert.assertEquals(1.0E-6,a.convertMMToKM(10), 1);

    }
}