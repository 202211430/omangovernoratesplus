package com.example.omangovernoratesplus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AlBatinahSouth extends AppCompatActivity {

    Button buthome;
    @Override

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_batinah_south);
        buthome =findViewById(R.id.buthome);
        buthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlBatinahSouth.this,Dashboard.class);
                startActivity(intent);
            }
        });
    }
}