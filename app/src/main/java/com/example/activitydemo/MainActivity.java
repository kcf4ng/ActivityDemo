package com.example.activitydemo;

import android.app.Activity;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends   Activity {

    private View.OnClickListener btnNew_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, A2.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener btnSend_click= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Bundle bundle = new Bundle();
            bundle.putString("KK","Marco");
            Intent intent = new Intent(MainActivity.this, A3.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    };


    private View.OnClickListener btnReceive_click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, A4.class);
            startActivityForResult(intent,3);

        }
    };


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==3){
            if(data == null){
                lblTitle.setText("沒有設定管理員");
                 return;
            }
            if(data.getExtras() == null){
                lblTitle.setText("沒有設定包裹");
                return;
            }
            String result = data.getExtras().getString("KK");
            lblTitle.setText("回覆結果: "+result);
        }

    }


    private View.OnClickListener btnList_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, A5.class);
            startActivity(intent);
        }
    };






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ACT_DEMO","onCreate()被觸發");
        InitialComponent();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("ACT_DEMO","onRestart()被觸發");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("ACT_DEMO","onStart()被觸發");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("ACT_DEMO","onResume()被觸發");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("ACT_DEMO","onPause()被觸發");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("ACT_DEMO","onStop()被觸發");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("ACT_DEMO","onDestroy()被觸發");
    }


    private void InitialComponent() {
        btnNew= findViewById(R.id.btnNew);
        btnNew.setOnClickListener(btnNew_click);
        btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(btnSend_click);
        btnReceive = findViewById(R.id.btnReceive);
        btnReceive.setOnClickListener(btnReceive_click);
        lblTitle= findViewById(R.id.lblTitle);
        btnList = findViewById(R.id.btnList);
        btnList.setOnClickListener(btnList_click);

    }
    Button btnSend;
    Button btnNew;
    Button btnReceive;
    TextView lblTitle;
    Button btnList;
}
