package classes.auto;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Auto mercedec = new Auto("mercedec", "mercedec-E", 2, "AT" );
        Auto BMW4 = new Auto("BMW", "BMW X4", 4, "MKP" );
        Auto BMW6 = new Auto("BMW", "BMW X6", 5, "AT");

        Auto[] cars = new Auto[3];
        cars[0] = mercedec;
        cars[1] = BMW4;
        cars[2] = BMW6;
        for (Auto value : cars) {
            System.out.println(value);
        }
    }
}
