package classes.zoo;

import javax.xml.namespace.QName;

public class ZooService {

    /**
     * Метод, который определяет среднюю стоимость билета из общего количества зоопарков
     * @param zooparks все зоопарки
     * @return средняя цена билета
     */
    public double getAveragePriceZoos(Zoopark[] zooparks) {
        double averageTicketPrice = 0; //средняя
        double allPrices = 0;
        for (Zoopark zoopark : zooparks) {
            allPrices = allPrices + zoopark.getPriceTicket();
        }
        return allPrices/zooparks.length;
    }

    /**
     * Метод, который находит название зоопарка с самым большим количеством животных
     * @param zooparks все зоопарки
     * @return название зоопарка
     */
    public ZooResult getZooBiggestAnimals(Zoopark[] zooparks) {
        int countAnimals = 0;
        String titleZoo = "";
        for (Zoopark zoopark : zooparks ) {
            if ( zoopark.getAnimals().length > countAnimals) {
                countAnimals = zoopark.getAnimals().length;
                titleZoo = zoopark.getName();
            }
        }
        return new ZooResult(titleZoo, countAnimals);
    }








}
