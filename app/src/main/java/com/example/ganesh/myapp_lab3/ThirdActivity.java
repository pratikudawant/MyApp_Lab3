package com.example.ganesh.myapp_lab3;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
/**
 * Created by Ganesh on 15-02-04.
 */


public class ThirdActivity extends ActionBarActivity {
     String[] list_inst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
      // public String [] List_inst;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdlayout);
    final ListView list =(ListView) findViewById(R.id.listView);

      list_inst = getResources().getStringArray(R.array.Urls);
       final ArrayAdapter<String> adpt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice ,list_inst);
        list.setAdapter(adpt);
        list.setClickable(true);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                String link = (String) list.getItemAtPosition(position);

                Intent websiteintent = new Intent(Intent.ACTION_VIEW);

                websiteintent.setData(Uri.parse(link));

                startActivity(websiteintent);

            }
        });

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
