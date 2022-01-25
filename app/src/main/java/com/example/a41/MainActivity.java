package com.example.a41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ボタンの設定
        Button button1 = findViewById(R.id.answerBtn1);
        Button button2 = findViewById(R.id.answerBtn2);
        Button button3 = findViewById(R.id.answerBtn3);
        Button button4 = findViewById(R.id.answerBtn4);
        //MainActivity2に画面遷移
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent (getApplication(), MainActivity2.class);
                startActivity(intent1);
                }
        });
        //MainActivity3に画面遷移
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent (getApplication(), MainActivity3.class);
                startActivity(intent2);
            }
        });
        //MainActivity4に画面遷移
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent (getApplication(), MainActivity4.class);
                startActivity(intent3);
            }
        });
        //MainActivity5に画面遷移
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent (getApplication(), MainActivity5.class);
                startActivity(intent4);
            }
        });


    }
}