package com.example.ganesh.myapp_lab3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  Button b1 = (Button) findViewById(R.id.button);
        final Intent myIntent = new Intent(this, SecondActivity.class);
        final Intent thirdIntent = new Intent(this, ThirdActivity.class);
        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);




        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(myIntent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(thirdIntent);
            }
        });


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            setContentView(R.layout.activity_main);
             // for about and help action.
            // Refer back to previouse activity .
            return true;
        }
        if (id == R.id.action_about) {

            ShowAbout();
            return true;
        }
        if (id == R.id.action_help){
            ShowHelp();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void ShowAbout() {

        setContentView(R.layout.about);

    }

    public void ShowHelp(){
        setContentView(R.layout.help);
    }
}
