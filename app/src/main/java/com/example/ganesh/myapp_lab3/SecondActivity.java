package com.example.ganesh.myapp_lab3;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.os.Bundle;
import android.widget.Toast;
import android.app.Activity;

import android.widget.TextView;
import java.lang.String;
import java.sql.Types;
import java.util.Arrays;

import android.view.View;
//import java.lang.String[];

/**
 * Created by Ganesh on 15-02-04.
 */


public class SecondActivity extends Activity {




    public TextView t;


    public String sText;
    public int i;
    protected void onCreate(Bundle icicle) {
        final AutoCompleteTextView  autoctv;
        super.onCreate(icicle);
        setContentView(R.layout.secondlayout);

     final String[] android_key = getResources().getStringArray(R.array.android_key);
     final String[] Terminology = getResources().getStringArray(R.array.terminology_key);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android_key);
        autoctv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        autoctv.setAdapter(adapter);
        autoctv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                t =(TextView) findViewById(R.id.textView2);
                sText = (String) parent.getItemAtPosition(position);
                i = Arrays.asList(android_key).indexOf(sText);

                t.setText(Terminology[i]);
            }
        });



    }

}

