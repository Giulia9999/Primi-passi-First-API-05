package it.develhope.primi_passi_first.API_05;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {

    @GetMapping("/car")
    public CarDTO getCar(){
        CarDTO car = new CarDTO();
        car.setId("1234");
        car.setModelName("Ferrari");
        car.setPrice(50000.0);
        return car;
    }

    @PostMapping("/createCar")
    public HttpStatus createCar(@Valid @RequestBody CarDTO car){
        System.out.println(car.toString());
        return HttpStatus.CREATED;
    }
}
