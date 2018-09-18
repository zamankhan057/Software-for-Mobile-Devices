package com.myfirstapplication.zamankhan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btrelative,btconstraint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btrelative=(Button) findViewById(R.id.btrelative);
        btconstraint=(Button) findViewById(R.id.btconstrain) ;


        btrelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent ;
                intent    = new Intent(MainActivity.this, RelativeActivity.class);
                startActivity(intent);


            }
        });
        btconstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this, ConstraintActivity.class);
                startActivity(intent);


            }
        });
    }
}
