package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BasicCalculatorActivity extends AppCompatActivity {

    static Calculator calculator = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calculator);
        TextView textView = (TextView) findViewById(R.id.displayer);
        textView.setText(calculator.getData());

        Button button1 = (Button) findViewById(R.id.one);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button1.getText()));
                calculator.handleNumber("1");
            }
        });

        Button button2 = (Button) findViewById(R.id.two);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(),  button2.getText()));
                calculator.handleNumber("2");
            }
        });

        Button button3 = (Button) findViewById(R.id.three);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button3.getText()));
                calculator.handleNumber("3");
            }
        });

        Button button4 = (Button) findViewById(R.id.four);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button4.getText()));
                calculator.handleNumber("4");
            }
        });

        Button button5 = (Button) findViewById(R.id.five);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button5.getText()));
                calculator.handleNumber("5");
            }
        });

        Button button6 = (Button) findViewById(R.id.six);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button6.getText()));
                calculator.handleNumber("6");
            }
        });

        Button button7 = (Button) findViewById(R.id.seven);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button7.getText()));
                calculator.handleNumber("7");
            }
        });

        Button button8 = (Button) findViewById(R.id.eight);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button8.getText()));
                calculator.handleNumber("8");
            }
        });

        Button button9 = (Button) findViewById(R.id.nine);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button9.getText()));
                calculator.handleNumber("9");
            }
        });

        Button button0 = (Button) findViewById(R.id.zero);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button0.getText()));
                calculator.handleNumber("0");
            }
        });

        Button buttonPlus = (Button) findViewById(R.id.plus);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), calculator.handleSign("+")));
            }
        });

        Button buttonMinus = (Button) findViewById(R.id.minus);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), calculator.handleSign("-")));
            }
        });

        Button buttonMultiply = (Button) findViewById(R.id.multiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), calculator.handleSign("*")));
            }
        });

        Button buttonDivide = (Button) findViewById(R.id.divide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), calculator.handleSign("/")));
            }
        });

        Button buttonDot = (Button) findViewById(R.id.dot);
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), calculator.handleSign(".")));
            }
        });

        Button buttonClear = (Button) findViewById(R.id.clear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(calculator.handleSign("C"));
            }
        });

        Button equalButton = (Button) findViewById(R.id.equal);
        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = calculator.handleSign("=");
                if(!result.equals("e"))
                    textView.setText(result);
            }
        });

    }
}