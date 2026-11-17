package org.formation.service;

import org.formation.dto.CoffeeDto;

import java.util.List;

public interface CoffeeService {
    List<CoffeeDto> allCoffees();
    List<CoffeeDto> oneCoffee(Long id);
}
