package de.iav.carapp.repository;

import de.iav.carapp.model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@Repository
public class CarReopsitory {

    //Attribute:
    private List<Car> cars;

    //Constructor:
    public CarReopsitory(List<Car> cars) {
        this.cars = cars;
    }

    //Methoden:
    //Fahrzeuge anzeigen:
    public List<Car> getAllCars() {
        return cars;
    }

    //Fahrzeuge anzeigen: nach ID:
    public Car getCarById(String id) {
        for(Car car : cars) {
            if(car.getId().equals(id)) {
                return car;
            }
        }
        throw new NoSuchElementException("There is no Car whit ID: " + id);
    }

    //Fahrzeuge anzeigen: nach VIN:
    public Car getCarByVin(String vin) {
        for(Car car : cars) {
            if(car.getVin().equals(vin)) {
                return car;
            }
        }
        throw new NoSuchElementException("There is no Car with the VIN: " + vin);
    }

    //Fahrzeuge anzeigen: nach Modell:
    public Car getCarByModel(String model) {
        for(Car car : cars) {
            if (car.getModel().equals(model)) {
                return car;
            }
        }
        throw new NoSuchElementException("No Cars of " + model + " in this List.");
    }

    //Fahrzeug hizufügen:
    public void addCar(Car car) {
        car.setId(UUID.randomUUID().toString());
        cars.add(car);
    }

    //Fahrzeug entfernen:
    public void deleteCar(String id) {
        Car carToDelete = getCarById(id);
        cars.remove(carToDelete);
    }

    //Fahrzeug anpassen:
    public Car updateCar(String id, Car car) {
        Car carToUpdate = getCarById(id);

        carToUpdate.setHu(car.getHu());
        carToUpdate.setModel(car.getModel());
        carToUpdate.setRegistrationPlate(car.getRegistrationPlate());
        carToUpdate.setProducer(car.getProducer());
        carToUpdate.setVin(car.getVin());

        return carToUpdate;
    }

}
