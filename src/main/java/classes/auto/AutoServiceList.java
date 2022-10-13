package classes.auto;

import java.util.ArrayList;
import java.util.List;

/**
 *Сервис по работе с автомобилями
 */
public class AutoServiceList {
    /**
     * Данный метод возвращает автомобили марки BMW
     * @param autos все автомобили
     * @return массив автомобилей БМВ
     */
    public List<Auto> getOnlyBmwCars(List<Auto> autos, String marka) {
        List<Auto> bmwCars = new ArrayList<>();
        int resultSize = 0;
        for (Auto auto : autos) {
            if (auto.getMarkaAuto().equals(marka)) {
                bmwCars.add(auto);
                resultSize++;
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
    public List<Auto> getSportCars(List<Auto> autos) {
        List<Auto> sportCars = new ArrayList<>();
        int resultSize = 0;
        for (Auto auto : autos) {
            if (auto.getAmountOfCarSeats() == 2) {
                sportCars.add(auto);
                resultSize++;
            }
        }
        return sportCars;
    }

    /**
     * Данный метод возвращает автомобили только с автоматической коробкой передач
     * @param autos все автомобили
     * @return автомобили с автоматической коробкой передач
     */
    public List<Auto> getOnlyAutomaticTypeCars(List<Auto> autos, String typeTransmission) {
        List<Auto> carTransmissionAT = new ArrayList<>();
        int resultSize = 0;
        for (Auto auto : autos) {
            if (auto.getTypeTransmission().equals(typeTransmission)) {
                carTransmissionAT.add(auto);
                resultSize++;
            }
        }
        return carTransmissionAT;
    }

    /**
     * Данный метод возвращает автомобили Мерседес Е - класса
     * @param autos все автомобили
     * @ retutn автомобили мерседес Е - класса
     */
    public List<Auto> getOnlyMercedecECars(List<Auto> autos, String markaAuto) {
        List<Auto> MercedecECars = new ArrayList<>();
        int resultSize = 0;
        for (Auto auto : autos) {
            if (auto.getMarkaAuto().equals(markaAuto) && auto.getModelAuto().contains("E")) {
                MercedecECars.add(auto);
                resultSize++;
            }
        }
        return MercedecECars;
    }
}
