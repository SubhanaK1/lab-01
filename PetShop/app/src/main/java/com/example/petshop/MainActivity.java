package com.example.petshop;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Cat cat = new Cat("Lucy");
        Dog dog = new Dog("Snoopy");
        //Scorpion scorpion = new Scorpion("Scorponok");

        ArrayList<Pettable> pettablePets = new ArrayList<>();

        pettablePets.add(cat); // ✅ works
        pettablePets.add(dog); // ✅ works
        // pettablePets.add(scorpion); ❌ compile-time error (GOOD)

        for (Pettable p : pettablePets) {
            p.pet();
        }

        ArrayList<Mood> moods = new ArrayList<>();
        moods.add(new HappyMood());
        moods.add(new SadMood("2026-01-08"));

        for (Mood m : moods) {
            Log.d("PetShop", m.getMoodType());
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}