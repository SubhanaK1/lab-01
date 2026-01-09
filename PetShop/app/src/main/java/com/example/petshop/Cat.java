package com.example.petshop;
import android.util.Log;
public class Cat extends Pet implements Pettable{
    public Cat(String name){
        super(name);
    }
    @Override
    public String speak() {
        return "Meow";
    }

    @Override
    public void pet() {
        Log.d("PetShop", "The cat purrs 🐱");
    }



}
