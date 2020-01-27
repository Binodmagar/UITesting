package com.binod.uitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InstrumentedTesting extends AppCompatActivity {

    EditText etFirst, etSecond;
    Button btnAdd, btnSub, btnMul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrumented_testing);


        etFirst = findViewById(R.id.etFirstI);
        etSecond = findViewById(R.id.etSecondI);

        btnAdd = findViewById(R.id.btnAdd);
        btnMul = findViewById(R.id.btnMul);
        btnSub = findViewById(R.id.btnSub);


        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
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
}
