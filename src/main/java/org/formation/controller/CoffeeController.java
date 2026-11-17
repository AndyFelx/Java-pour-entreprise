package org.formation.controller;

import lombok.RequiredArgsConstructor;
import org.formation.dto.CoffeeDto;
import org.formation.entity.Coffee;
import org.formation.service.CoffeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CoffeeController {
    private final CoffeeService service;

    @GetMappping("coffees")
    List<Coffee> coffees(){

        return service.allCoffees();
    }

    @GetMapping("coffees/{fid}")
    Optional<CoffeeDto> coffeeById(@PathVariable Long id){
        return service.save
    }

    @GetMapping("coffees/{id}")
    ResponseEntity<CoffeeDto> coffee(@PathVariable Long id){
        return service.oneCoffee(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
