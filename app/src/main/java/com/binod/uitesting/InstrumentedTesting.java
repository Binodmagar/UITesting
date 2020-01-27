package com.binod.uitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InstrumentedTesting extends AppCompatActivity {

    EditText etFirst, etSecond;
    Button btnAdd, btnSub, btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrumented_testing);


        etFirst = findViewById(R.id.etFirstI);
        etSecond = findViewById(R.id.etSecondI);

        btnAdd = findViewById(R.id.btnAdd);
        btnDiv = findViewById(R.id.btnDiv);
        btnSub = findViewById(R.id.btnSub);


        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                div();
            }
        });
    }


    public void add(){
        float first = Float.parseFloat(etFirst.getText().toString());
        float second = Float.parseFloat(etSecond.getText().toString());

        UITesting uiTesting = new UITesting();

        float result = uiTesting.add(first, second);

        Intent intent = new Intent(this, OutPutActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    public void sub(){
        float first = Float.parseFloat(etFirst.getText().toString());
        float second = Float.parseFloat(etSecond.getText().toString());

        UITesting uiTesting = new UITesting();

        float result = uiTesting.sub(first, second);

        Intent intent = new Intent(this, OutPutActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    public void div(){
        float first = Float.parseFloat(etFirst.getText().toString());
        float second = Float.parseFloat(etSecond.getText().toString());

        UITesting uiTesting = new UITesting();

        float result = uiTesting.div(first, second);

        Intent intent = new Intent(this, OutPutActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}
