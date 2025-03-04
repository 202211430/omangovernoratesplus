package com.example.omangovernoratesplus;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    TextView txt_userid;
    Button btn_submit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_userid= findViewById(R.id.txt_userid);
        btn_submit= findViewById(R.id.btn_submit);

        DatabaseReference conn= FirebaseDatabase.getInstance().getReference().child("logins");



        conn.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                //System.out.println("Helllo");
                for(DataSnapshot snapshot1:snapshot.getChildren())
                {
                    //if(snapshot1.getKey().equals("username"))
                    System.out.println("The data is "+snapshot1.getValue());

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text;
                text=txt_userid.getText().toString();
                Toast.makeText(MainActivity.this,text,Toast.LENGTH_LONG).show();
            }
        });
    }
}
