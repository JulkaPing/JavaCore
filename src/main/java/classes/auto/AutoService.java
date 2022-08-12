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
    public Auto[] getOnlyBmwCars(Auto[] autos, String marka) {
        int countResult = 0;
        for (Auto auto : autos) {
            if (auto.getMarkaAuto().equals(marka)) {
                countResult++;
            }
        }
        Auto[] bmwCars = new Auto[countResult];
        for (Auto auto : autos) {
            if (auto.getMarkaAuto().equals(marka)) {
                countResult --;
                bmwCars[countResult] = auto;
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
        for (Auto auto : autos) {
            if (auto.getAmountOfCarSeats() == 2) {
                countResult++;
            }
        }
        Auto[] sportCars = new Auto[countResult];
        for (Auto auto : autos) {
            if (auto.getAmountOfCarSeats() == 2) {
                countResult --;
                sportCars[countResult] = auto;
            }
        }
        return sportCars;
    }
    /**
     * Данный метод возвращает автомобили только с автоматической коробкой передач
     * @param autos все автомобили
     * @return автомобили с автоматической коробкой передач
     */
    public Auto[] getOnlyAutomaticTypeCars(Auto[] autos, String typeTransmission) {
        int countResult = 0;
        for (Auto auto : autos) {
            if (auto.getTypeTransmission().equals(typeTransmission)) {
                countResult++;
            }
        }
        Auto[] carTransmissionAT = new Auto[countResult];
        for (Auto auto : autos) {
            if (auto.getTypeTransmission().equals(typeTransmission)) {
                countResult --;
                carTransmissionAT[countResult] = auto;
            }
        }
        return carTransmissionAT;
    }

    /**
     * Данный метод возвращает автомобили Мерседес Е - класса
     * @param autos все автомобили
     * @ retutn автомобили мерседес Е - класса
     */

    public Auto[] getOnlyMercedecECars(Auto[] autos, String markaAuto) {
        int countResult = 0;
        for (Auto auto : autos) {
            if (auto.getMarkaAuto().equals(markaAuto) && auto.getModelAuto().contains("E")) {
                countResult++;
            }
        }
        Auto[] MercedecECars = new Auto[countResult];
        for (Auto auto : autos) {
            if (auto.getMarkaAuto().equals(markaAuto) && auto.getModelAuto().contains("E")) {
                countResult --;
                MercedecECars[countResult] = auto;
            }
        }
        return MercedecECars;
    }


}
