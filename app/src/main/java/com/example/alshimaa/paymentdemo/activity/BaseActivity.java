package com.example.alshimaa.paymentdemo.activity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;

import com.example.alshimaa.paymentdemo.R;


@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {

    private ProgressDialog progressDialog;

    protected void showProgressDialog(int messageId) {
        if (progressDialog != null && progressDialog.isShowing()) {
            return;
        }

        if (progressDialog == null) {
            progressDialog = new ProgressDialog(this);
            progressDialog.setCancelable(false);
        }

        progressDialog.setMessage(getString(messageId));
        progressDialog.show();
    }

    protected void hideProgressDialog() {
        if (progressDialog == null) {
            return;
        }

        progressDialog.dismiss();
    }

    protected void showAlertDialog(String message) {
        new AlertDialog.Builder(this)
                .setMessage(message)
                .setPositiveButton(R.string.button_ok, null)
                .setCancelable(false)
                .show();
    }

    protected void showAlertDialog(int messageId) {
        showAlertDialog(getString(messageId));
    }
}
