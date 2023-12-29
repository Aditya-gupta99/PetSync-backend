package com.sparklead.Service;


import com.sparklead.Payload.FoodRequest;
import com.sparklead.model.Food;

import java.util.List;

public interface PetService {

    void postPetFood(FoodRequest foodRequest);

    List<Food> getListPetFood();

}