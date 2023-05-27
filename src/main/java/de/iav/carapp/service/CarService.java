package de.iav.carapp.service;

import de.iav.carapp.model.Car;
import de.iav.carapp.repository.CarReopsitory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private CarReopsitory carReopsitory;

    public CarService(CarReopsitory carReopsitory) {
        this.carReopsitory = carReopsitory;
    }

    public List<Car> getAllCars() {
        return carReopsitory.getAllCars();
    }

    public Car getCarById(String id) {
        return carReopsitory.getCarById(id);
    }

    public Car getCarByVin(String vin){
        return carReopsitory.getCarByVin(vin);
    }

    public Car getCarByModel(String model){
        return carReopsitory.getCarByModel(model);
    }

    public void addCar(Car car){
        carReopsitory.addCar(car);
    }

    public void deleteCar(String id){
        carReopsitory.deleteCar(id);
    }

    public Car updateCar(String id, Car car){
        return carReopsitory.updateCar(id, car);
    }
}
