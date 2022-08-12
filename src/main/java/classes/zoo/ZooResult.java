package classes.zoo;

public class ZooResult {
    String name;
    int sizeAnimals;

    public ZooResult(String name, int sizeAnimals) {
        this.name = name;
        this.sizeAnimals = sizeAnimals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeAnimals() {
        return sizeAnimals;
    }

    public void setSizeAnimals(int sizeAnimals) {
        this.sizeAnimals = sizeAnimals;
    }
}
