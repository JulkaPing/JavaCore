package classes.auto;

import java.util.Arrays;

public class Main {

    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args) {
        Auto car1 = new Auto("mercedec", "mercedec-E", 2, "AT" );
        Auto car2 = new Auto("mercedec", "mercedec-A",4, "AT");
        Auto car3 = new Auto("BMW", "BMW X4", 2, "MKP" );
        Auto car4 = new Auto("BMW", "BMW X6", 4, "AT");
        Auto[] autos = {car1, car2, car3, car4};







    }
}
