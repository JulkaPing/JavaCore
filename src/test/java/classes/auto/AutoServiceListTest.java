package classes.auto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AutoServiceListTest {
    private Auto[] autos = {
            new Auto("BMW", "BMW X4", 4, "MKP" ),
            new Auto("mercedec", "E 325", 2, "AT" ),
            new Auto("mercedec", "A 32",4, "AT"),
            new Auto("KIA", "X-line", 4, "AT"),
            new Auto("mercedec", "E 330", 2, "MKP" )
    };

            Auto bmw4 = new Auto("BMW", "BMW X4", 4, "MKP" );
            Auto mercE = new Auto("mercedec", "E 325", 2, "AT" );
            Auto mercA = new Auto("mercedec", "A 32",4, "AT");
            Auto kia = new Auto("KIA", "X-line", 4, "AT");
            AutoServiceList autoService = new AutoServiceList();

    @Test
    public void getOnlyBmwCars1() {

        List<Auto> autoList = new ArrayList<>();
        autoList.add(bmw4);
        autoList.add(mercE);
        autoList.add(mercA);
        autoList.add(kia);

        int result = autoService.getOnlyBmwCars(autoList, "BMW").size();
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void arrayAutoSportCars2() {
        List<Auto> autoList = new ArrayList<>();
        autoList.add(bmw4);
        autoList.add(mercE);
        autoList.add(mercA);
        autoList.add(kia);

        List<Auto> bmwCarsResult = autoService.getSportCars(autoList);

        Arrays.stream(new List[]{bmwCarsResult})
                .forEach(System.out::println);
    }

    @Test
    public void getOnlyAutomaticTypeCars1() {
        List<Auto> autoList = new ArrayList<>();
        autoList.add(bmw4);
        autoList.add(mercE);
        autoList.add(mercA);
        autoList.add(kia);

        int result = autoService.getOnlyAutomaticTypeCars(autoList, "AT").size();
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getOnlyAutomaticTypeCars2() {
        List<Auto> autoList = new ArrayList<>();
        autoList.add(bmw4);
        autoList.add(mercE);
        autoList.add(mercA);
        autoList.add(kia);

        List<Auto> carsResultAT = autoService.getOnlyAutomaticTypeCars(autoList, "AT");

        Arrays.stream(new List[]{carsResultAT})
                .forEach(System.out::println);
    }

    @Test
    public void arrayCarMercedecE() {
        List<Auto> autoList = new ArrayList<>();
        autoList.add(bmw4);
        autoList.add(mercE);
        autoList.add(mercA);
        autoList.add(kia);
        List<Auto> carMercedecE = autoService.getOnlyMercedecECars(autoList, "mercedec");

        Arrays.stream(new List[]{carMercedecE})
                .forEach(System.out::println);
    }
}