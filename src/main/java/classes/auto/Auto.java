package classes.auto;

public class Auto {
    private String modelAuto;
    private String markaAuto;
    private int amountOfCarSeats;       //Количество пассажирских мест
    private String typeTransmission;    //Тип коробки передач


    public Auto(String modelAuto, String markaAuto, int amountOfCarSeats, String typeTransmission) {
        if ((modelAuto.length() == 0) || (markaAuto.length() == 0) || (amountOfCarSeats < 2)){
            System.out.println("Vvedite vce parametri");
            throw new RuntimeException();
        }
        this.modelAuto = modelAuto;
        this.markaAuto = markaAuto;
        this.amountOfCarSeats = amountOfCarSeats;
        this.typeTransmission = typeTransmission;

    }

    public String getModelAuto() {
        return modelAuto;
    }

    public void setModelAuto(String modelAuto) {
        /*if (modelAuto.length() == 0) {
            System.out.println("Vvedite model avto");
            throw new RuntimeException();
        }*/
        this.modelAuto = modelAuto;
    }

    public String getMarkaAuto() {
        return markaAuto;
    }

    public void setMarkaAuto(String markaAuto) {
        /*if (markaAuto.length() == 0) {
            System.out.println("Vvedite marky avto");
            throw new RuntimeException();
        }*/
        this.markaAuto = markaAuto;
    }

    public int getAmountOfCarSeats() {
        return amountOfCarSeats;
    }

    public void setAmountOfCarSeats(int amountOfCarSeats) {
        /*if (amountOfCarSeats < 2) {
            System.out.println("Incorrect amount of cars seats");
            throw new RuntimeException();
        }*/
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
                "modelAuto='" + modelAuto + '\'' +
                ", markaAuto='" + markaAuto + '\'' +
                ", amountOfCarSeats=" + amountOfCarSeats +
                ", typeTransmission='" + typeTransmission + '\'' +
                '}';
    }
}
