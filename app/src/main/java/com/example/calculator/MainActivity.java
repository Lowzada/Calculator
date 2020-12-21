package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText enternumber1 = findViewById(R.id.Number1);
        final EditText enternumber2 = findViewById(R.id.Number2);
        final Button button = findViewById(R.id.button);
        final TextView textOutput = findViewById(R.id.result);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int num1 = Integer.parseInt(enternumber1.getText().toString());
                int num2 = Integer.parseInt(enternumber2.getText().toString());
                int num = num1+num2;
                String str = String.valueOf(num);
                textOutput.setText(str);
            }
        });
    }
}