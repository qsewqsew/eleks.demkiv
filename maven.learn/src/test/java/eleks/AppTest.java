package eleks;

import org.testng.annotations.Test;
import org.testng.Assert;

public class AppTest

{
    @Test
    public void testDivision() {
        Assert.assertEquals(2, 10 / 5);
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(10, 5*2);
    }


}
