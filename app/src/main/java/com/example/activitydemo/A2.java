package com.example.activitydemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class A2 extends Activity {

    private View.OnClickListener btnBack_click= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            intent = new Intent(A2.this,MainActivity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a2);
        InitialComponent();
    }

    private void InitialComponent() {
    btnBack= findViewById(R.id.btnBack);
    btnBack.setOnClickListener(btnBack_click);
    }

    Button btnBack;
}
