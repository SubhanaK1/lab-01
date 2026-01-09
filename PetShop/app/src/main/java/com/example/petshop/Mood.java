package com.example.petshop;

public abstract class Mood {
    private String date;   // encapsulated attribute

    // Constructor #1: default date
    public Mood() {
        this.date = "Unknown";
    }

    // Constructor #2: date provided
    public Mood(String date) {
        this.date = date;
    }

    // Getter
    public String getDate() {
        return date;
    }

    // Setter
    public void setDate(String date) {
        this.date = date;
    }

    // Each mood must return a string representing that mood
    public abstract String getMoodType();
}
