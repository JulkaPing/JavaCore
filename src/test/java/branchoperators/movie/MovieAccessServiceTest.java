package branchoperators.movie;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieAccessServiceTest {
    @Test
    public void verificationAgeTest1() {
        String expectedResult = MovieAccessService.accessMovie(19);
        String result = "Rating R. Access is allowed.";
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void verificationAgeTest2() {
        String expectedResult = MovieAccessService.accessMovie(18);
        String result = "Rating R. Access is allowed.";
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void verificationAgeTest3() {
        String expectedResult = MovieAccessService.accessMovie(21);
        String result = "Rating R. Access is allowed.";
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void verificationAgeTest4() {
        String expectedResult = MovieAccessService.accessMovie(25);
        String result = "Rating F. Access is allowed.";
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void verificationAgeTest5() {
        String expectedResult = MovieAccessService.accessMovie(15);
        String result = "Access is denied";
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void verificationAgeTest7() {
        String expectedResult = MovieAccessService.accessMovie(-1);
        String result = "Access is denied";
        Assert.assertEquals(expectedResult, result);
        System.out.println("Incorrect age, check user with age");
    }
}