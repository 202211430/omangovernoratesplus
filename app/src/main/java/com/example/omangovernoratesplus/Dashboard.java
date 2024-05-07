package com.example.omangovernoratesplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {
    Button btn_dashboard_signout;
    Button butmuscat;
    Button butADakhiliya;
    Button butADhahirah;
    Button butBNorth;
    Button butBSouth;
    Button butBuraimi;
    Button butAlwusta;
    Button butSNorth;
    Button butSSouth;
    Button butDhofar;
    Button butMusandam;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        btn_dashboard_signout=findViewById(R.id.btn_dashboard_logout);
        butmuscat=findViewById(R.id.butmuscat);
        butADakhiliya =findViewById(R.id.butADakhiliya);
        butADhahirah =findViewById(R.id.butADhahirah);
        butBNorth =findViewById(R.id.butBNorth);
        butBSouth= findViewById(R.id.butBSouth);
        butBuraimi=findViewById(R.id.butBuraimi);
        butAlwusta =findViewById(R.id.butAlwusta);
        butSNorth =findViewById(R.id.butSNorth);
        butSSouth =findViewById(R.id.butSSouth);
        butDhofar=findViewById(R.id.butDhofar);
        butMusandam =findViewById(R.id.butMusandam);




        btn_dashboard_signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Dashboard.this,Login.class);
                startActivity(intent);

            }

        });
        butmuscat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Muscat.class);
                startActivity(intent);
            }
        });

        butADakhiliya.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this,ADakhiliya.class);
                startActivity(intent);
            }


        });
        butADhahirah.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this,ADhahirah.class);
                startActivity(intent);
            }

        });
        butBNorth.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, AlBatinahNorth.class);
                startActivity(intent);
            }


        });

        butBSouth.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, AlBatinahSouth.class);
                startActivity(intent);
            }


        });
        butBuraimi.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, AlBuraimi.class);
                startActivity(intent);
            }


        });

        butAlwusta.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this,AlWusta.class);
                startActivity(intent);
            }


        });

        butSNorth.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this,ASharqiyahNorth.class);
                startActivity(intent);
            }


        });
        butSSouth.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this,ASharqiyahSouth.class);
                startActivity(intent);
            }


        });
        butDhofar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this,Dhofar.class);
                startActivity(intent);
            }


        });
        butMusandam.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(Dashboard.this, Musandam.class);
                startActivity(intent);
            }


        });

    }


}
