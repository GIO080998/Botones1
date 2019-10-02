package com.example.mdgf980809;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView btnsig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsig=(TextView) findViewById(R.id.btnsiguiente);
        btnsig.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent frm2 = new Intent( this,gio2Activity.class);
        startActivity(frm2);
    }
}
