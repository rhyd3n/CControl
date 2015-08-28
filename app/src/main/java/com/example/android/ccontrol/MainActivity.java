package com.example.android.ccontrol;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.example.android.ccontrol.Trafficsummon;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void btn1 (View v){
        Intent simple_intent = new Intent(getApplicationContext(),MapsActivity.class);
        startActivity(simple_intent);
    }

    public void btn2 (View v){
        Intent simple_intent = new Intent(this,Trafficsummon.class);
        startActivity(simple_intent);
    }
 /*   public void btn3 (View v){
        Intent simple_intent = new Intent(getApplicationContext(),ECALL.class);
        startActivity(simple_intent);
    }
*/
 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
     // Inflate the menu; this adds items to the action bar if it is present.
     getMenuInflater().inflate(R.menu.menu_main, menu);
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