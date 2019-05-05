package com.example.activitydemo;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class A5 extends ListActivity {

    String[] users = {"AA","BB","CC","DD","EE","FF","GG","HH"};

    private void CreateList() {
        ListAdapter listAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                users
        );
        setListAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Log.i("List_DEMO",String.valueOf(position));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CreateList();
    }


}
