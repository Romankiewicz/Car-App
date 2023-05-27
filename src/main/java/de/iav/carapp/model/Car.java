package de.iav.carapp.model;

import java.util.Objects;

public class Car {

    //Attribute
    private String producer;
    private String colour;
    private String model;
    private String vin;
    private boolean hu;
    private String id;
    private String registrationPlate;

    //Constructor:
    public Car(String producer, String model, String vin, boolean hu, String id, String registrationPlate, String colour) {
        this.producer = producer;
        this.model = model;
        this.vin = vin;
        this.hu = hu;
        this.id = id;
        this.registrationPlate = registrationPlate;
        this.colour = colour;
    }

    //Getter&Setter:

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public boolean getHu() {
        return hu;
    }

    public void setHu(boolean hu) {
        this.hu = hu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isHu() {
        return hu;
    }

    //Equals&Hashcode:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return hu == car.hu && Objects.equals(producer, car.producer) && Objects.equals(colour, car.colour) && Objects.equals(model, car.model) && Objects.equals(vin, car.vin) && Objects.equals(id, car.id) && Objects.equals(registrationPlate, car.registrationPlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, colour,  vin, hu, id, registrationPlate);
    }


    //ToString Methode:


    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", vin='" + vin + '\'' +
                ", hu=" + hu +
                ", id='" + id + '\'' +
                ", registrationPlate='" + registrationPlate + '\'' +
                '}';
    }

}
