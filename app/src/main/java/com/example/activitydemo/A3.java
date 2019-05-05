package com.example.activitydemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.mbms.MbmsErrors;
import android.widget.TextView;

public class A3 extends Activity {
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a3);
        GetIntent();
        InitialComponent();

    }

    private void GetIntent() {
        Intent intent = getIntent(); //取得管理員
        Bundle bundle = intent.getExtras();
        data = bundle.getString("KK");
    }

    private void InitialComponent() {
    lblSet = findViewById(R.id.lblSet);
    lblSet.setText("Hello, "+data);

    }


    TextView lblSet;
}

