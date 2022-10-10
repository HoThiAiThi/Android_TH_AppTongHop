package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView detail_img;
    TextView detail_back, detail_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        detail_img = findViewById(R.id.detail_img);
        detail_back = findViewById(R.id.detail_back);
        detail_title= findViewById(R.id.detail_title);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null) {
            int i = bundle.getInt("sourceImg");
            detail_img.setImageResource(i);
            detail_title.setText(bundle.getString("title"));
        }

        detail_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


    }
}