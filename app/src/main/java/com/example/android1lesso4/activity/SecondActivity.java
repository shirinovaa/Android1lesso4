package com.example.android1lesso4.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.android1lesso4.R;

public class SecondActivity extends AppCompatActivity {

    TextView title, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        title = findViewById(R.id.main_title);
        description = findViewById(R.id.desc_text);

        String main = getIntent().getStringExtra("kay");
        String desc = getIntent().getStringExtra("lok");
        title.setText(main);
        description.setText(desc);




    }
}