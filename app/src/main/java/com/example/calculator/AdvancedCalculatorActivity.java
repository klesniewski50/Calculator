package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AdvancedCalculatorActivity extends AppCompatActivity {

    static Calculator calculator = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_calculator);

        TextView textView = (TextView) findViewById(R.id.displayer2);
        textView.setText(calculator.getData());

        Button button1 = (Button) findViewById(R.id.one_a);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button1.getText()));
                calculator.handleNumber("1");
            }
        });

        Button button2 = (Button) findViewById(R.id.two_a);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(),  button2.getText()));
                calculator.handleNumber("2");
            }
        });

        Button button3 = (Button) findViewById(R.id.three_a);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button3.getText()));
                calculator.handleNumber("3");
            }
        });

        Button button4 = (Button) findViewById(R.id.four_a);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button4.getText()));
                calculator.handleNumber("4");
            }
        });

        Button button5 = (Button) findViewById(R.id.five_a);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button5.getText()));
                calculator.handleNumber("5");
            }
        });

        Button button6 = (Button) findViewById(R.id.six_a);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button6.getText()));
                calculator.handleNumber("6");
            }
        });

        Button button7 = (Button) findViewById(R.id.seven_a);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button7.getText()));
                calculator.handleNumber("7");
            }
        });

        Button button8 = (Button) findViewById(R.id.eight_a);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button8.getText()));
                calculator.handleNumber("8");
            }
        });

        Button button9 = (Button) findViewById(R.id.nine_a);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button9.getText()));
                calculator.handleNumber("9");
            }
        });

        Button button0 = (Button) findViewById(R.id.zero_a);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), button0.getText()));
                calculator.handleNumber("0");
            }
        });

        Button buttonPlus = (Button) findViewById(R.id.plus_a);
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), calculator.handleSign("+")));
            }
        });

        Button buttonMinus = (Button) findViewById(R.id.minus_a);
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), calculator.handleSign("-")));
            }
        });

        Button buttonMultiply = (Button) findViewById(R.id.multiply_a);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), calculator.handleSign("*")));
            }
        });

        Button buttonDivide = (Button) findViewById(R.id.divide_a);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), calculator.handleSign("/")));
            }
        });

        Button buttonDot = (Button) findViewById(R.id.dot_a);
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), calculator.handleSign(".")));
            }
        });

        Button buttonClear = (Button) findViewById(R.id.clear_a);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                calculator.handleSign("C");
            }
        });

        Button buttonPercent = (Button) findViewById(R.id.percent);
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), calculator.handleSign("%")));
            }
        });

        Button buttonPowerY = (Button) findViewById(R.id.powery);
        buttonPowerY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s%s", textView.getText(), calculator.handleSign("^")));
            }
        });

        Button buttonPower = (Button) findViewById(R.id.power);
        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s", calculator.handleSign("^2")));

            }
        });

        Button buttonLn = (Button) findViewById(R.id.ln);
        buttonLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s", calculator.handleSign("ln")));

            }
        });

        Button buttonCos = (Button) findViewById(R.id.cos);
        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s", calculator.handleSign("cos")));

            }
        });

        Button buttonSin = (Button) findViewById(R.id.sin);
        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s", calculator.handleSign("sin")));

            }
        });

        Button buttonTan = (Button) findViewById(R.id.tan);
        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s", calculator.handleSign("tan")));

            }
        });

        Button buttonSqrt = (Button) findViewById(R.id.sqrt);
        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(String.format("%s", calculator.handleSign("sqrt")));

            }
        });

        Button equalButton = (Button) findViewById(R.id.equal_a);
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