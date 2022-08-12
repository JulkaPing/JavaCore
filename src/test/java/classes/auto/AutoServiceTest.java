package classes.auto;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AutoServiceTest {

    // массив автомобилей
    private Auto[] autos = {
            new Auto("BMW", "BMW X4", 4, "MKP" ),
            new Auto("mercedec", "mercedec-E", 2, "AT" ),
            new Auto("mercedec", "mercedec-A",4, "AT"),
            new Auto("KIA", "X-line", 4, "AT"),
            new Auto("mercedec", "mercedec-G", 2, "MKP" )
    };

    @Test
    public void getOnlyBmwCars1() {
        AutoService autoService = new AutoService();

        Auto[] bmwCarsResult = autoService.getOnlyBmwCars(autos, "BMW");
        int result = autoService.getOnlyBmwCars(autos, "BMW").length;
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getOnlyBmwCars2() {

        AutoService autoService = new AutoService();
        Auto[] bmwCarsResult = autoService.getOnlyBmwCars(autos, "BMW");

        Auto autoResult = bmwCarsResult[0];

        System.out.println(autoResult.getMarkaAuto());
        System.out.println((autoResult.getModelAuto()));
        Assert.assertEquals(bmwCarsResult, autoResult);

        //String markaExpected = autos.getMarkaAuto();
        //String modelExpected = car1.getModelAuto();
        //int seatsCountExpected = car1.getAmountOfCarSeats();
        //String transmissionExpected = car1.getTypeTransmission();
        //Assert.assertEquals(markaExpected, autoResult.getMarkaAuto());
        //Assert.assertEquals(modelExpected, autoResult.getModelAuto());
        //Assert.assertEquals(seatsCountExpected, autoResult.getAmountOfCarSeats());
        //Assert.assertEquals(transmissionExpected, autoResult.getTypeTransmission());
    }

   /* @Test
    public void arrayAutoSportCars() {
        AutoService autoService = new AutoService();

        Auto[] sportcars = autoService.getSportCars(autos);

        int result = autoService.getSportCars(autos).length;
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void arrayCarTransmissionAT() {
        AutoService autoService = new AutoService();

        Auto[]  carTransmissionAT = autoService.getOnlyAutomaticTypeCars(autos, "AT");

        int result = autoService.getOnlyAutomaticTypeCars(autos, "AT").length;
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void arrayCarMercedecE() {
        AutoService autoService = new AutoService();

        Auto[]  carMercedecE= autoService.getOnlyMercedecECars(autos);

        int result = autoService.getOnlyMercedecECars(autos).length;
        int expected = 2;
        Assert.assertEquals(expected, result);
    }*/




}