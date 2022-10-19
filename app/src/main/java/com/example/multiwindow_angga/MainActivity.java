package com.example.multiwindow_angga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtuser;
    EditText txtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtuser = (EditText) findViewById(R.id.editTextTextPersonName);
        txtpass = (EditText) findViewById(R.id.editTextTextPassword);

        Button logbtn = (Button) findViewById(R.id.btn_move);

        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtuser.getText().toString().equals("Angga") && txtpass.getText().toString().equals("123")) {
                    Toast.makeText(getApplicationContext(),"LOGIN BERHASIL", Toast.LENGTH_LONG).show();
                    Intent login = new Intent (MainActivity.this, Home.class);
                    startActivity(login);
                } else
                Toast.makeText(MainActivity.this, "User atau Password Salah", Toast.LENGTH_SHORT).show();
            }
//            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this, Home.class));
//          }
        });
    }
}