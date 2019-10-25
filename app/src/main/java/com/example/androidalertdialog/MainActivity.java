package com.example.androidalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.id_bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert("Message","Hello Cao Thi Thuy", "OK", "Cancel");
            }
        });

    }

    void showAlert(String title, String message, String positive, String negative) {
        new AlertDialog.Builder(this).setTitle(title).setMessage(message).setPositiveButton(positive, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).setNegativeButton(negative, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).show();
    }
}
