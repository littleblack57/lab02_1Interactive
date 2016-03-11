package com.example.student.black.lab02_1interactive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int a = 0 ;
    public void submitOrder(View view) {
        priceDisplay(a);

    }

    public void add(View view){

        int y = a += 1;
        quandisplay(y);

    }

    public void subtract(View view) {
        int y = a -= 1 ;
        if(y <1 ){
            y = 0;
            a = 0;
        }
        quandisplay(y);

    }



    private void priceDisplay(int a) {
        TextView price = (TextView)findViewById(R.id.price);
        price.setText("NT$ "+String.valueOf(a*10));
    }

    private void quandisplay(int a) {
        TextView number = (TextView)findViewById(R.id.num);
        number.setText(String.valueOf(a));


    }


}
