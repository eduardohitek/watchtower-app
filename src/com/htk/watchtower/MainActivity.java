package com.htk.watchtower;

import logic.TimeLogic;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("entrei");
        
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	System.out.println("cliquei");
            	TimeLogic tLogic = new TimeLogic(getApplicationContext());
            	tLogic.insertTime();
            	System.out.println("inseri");
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

    	System.out.println(item.getItemId());
    	switch (item.getItemId()) {
    	case R.id.button1:
    		System.out.println("cliquei");
    		return true;
    	default: return super.onOptionsItemSelected(item);
    	}
    	
    }
    
   
    
}
