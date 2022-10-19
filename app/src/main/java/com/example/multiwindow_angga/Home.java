package com.example.multiwindow_angga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnMove = findViewById(R.id.btn_berita);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this, berita.class));
            }
        });

        Button btnMovetoProfile = findViewById(R.id.btn_Profile);
        btnMovetoProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this, profile.class));
            }
        });

        Button btnMovetoLogin = findViewById(R.id.btn_Exits);
        btnMovetoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this, MainActivity.class));
            }
        });

    }
}