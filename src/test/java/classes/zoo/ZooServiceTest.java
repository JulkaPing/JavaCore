package classes.zoo;

import org.junit.Assert;
import org.junit.Test;

public class ZooServiceTest {

    private Zoopark[] zooparks = {
            new Zoopark("wildAnimalZoo", 525, new Animal[]{
                                                            new Animal("Elephant", 50),
                                                            new Animal("Bear", 5),
                                                            new Animal("Tiger", 8),
                                                            new Animal("Monkey", 4)
                                                            }
            ),
            new Zoopark("amphibianZoo", 800,  new Animal[]{
                                                            new Animal("Crocodile", 43),
                                                            new Animal("snake", 12)
                                                            }
            ),
            new Zoopark("otherAnimalZoo", 320, new Animal[]{
                                                            new Animal("Bird", 3),
                                                            new Animal("Fish", 1),
                                                            }
            )
    };

    @Test
    public void getAveragePriceZoos() {

        ZooService zooService = new ZooService();

        double result = zooService.getAveragePriceZoos(zooparks);
        double expected = 548.33;
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void getZooBiggestAnimals() {

        ZooService zooService = new ZooService();

        ZooResult resultName = zooService.getZooBiggestAnimals(zooparks);
        String expectedName = "wildAnimalZoo";
        int expectedAnimalsSize = 4;

        Assert.assertEquals(expectedName, resultName.getName());
        Assert.assertEquals(expectedAnimalsSize, resultName.getSizeAnimals());
    }
}