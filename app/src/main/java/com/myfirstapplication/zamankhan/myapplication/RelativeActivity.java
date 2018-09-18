package com.myfirstapplication.zamankhan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class RelativeActivity extends AppCompatActivity {
   String email,password;
    EditText etmail,etpassword;
    Button register;
    RadioButton rbmale,rbfemal;
    CheckBox checkbox1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        etmail=(EditText) findViewById(R.id.etmail);
        etpassword=(EditText) findViewById(R.id.etpassword);
        register=(Button) findViewById(R.id.btregister);
        rbmale=(RadioButton) findViewById(R.id.rbmale);
        rbfemal=(RadioButton) findViewById(R.id.rbfemal);
        checkbox1=(CheckBox) findViewById(R.id.termandcondition);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email=etmail.getText().toString();
                password=etpassword.getText().toString();
                Toast.makeText(RelativeActivity.this,email+"  "+password,Toast.LENGTH_LONG).show();
            }
        });
        rbmale.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(RelativeActivity.this,"Male is checked",Toast.LENGTH_SHORT).show();
            }
        });
        rbfemal.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(RelativeActivity.this,"Femal is checked",Toast.LENGTH_SHORT).show();
            }
        });

        checkbox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RelativeActivity.this,"Terms and condition is Accepted",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
