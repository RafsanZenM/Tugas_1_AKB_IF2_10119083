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

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button_profile);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityProfile();
            }
        });
    }
    public void openActivityProfile(){
        Intent intent = new Intent(this, ProfiileActivity.class);
        startActivity(intent);
    }

}