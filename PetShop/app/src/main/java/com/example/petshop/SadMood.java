package com.example.petshop;

public class SadMood extends Mood {

    public SadMood() {
        super();
    }

    public SadMood(String date) {
        super(date);
    }

    @Override
    public String getMoodType() {
        return "Sad";
    }
}
