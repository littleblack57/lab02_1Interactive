package com.example.student.black.lab02_1interactive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
       order(a);

    }

    public void add(View view) {

        int y = a += 1;
        quandisplay(y);
        priceDisplay(y);

    }

    public void subtract(View view) {
        int y = a -= 1;
        if (y < 1) {
            y = 0;
            a = 0;
        }
        quandisplay(y);
        priceDisplay(y);

    }



    private void priceDisplay(int a) {
        TextView price = (TextView) findViewById(R.id.price);
        price.setText("NT$ " + String.valueOf(a * 10));
    }

    private void order(int a) {
        TextView price = (TextView) findViewById(R.id.price);
        price.setText("NT$ " + String.valueOf(a * 10)+"\nThank You!!");
    }

    private void quandisplay(int a) {
        TextView number = (TextView) findViewById(R.id.num);
        number.setText(String.valueOf(a));


    }


    public void ok(View view) {
        EditText et =(EditText)findViewById(R.id.keyin);
        String num = et.getText().toString();
        a = Integer.valueOf(num);
        quandisplay(a);
        priceDisplay(a);


    }
}
