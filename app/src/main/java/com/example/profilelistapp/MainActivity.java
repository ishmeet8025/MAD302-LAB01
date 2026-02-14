/**
 * Course: MAD302 – Android Development
 * Lab 01
 * Name: Ishmeet Singh
 * Student ID: A00202436
 *
 * Description:
 * Profile List Android App using Java.
 */

package com.example.profilelistapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.*;
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
            profiles.add(new Profile(name, age));
            display();
        });
    }

    private void display(){
        StringBuilder sb = new StringBuilder();
        for(Profile p:profiles){
            sb.append(p.name+" – "+p.age+"\n");
        }
        tvProfiles.setText(sb.toString());
    }

    protected void onStart(){super.onStart();Log.d("Lifecycle","onStart");}
    protected void onResume(){super.onResume();Log.d("Lifecycle","onResume");}
    protected void onPause(){super.onPause();Log.d("Lifecycle","onPause");}
    protected void onStop(){super.onStop();Log.d("Lifecycle","onStop");}
    protected void onDestroy(){super.onDestroy();Log.d("Lifecycle","onDestroy");}
}
