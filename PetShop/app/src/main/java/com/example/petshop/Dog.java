package com.example.petshop;

import java.util.Date;

import android.util.Log;

public class Dog extends Pet implements Pettable{

    public Dog(String name){
        super(name);
    }

    public Dog(String name, Date birthDate){
        super(name, birthDate);

    }

    public String speak(){
        return "bark";
    }

    @Override
    public void pet() {
        Log.d("PetShop", "The dog wags tail 🐶");
    }
}
