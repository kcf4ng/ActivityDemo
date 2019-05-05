package com.example.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class A4 extends AppCompatActivity {

    private View.OnClickListener btnYes_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setMyChoice("Yes");
        }

    };


    private View.OnClickListener btnNo_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setMyChoice("No");
        }
    };

    private void setMyChoice(String ans) {
        Bundle bundle = new Bundle();
        bundle.putString("KK",ans);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(0,intent);
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a4);
        InitialComponent();

    }

    private void InitialComponent() {
        btnYes = findViewById(R.id.btnYes);
        btnYes.setOnClickListener(btnYes_click);
        btnNo = findViewById(R.id.btnNo);
        btnNo.setOnClickListener(btnNo_click);
    }
    Button btnYes, btnNo;
}
