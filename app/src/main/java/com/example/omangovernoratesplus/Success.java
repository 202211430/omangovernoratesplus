package com.example.omangovernoratesplus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Success extends AppCompatActivity {
    Button btn_success_logout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        btn_success_logout=findViewById(R.id.btn_success_logout);

        btn_success_logout.setOnClickListener(view -> {
            Intent intent= new Intent(Success.this,Login.class);
            startActivity(intent);

        });
    }


}