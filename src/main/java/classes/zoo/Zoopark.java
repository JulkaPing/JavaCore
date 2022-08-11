package classes.zoo;

import java.util.Arrays;

/**
 * Зоопарк
 */

public class Zoopark {
    private String name;
    private double priceTicket;
    private Animal[] animals;

    public Zoopark(String name, double priceTicket, Animal[] animals) {
        this.name = name;
        this.priceTicket = priceTicket;
        this.animals = animals;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(double priceTicket) {
        this.priceTicket = priceTicket;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Zoopark{" +
                "name='" + name + '\'' +
                ", priceTicket=" + priceTicket +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }



}
