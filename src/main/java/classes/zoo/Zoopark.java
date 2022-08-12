package classes.zoo;

import java.util.Arrays;

/**
 * Зоопарк
 */
public class Zoopark {
    private String title;
    private double priceTicket;
    private Animal[] animals;

    public Zoopark(String title, double priceTicket, Animal[] animals) {
        this.title = title;
        this.priceTicket = priceTicket;
        this.animals = animals;
    }
    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
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
                "title='" + title + '\'' +
                ", priceTicket=" + priceTicket +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }



}
