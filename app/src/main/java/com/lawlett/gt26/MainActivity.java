package com.lawlett.gt26;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView image_title;
    Button dog, cat, squirrel;
    Boolean isCat, isDog, isSquirrel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initButtons();
    }

    private void initButtons() {
        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image_title.setText("Это собака");
                if (isDog) {
                    Toast.makeText(MainActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image_title.setText("Это кошка");
                if (isCat) {
                    Toast.makeText(MainActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();

                }
            }
        });
        squirrel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image_title.setText("Это белка");
                if (isSquirrel) {
                    Toast.makeText(MainActivity.this, "Правильно", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Не правильно", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    private void initViews() {
        imageView = findViewById(R.id.my_image);
        image_title = findViewById(R.id.image_title);
        dog = findViewById(R.id.dog);
        cat = findViewById(R.id.cat);
        squirrel = findViewById(R.id.squirrel);
    }

    public void changeImage(View view) {
        switch (view.getId()) {
            case R.id.image_one:
                imageView.setImageResource(R.drawable.dog);
                isDog = true;
                isCat = false;
                isSquirrel = false;
                break;
            case R.id.image_two:
                imageView.setImageResource(R.drawable.cat);
                isDog = false;
                isCat = true;
                isSquirrel = false;
                break;
            case R.id.image_three:
                imageView.setImageResource(R.drawable.squirrel);
                isDog = false;
                isCat = false;
                isSquirrel = true;
                break;
        }
    }
}