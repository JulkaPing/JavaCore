package classes.auto;

public class Auto {
    private String markaAuto;
    private String modelAuto;
    private int amountOfCarSeats;
    private String typeTransmission;

    private Auto[] autos;

    public Auto(String markaAuto, String modelAuto, int amountOfCarSeats, String typeTransmission) {
        if ((markaAuto.length() == 0) || (modelAuto.length() == 0) ||
                (amountOfCarSeats < 2) || (typeTransmission.length() == 0)){
            System.out.println("Vvedite vce parametri");
            throw new RuntimeException();
        }
        this.markaAuto = markaAuto;
        this.modelAuto = modelAuto;
        this.amountOfCarSeats = amountOfCarSeats;
        this.typeTransmission = typeTransmission;
    }

    public String getMarkaAuto() {
        return markaAuto;
    }

    public void setMarkaAuto(String markaAuto) {
        this.markaAuto = markaAuto;
    }
    public String getModelAuto() {
        return modelAuto;
    }

    public void setModelAuto(String modelAuto) {
        this.modelAuto = modelAuto;
    }

    public int getAmountOfCarSeats() {
        return amountOfCarSeats;
    }

    public void setAmountOfCarSeats(int amountOfCarSeats) {
        this.amountOfCarSeats = amountOfCarSeats;
    }

    public String getTypeTransmission() {
        return typeTransmission;
    }

    public void setTypeTransmission(String typeTransmission) {
        this.typeTransmission = typeTransmission;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "markaAuto='" + markaAuto + '\'' +
                ", modelAuto='" + modelAuto + '\'' +
                ", amountOfCarSeats=" + amountOfCarSeats +
                ", typeTransmission='" + typeTransmission + '\'' +
                '}';
    }
}
