package com.example.animationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_gosub , btn_gosub2 , btn_gosub3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_gosub = findViewById(R.id.btn_gosub);
        btn_gosub2 = findViewById(R.id.btn_gosub2);
        btn_gosub3 = findViewById(R.id.btn_gosub3);

        btn_gosub.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , subActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });

        btn_gosub2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , subActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_in_right);

            }
        });

        btn_gosub3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , subActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_down, R.anim.slide_up);

            }
        });


    }
}