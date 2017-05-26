package com.example.greg.developercalculator;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.text.DecimalFormat;

import static android.support.v7.appcompat.R.styleable.View;

public class CalculatorActivity extends AppCompatActivity {

    private ActivityCalculatorBinding binding;
    private double valueOne = Double.NaN;
    private double valueTwo;

    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    private char CURRENT_ACTION;

    DecimalFormat decimalFormat = new DecimalFormat("#.##########");

    binding.buttonZero.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });

    binding.buttonOne.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });
    binding.buttonTwo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });
    binding.buttonThree.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });
    binding.buttonFour.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });
    binding.buttonFive.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });binding.buttonSix.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });
    binding.buttonSeven.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });
    binding.buttonEight.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });

    binding.buttonNine.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });
    binding.buttonA.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });
    binding.buttonB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });
    binding.buttonC.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });
    binding.buttonD.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });
    binding.buttonE.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });
    binding.buttonF.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            binding.editText.setText(binding.editText.getText() + "0");
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_calculator);

    }

    binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            computeCalculation();
            CURRENT_ACTION = ADDITION;
            binding.infoTextView.setText(decimalFormat.format(valueOne) + "+");
            binding.editText.setText(null);
        }
    });

    binding.buttonSubtract.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            computeCalculation();
            CURRENT_ACTION = SUBTRACTION;
            binding.infoTextView.setText(decimalFormat.format(valueOne) + "-");
            binding.editText.setText(null);
        }
    });

    binding.buttonMultiply.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            computeCalculation();
            CURRENT_ACTION = MULTIPLICATION;
            binding.infoTextView.setText(decimalFormat.format(valueOne) + "*");
            binding.editText.setText(null);
        }
    });

    binding.buttonDivide.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            computeCalculation();
            CURRENT_ACTION = DIVISION;
            binding.infoTextView.setText(decimalFormat.format(valueOne) + "/");
            binding.editText.setText(null);
        }
    });

    binding.buttonEqual.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            computeCalculation();
            binding.infoTextView.setText(binding.infoTextView.getText().toString() +
                    decimalFormat.format(valueTwo) + " = " + decimalFormat.format(valueOne));
            valueOne = Double.NaN;
            CURRENT_ACTION = '0';
        }
    });

    private void computeCalculation() {
        if(!Double.isNaN(valueOne)) {
            valueTwo = Double.parseDouble(binding.editText.getText().toString());
            binding.editText.setText(null);

            if(CURRENT_ACTION == ADDITION)
                valueOne = this.valueOne + valueTwo;
            else if(CURRENT_ACTION == SUBTRACTION)
                valueOne = this.valueOne - valueTwo;
            else if(CURRENT_ACTION == MULTIPLICATION)
                valueOne = this.valueOne * valueTwo;
            else if(CURRENT_ACTION == DIVISION)
                valueOne = this.valueOne / valueTwo;
        }
        else {
            try {
                valueOne = Double.parseDouble(binding.editText.getText().toString());
            }
            catch (Exception e){}
        }
    }
}
