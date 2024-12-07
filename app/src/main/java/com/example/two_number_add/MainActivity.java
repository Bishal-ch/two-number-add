package com.example.two_number_add;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button btn1,btn2,btn3,btn4;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        res=findViewById(R.id.res);

        //add
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a=Float.parseFloat(num1.getText().toString());
                float b=Float.parseFloat(num2.getText().toString());
                float c=a+b;

                res.setText(Float.toString(c));

            }
        });

        //mul
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a=Float.parseFloat(num1.getText().toString());
                float b=Float.parseFloat(num2.getText().toString());
                float c=a*b;

                res.setText(Float.toString(c));

            }
        });
        //sub
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a=Float.parseFloat(num1.getText().toString());
                float b=Float.parseFloat(num2.getText().toString());
                float c=a-b;

                res.setText(Float.toString(c));

            }
        });

        //dev
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a=Float.parseFloat(num1.getText().toString());
                float b=Float.parseFloat(num2.getText().toString());
                float c=a/b;

                res.setText(Float.toString(c));

            }
        });




    }
}