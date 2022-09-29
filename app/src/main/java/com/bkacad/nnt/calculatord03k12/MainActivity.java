package com.bkacad.nnt.calculatord03k12;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtA, edtB;
    private TextView tvResult;

    private double a, b;
    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Bind id
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);
        tvResult = findViewById(R.id.tvResult);

        // Tạo đối tượng calculator
        calculator = new CalculatorImpl();
    }

    private void getNumberFromEditText() {
        // Lấy dữ liệu trong edittext => gán cho a và b
        String strA = edtA.getText().toString();
        if (strA.isEmpty()) {
            edtA.setError("Hãy nhập dữ liệu");
            return;
        }
        String strB = edtB.getText().toString();
        if (strB.isEmpty()) {
            edtB.setError("Hãy nhập dữ liệu");
            return;
        }
        this.a = Double.parseDouble(strA);
        this.b = Double.parseDouble(strB);
    }

    public void plus(View view) {
        getNumberFromEditText();
        double rs = calculator.plus(a, b);
        tvResult.setText("Result: " + rs);
    }

    public void minus(View view) {
        getNumberFromEditText();
        double rs = calculator.minus(a, b);
        tvResult.setText("Result: " + rs);
    }

    public void mul(View view) {
        getNumberFromEditText();
        double rs = calculator.mul(a, b);
        tvResult.setText("Result: " + rs);
    }

    public void div(View view) {
        getNumberFromEditText();
        try {
            double rs = calculator.div(a, b);
            tvResult.setText("Result: " + rs);
        } catch (Exception e) {
            tvResult.setText(e.getMessage());
        }

    }

    public void pow(View view) {
        getNumberFromEditText();
        double rs = calculator.pow(a, b);
        tvResult.setText("Result: " + rs);
    }

    public void mod(View view) {
        // Có a, b
        getNumberFromEditText();
        // Kiểm tra a và b có phải là số nguyên hay ko?
        if (a != (long) a || b != (long) b) {
            tvResult.setText("a, b phải là số nguyên");
            return;
        }
        if (b == 0) {
            tvResult.setText("b phải khác 0");
            return;
        }
        long rs = calculator.mod((long) a, (long) b);
        tvResult.setText("Result: " + rs);
    }
}