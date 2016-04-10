package org.metatemple.sample.y2016.d0409.t02;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	// The following function is referenced
	// by a button's 'android:onClick' attribute
	// in the 'main.xml' file.
	public void do_for_okay (View view)
	{
		// This button, of course, does nothing
		// but exit the application.
		finish();
	}
	
}

