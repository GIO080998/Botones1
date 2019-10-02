package com.example.mdgf980809;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class gio2Activity extends AppCompatActivity {
    TextView btnsig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gio2);


    }

    public void sig3(View v) {
        Intent sig3 = new Intent(this, fer2Activity.class);
        startActivity(sig3);
    }
}
