package com.example.petshop;

public class HappyMood extends Mood {

    public HappyMood() {
        super();
    }

    public HappyMood(String date) {
        super(date);
    }

    @Override
    public String getMoodType() {
        return "Happy";
    }
}

