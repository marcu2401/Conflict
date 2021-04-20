package com.example.conflict;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText valami =findViewById(R.id.valami);
        Button kuldes =findViewById(R.id.kuldes);


        kuldes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, FeldogozoActivity.class);

                i.putExtra("valami" ,valami.getText().toString());
                startActivity(i);
            }
        });

    }
    private int osszeAd(int a, int b){
        return a+b;
    }
}