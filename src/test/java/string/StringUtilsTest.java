package string;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void getTheBiggestStringFromArray() {
        String[] strings = {
                "����, �����, ����, �����", //24
                "����, ����, �����, ����",  //23
                "�������, ����, ����"       //19
        };

        BigString bigString = StringUtils.getTheBiggestStringFromArray(strings);
        Assert.assertEquals(24, bigString.getLength());
        Assert.assertEquals("����, �����, ����, �����", bigString.getValue());
    }

    @Test
    public void whenEmptyArrayString() {
        String[] strings = null;
        BigString bigString = StringUtils.getTheBiggestStringFromArray(strings);
        Assert.assertNull(bigString);
    }
}