package com.sparklead.Service;


import com.sparklead.Payload.FoodRequest;
import com.sparklead.model.Food;

public interface PetService {

    void postPetFood(FoodRequest foodRequest);

}