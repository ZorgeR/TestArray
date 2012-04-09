package com.testtingarray.zlab;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TestArrayActivity extends Activity {
    /** Called when the activity is first created. */
	
	/* init array*/
	public String[] names,level;	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        /* update array from array.xml */
        names = getResources().getStringArray(R.array.array1);
    	level = getResources().getStringArray(R.array.array2);
    }
    
    public void onClick1(View view) {
    	switch (view.getId()) {
    	case R.id.button1: /* if pressed button1 */
        	for(int i = 0; i < names.length; i++) { /* do toast for all item in array names[] and send item from names[] and level[] to tost() */
        			 if (names[i].equals("zorge")){tost(i);}
        		else if (names[i].equals("ramallah")){tost(i);}
        		else if (names[i].equals("pakistan")){tost(i);}
        	}break; /* break case */
        case R.id.button2:
        	for(int i = 0; i < names.length; i++) {if (names[i].equals("zorge")){tost(i);}}break;
        case R.id.button3:
        	for(int i = 0; i < names.length; i++) {if (names[i].equals("pakistan")){tost(i);}}break;
        }
    }
    
    public void tost(int arg) {
    	Toast toast = Toast.makeText(getApplicationContext(), "user: "+names[arg]+ "\n" + "level: "+level[arg], Toast.LENGTH_SHORT);toast.show();
    }
}