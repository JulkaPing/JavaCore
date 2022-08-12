package string;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void getTheBiggestStringFromArray() {
        String[] strings = {
                "Зима, Весна, Лето, Осень", //24
                "Утро, День, Вечер, Ночь",  //23
                "Завтрак, Обед, Ужин"       //19
        };

        BigString bigString = StringUtils.getTheBiggestStringFromArray(strings);
        Assert.assertEquals(24, bigString.getLength());
        Assert.assertEquals("Зима, Весна, Лето, Осень", bigString.getValue());
    }

    @Test
    public void whenEmptyArrayString() {
        String[] strings = null;
        BigString bigString = StringUtils.getTheBiggestStringFromArray(strings);
        Assert.assertNull(bigString);
    }
}