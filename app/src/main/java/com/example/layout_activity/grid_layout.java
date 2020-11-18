package com.example.layout_activity;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class grid_layout extends AppCompatActivity {
    private Button btnAdd, btnMinus, btnMultiply,btnDivide, btnClear, btnEqual;
    private Button btnSeven, btnEight, btnNine, btnZero,
            btnFour, btnFive, btnSix, btnOne, btnTwo, btnThree;
    private TextView tvExpression, tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        btnAdd = (Button) findViewById(R.id.buttonAdd);
        btnMinus = (Button) findViewById(R.id.buttonSubtraction);
        btnDivide = (Button) findViewById(R.id.buttonDivide);
        btnClear = (Button) findViewById(R.id.buttonClear);
        btnMultiply = (Button) findViewById(R.id.buttonMultiply);
        btnEqual = (Button) findViewById(R.id.buttonEqual);
//
        btnOne = (Button) findViewById(R.id.buttonOne);
        btnTwo = (Button) findViewById(R.id.buttonTwo);
        btnThree = (Button) findViewById(R.id.buttonThree);
        btnFour = (Button) findViewById(R.id.buttonFour);
        btnFive = (Button) findViewById(R.id.buttonFive);
        btnSix = (Button) findViewById(R.id.buttonSix);
        btnSeven = (Button) findViewById(R.id.buttonSeven);
        btnEight = (Button) findViewById(R.id.buttonEight);
        btnNine = (Button) findViewById(R.id.buttonNine);
        btnZero = (Button) findViewById(R.id.buttonZero);
//
        tvExpression = (TextView) findViewById(R.id.tvExpression);
        tvResult = (TextView) findViewById(R.id.tvResult);

        clearScreen();


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("1");
            }
        });
//
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("2");
            }
        });
//
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("4");
            }
        });
//
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("9");
            }
        });
//
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("0");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("+");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("-");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("*");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeExpression("/");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = tvExpression.getText().toString();
                Expression e = new Expression(expression);
                String result = String.valueOf(e.calculate());

                tvResult.setText(result);
            }
        });




    }

    void writeExpression(String value){
        String expression = tvExpression.getText().toString();
        expression = expression + value;

        tvExpression.setText(expression);
    }

    void clearScreen(){
        tvExpression.setText("");
        tvResult.setText("0");
    }
}