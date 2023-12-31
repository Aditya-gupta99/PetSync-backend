package com.sparklead.Controllers;

import com.sparklead.Payload.FoodRequest;
import com.sparklead.Service.PetService;
import com.sparklead.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/petSync")
public class PetController {

    @Autowired
    private PetService petService;

    @PostMapping("/food")
    public void postPetFood(@RequestBody FoodRequest foodRequest) {
        petService.postPetFood(foodRequest);
    }

    @GetMapping("/allList")
    public List<Food> getAllListFood() {
        return petService.getListPetFood();
    }
}