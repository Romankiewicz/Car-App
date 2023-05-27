package de.iav.carapp.controller;

import de.iav.carapp.model.Car;
import de.iav.carapp.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }

    @GetMapping("/getcar/byid/{id}")
    public Car getCarById(@PathVariable String id){
        return carService.getCarById(id);
    }

    @GetMapping("/getcar/byvin/{vin}")
    public Car getCarByVin(@PathVariable String vin){
        return carService.getCarByVin(vin);
    }

    @GetMapping("getcar/bymodel/{model}")
    public Car getCarByModel(@PathVariable String model){
        return carService.getCarByModel(model);
    }

    @PostMapping("/addcar")
    public void addCar(Car car){
        carService.addCar(car);
    }

    @PostMapping("/updatecar/{id},{car}")
    public Car updateCar(@PathVariable String id, @PathVariable Car car){
        return carService.updateCar(id ,car);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCar(@PathVariable String id){
         carService.deleteCar(id);
    }
}
