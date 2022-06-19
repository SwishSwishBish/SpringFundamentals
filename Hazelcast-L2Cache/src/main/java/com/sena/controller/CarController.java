package com.sena.controller;

import com.sena.entity.Car;
import com.sena.repo.ICarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CarController {

    private final ICarRepository carRepository;

    @GetMapping("/{id}")
    public Car getCar(@PathVariable Long id) {
        return carRepository.getOne(id);
    }

    @GetMapping
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @PostMapping
    public Car save(@RequestBody Car car) {
        return carRepository.save(car);
    }
}