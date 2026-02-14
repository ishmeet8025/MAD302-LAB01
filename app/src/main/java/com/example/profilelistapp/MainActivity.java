package com.example.profilelistapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // List to store profiles
    private ArrayList<Profile> profiles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get UI references
        EditText etName = findViewById(R.id.etName);
        EditText etAge = findViewById(R.id.etAge);
        Button btnAdd = findViewById(R.id.btnAdd);
        TextView tvProfiles = findViewById(R.id.tvProfiles);

        // Button click listener
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = etName.getText().toString().trim();
                String ageText = etAge.getText().toString().trim();

                // Input validation
                if (name.isEmpty() || ageText.isEmpty()) {
                    Toast.makeText(MainActivity.this,
                            "Please enter all fields",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                int age = Integer.parseInt(ageText);

                Profile profile = new Profile(name, age);
                profiles.add(profile);

                // Display profiles
                StringBuilder builder = new StringBuilder();
                builder.append("----- Profile List -----\n\n");

                for (int i = 0; i < profiles.size(); i++) {
                    builder.append("Profile ").append(i + 1).append("\n");
                    builder.append("Name: ").append(profiles.get(i).getName()).append("\n");
                    builder.append("Age: ").append(profiles.get(i).getAge()).append("\n");
                    builder.append("-----------------------\n\n");
                }

                tvProfiles.setText(builder.toString());

                etName.setText("");
                etAge.setText("");
            }
        });
    }
}
