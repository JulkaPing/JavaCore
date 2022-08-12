package classes.auto;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AutoServiceTest {

    // массив автомобилей
    private Auto[] autos = {
            new Auto("BMW", "BMW X4", 4, "MKP" ),
            new Auto("mercedec", "E 325", 2, "AT" ),
            new Auto("mercedec", "A 32",4, "AT"),
            new Auto("KIA", "X-line", 4, "AT"),
            new Auto("mercedec", "E 330", 2, "MKP" )
    };

    @Test
    public void getOnlyBmwCars1() {
        AutoService autoService = new AutoService();

        int result = autoService.getOnlyBmwCars(autos, "BMW").length;
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getOnlyBmwCars2() {
        AutoService autoService = new AutoService();
        Auto[] bmwCarsResult = autoService.getOnlyBmwCars(autos, "BMW");

        Auto autoResult = bmwCarsResult[0];

        String markaExpected = autoResult.getMarkaAuto();
        String modelExpected = autoResult.getModelAuto();
        int seatsCountExpected = autoResult.getAmountOfCarSeats();
        String transmissionExpected = autoResult.getTypeTransmission();

        Assert.assertEquals(markaExpected, autoResult.getMarkaAuto());
        Assert.assertEquals(modelExpected, autoResult.getModelAuto());
        Assert.assertEquals(seatsCountExpected, autoResult.getAmountOfCarSeats());
        Assert.assertEquals(transmissionExpected, autoResult.getTypeTransmission());
    }

    @Test
    public void arrayAutoSportCars1() {
        AutoService autoService = new AutoService();

        int result = autoService.getSportCars(autos).length;
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void arrayAutoSportCars2() {
        AutoService autoService = new AutoService();
        Auto[] bmwCarsResult = autoService.getSportCars(autos);

        Arrays.stream(bmwCarsResult)
                .forEach(System.out::println);
    }
    @Test
    public void getOnlyAutomaticTypeCars1() {
        AutoService autoService = new AutoService();

        int result = autoService.getOnlyAutomaticTypeCars(autos, "AT").length;
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getOnlyAutomaticTypeCars2() {
        AutoService autoService = new AutoService();
        Auto[] bmwCarsResult = autoService.getOnlyAutomaticTypeCars(autos, "AT");

        Arrays.stream(bmwCarsResult)
                .forEach(System.out::println);
    }

    @Test
    public void arrayCarMercedecE() {
        AutoService autoService = new AutoService();
        Auto[]  carMercedecE = autoService.getOnlyMercedecECars(autos, "mercedec");

        Arrays.stream(carMercedecE)
                .forEach(System.out::println);
    }
}