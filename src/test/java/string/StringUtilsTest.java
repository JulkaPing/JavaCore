package string;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void getTheBiggestStringFromArray() {
        String[] strings = {
                "Winter, Spring, Summer, Autumn",   //30
                "Morning, Day, Evening, Night",     //28
                "Breakfast, lunch, Dinner"          //24
        };

        BigString bigString = StringUtils.getTheBiggestStringFromArray(strings);
        Assert.assertEquals(30, bigString.getLength());
        Assert.assertEquals("Winter, Spring, Summer, Autumn", bigString.getValue());
    }

    @Test
    public void whenEmptyArrayString() {
        String[] strings = null;
        BigString bigString = StringUtils.getTheBiggestStringFromArray(strings);
        Assert.assertNull(bigString);
    }
}