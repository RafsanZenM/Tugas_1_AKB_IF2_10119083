package com.example.tugas_1_akb_if2_10119083;
//Nama : Rafsan Zen Mustaofa
//Nim : 10119083
//kelas : IF-2
//23/04/2022
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RegistActivity extends AppCompatActivity {

    private Button btnLogin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        btnLogin2 = findViewById(R.id.btn_login2);

        btnLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //action
                Intent intent = new Intent(RegistActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}