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

public class ConstraintActivity extends AppCompatActivity {

    String email,password;
    EditText editText,editText2;
    Button button;
    RadioButton radioButton,radioButton2;
    CheckBox checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);

        editText=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        button=(Button)findViewById(R.id.button);
        radioButton=(RadioButton)findViewById(R.id.radioButton);
        radioButton2=(RadioButton)findViewById(R.id.radioButton2);
        checkBox2=(CheckBox)findViewById(R.id.checkBox2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email=editText.getText().toString();
                password=editText2.getText().toString();
                Toast.makeText(ConstraintActivity.this,email+"  "+password,Toast.LENGTH_LONG).show();
            }
        });
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(ConstraintActivity.this,"Male is checked",Toast.LENGTH_SHORT).show();
            }
        });
        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(ConstraintActivity.this,"Femal is checked",Toast.LENGTH_SHORT).show();
            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConstraintActivity.this,"Terms and condition is Accepted",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
