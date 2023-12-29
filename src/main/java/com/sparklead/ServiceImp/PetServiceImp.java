package com.sparklead.ServiceImp;

import com.sparklead.Payload.FoodRequest;
import com.sparklead.Repository.PetRepository;
import com.sparklead.Service.PetService;
import com.sparklead.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImp implements PetService {

    @Autowired
    private PetRepository petRepository;

    @Override
    public void postPetFood(FoodRequest foodRequest) {
        Food food = new Food();
        food.setPet(foodRequest.getPet());
        food.setTimestamp(foodRequest.getTimestamp());
        petRepository.save(food);
    }

    @Override
    public List<Food> getListPetFood() {
        return petRepository.findAll();
    }
}