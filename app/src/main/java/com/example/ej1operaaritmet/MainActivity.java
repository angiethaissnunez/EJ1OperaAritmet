package com.example.ej1operaaritmet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nu1, nu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nu1 = (EditText)findViewById(R.id.textNu1);
        nu2 = (EditText)findViewById(R.id.textNu2);

        Button sum = (Button) findViewById(R.id.btnSum);
        Button rest = (Button) findViewById(R.id.btnRest);
        Button divi = (Button) findViewById(R.id.btnDivi);
        Button mult = (Button) findViewById(R.id.btnMult);
        final TextView respu = (TextView) findViewById(R.id.textResul);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float(nu1.getText().toString());
                float num2 = new Float(nu2.getText().toString());
                respu.setText("Resultado: "+(num1+num2));

            }
        });

        rest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float(nu1.getText().toString());
                float num2 = new Float(nu2.getText().toString());
                respu.setText("Resultado: "+(num1-num2));

            }
        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float(nu1.getText().toString());
                float num2 = new Float(nu2.getText().toString());
                respu.setText("Resultado: "+(num1/num2));

            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = new Float(nu1.getText().toString());
                float num2 = new Float(nu2.getText().toString());
                respu.setText("Resultado: "+(num1*num2));

            }
        });


    }
}