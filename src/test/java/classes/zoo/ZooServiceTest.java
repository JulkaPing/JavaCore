package classes.zoo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZooServiceTest {
    @Test
    public void testNameZoopark() {
        Animal animal1 = new Animal("Elephant", "Sophia", 'w', 15);
        Animal animal2 = new Animal("Bear", "Misha", 'm', 6);
        Animal animal3 = new Animal("Tiger", "Gosha", 'm', 5);
        Animal animal4 = new Animal("Tiger", "Masha", 'w', 4);
        Animal animal5 = new Animal("Crocodile", "Grisha", 'm', 50);
        Animal animal6 = new Animal("Crocodile", "Nina", 'w', 40);
        Animal animal7 = new Animal("Monkey", "Nyusya", 'w', 3);

        Zoopark wildAnimalZoo = new Zoopark(
                "wildAnimalZoo",
                5,
                new Animal[]{animal1, animal2, animal3, animal4, animal7});

        Zoopark amphibianZoo = new Zoopark(
                "amphibianZoo",
                8,
                new Animal[]{animal5, animal6});
    }

}