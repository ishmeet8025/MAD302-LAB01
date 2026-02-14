/**
 * Course: MAD302 – Android Development
 * Lab 01
 * Name: Ishmeet Singh
 * Student ID: A00202436
 * Date: Feb 14 2026
 *
 * Description:
 * Simple Android Java application that allows user to enter
 * Name and Age, store profiles in ArrayList and display them.
 * Lifecycle methods are logged.
 */

package com.example.profilelistapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etName, etAge;
    Button btnAdd;
    TextView tvProfiles;

    ArrayList<Profile> profiles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Lifecycle","onCreate");
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etAge = findViewById(R.id.etAge);
        btnAdd = findViewById(R.id.btnAdd);
        tvProfiles = findViewById(R.id.tvProfiles);

        btnAdd.setOnClickListener(v -> {

            String name = etName.getText().toString();
            int age = Integer.parseInt(etAge.getText().toString());

            Profile profile = new Profile(name, age);
            profiles.add(profile);

            displayProfiles();
        });
    }

    /**
     * Displays profiles using for loop
     */
    private void displayProfiles(){
        StringBuilder builder = new StringBuilder();
        for(Profile p : profiles){
            builder.append(p.name + " – " + p.age + "\n");
        }
        tvProfiles.setText(builder.toString());
    }

    protected void onStart(){super.onStart();Log.d("Lifecycle","onStart");}
    protected void onResume(){super.onResume();Log.d("Lifecycle","onResume");}
    protected void onPause(){super.onPause();Log.d("Lifecycle","onPause");}
    protected void onStop(){super.onStop();Log.d("Lifecycle","onStop");}
    protected void onDestroy(){super.onDestroy();Log.d("Lifecycle","onDestroy");}
}
