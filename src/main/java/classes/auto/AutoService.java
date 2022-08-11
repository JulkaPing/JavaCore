package classes.auto;

/**
 *Сервис по работе с автомобилями
 */
public class AutoService {

    /**
     * Данный метод возвращает автомобили марки BMW
     * @param autos все автомобили
     * @return массив автомобилей БМВ
     */
    public Auto[] getOnlyBmwCars(Auto[] autos) {
        int countResult = 0;
        for (int i = 0; i < autos.length; i++) {
            if (autos[i].getMarkaAuto().equals("BMW")) {
                countResult++;
            }
        }

        Auto[] bmwCars = new Auto[countResult];
        for (int i = 0, j = 0; i < autos.length; i++) {
            if (autos[i].getMarkaAuto().equals("BMW")) {
                bmwCars[j++] = autos[i];
            }
        }
        return bmwCars;
    }

    /**
     * Принято считать что если автомобиль двух-местный, то он из спорт-класса
     * Данный метод возвращает автомобили спорт-класса
     * "param autos все автомобили
     * @return автомобили спорт-класса
     */
    public Auto[] getSportCars(Auto[] autos) {
        int countResult = 0;
        for (int i = 0; i < autos.length; i++) {
            if (autos[i].getAmountOfCarSeats() == 2) {
                countResult++;
            }
        }
        Auto[] sportCars = new Auto[countResult];
        for (int i = 0, j = 0; i < autos.length; i++) {
            if (autos[i].getAmountOfCarSeats() == 2) {
                sportCars[j++] = autos[i];
            }
        }
        return sportCars;
    }
    /**
     * Данный метод возвращает автомобили только с автоматической коробкой передач
     * @param autos все автомобили
     * @return автомобили с автоматической коробкой передач
     */
    public Auto[] getOnlyAutomaticTypeCars(Auto[] autos) {
        int countResult = 0;
        for (int i = 0; i < autos.length; i++) {
            if (autos[i].getTypeTransmission().equals("AT")) {
                countResult++;
            }
        }
        Auto[] carTransmissionAT = new Auto[countResult];
        for (int i = 0, j = 0; i < autos.length; i++) {
            if (autos[i].getTypeTransmission().equals("AT")) {
                carTransmissionAT[j++] = autos[i];
            }
        }
        return carTransmissionAT;
    }

    /**
     * Данный метод возвращает автомобили Мерседес Е - класса
     * @param autos все автомобили
     * @ retutn автомобили мерседес Е - класса
     */

    public Auto[] getOnlyMercedecECars(Auto[] autos) {
        int countResult = 0;
        for (int i = 0; i < autos.length; i++) {
            if (autos[i].getModelAuto().equals("mercedec-E")) {
                countResult++;
            }
        }

        Auto[] MercedecECars = new Auto[countResult];
        for (int i = 0, j = 0; i < autos.length; i++) {
            if (autos[i].getModelAuto().equals("mercedec-E")) {
                MercedecECars[j++] = autos[i];
            }
        }
        return MercedecECars;
    }
}
