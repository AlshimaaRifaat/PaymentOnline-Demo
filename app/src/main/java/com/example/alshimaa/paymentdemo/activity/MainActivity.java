package com.example.alshimaa.paymentdemo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.alshimaa.paymentdemo.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViewById(R.id.checkout_ui).setOnClickListener(this);
        findViewById(R.id.payment_button).setOnClickListener(this);
        findViewById(R.id.custom_ui).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.checkout_ui:
                startActivity(new Intent(this, CheckoutUIActivity.class));
                break;
            case R.id.payment_button:
                startActivity(new Intent(this, PaymentButtonActivity.class));
                break;
            case R.id.custom_ui:
                startActivity(new Intent(this, CustomUIActivity.class));
        }
    }
}
