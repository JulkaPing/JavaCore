package classes.auto;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AutoServiceTest {
    @Test
    public void arrayAutoBmw() {
        AutoService autoService = new AutoService();
        Auto car1 = new Auto("BMW", "BMW X4", 4, "MKP" );
        Auto car2 = new Auto("BMW", "BMW X6", 5, "AT");
        Auto[] autos = {car1, car2};
        Auto[] bmwCars = autoService.getOnlyBmwCars(autos);

        int result = autoService.getOnlyBmwCars(autos).length;
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void arrayAutoSportCars() {
        AutoService autoService = new AutoService();
        Auto car1 = new Auto("mercedec", "mercedec-E", 2, "AT" );
        Auto car2 = new Auto("BMW", "BMW X4", 2, "MKP" );
        Auto[] autos = {car1, car2};
        Auto[] sportcars = autoService.getSportCars(autos);

        int result = autoService.getSportCars(autos).length;
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void arrayCarTransmissionAT() {
        AutoService autoService = new AutoService();
        Auto car1 = new Auto("mercedec", "mercedec-E", 2, "AT" );
        Auto car2 = new Auto("mercedec", "mercedec-A",4, "AT");
        Auto car3 = new Auto("BMW", "BMW X6", 4, "AT");
        Auto[] autos = {car1, car2, car3};
        Auto[]  carTransmissionAT= autoService.getOnlyAutomaticTypeCars(autos);

        int result = autoService.getOnlyAutomaticTypeCars(autos).length;
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void arrayCarMercedecE() {
        AutoService autoService = new AutoService();
        Auto car1 = new Auto("mercedec", "mercedec-E", 2, "AT" );
        Auto car2 = new Auto("mercedec", "mercedec-A",4, "AT");
        Auto car3 = new Auto("BMW", "BMW X6", 4, "AT");
        Auto car4 = new Auto("mercedec", "mercedec-E", 2, "MKP" );
        Auto[] autos = {car1, car2, car3, car4};
        Auto[]  carMercedecE= autoService.getOnlyMercedecECars(autos);

        int result = autoService.getOnlyMercedecECars(autos).length;
        int expected = 2;
        Assert.assertEquals(expected, result);
    }




}