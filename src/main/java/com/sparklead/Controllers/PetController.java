package com.sparklead.Controllers;

import com.sparklead.Payload.FoodRequest;
import com.sparklead.Service.PetService;
import com.sparklead.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/petSync")
public class PetController {

    @Autowired
    private PetService petService;

    @PostMapping("/post")
    public void postPetFood(@RequestBody FoodRequest foodRequest){
        petService.postPetFood(foodRequest);
    }

}