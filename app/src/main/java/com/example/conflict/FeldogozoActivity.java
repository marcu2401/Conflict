package com.example.conflict;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FeldogozoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feldogozo);

        TextView kimenet = findViewById(R.id.kimenet);

        Bundle extras = getIntent().getExtras();

        if (extras != null){
                kimenet.setText(extras.getString("valami"));
        }

    }
}