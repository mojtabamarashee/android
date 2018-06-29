package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends Activity {
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

	  Button startButton = (Button) findViewById(R.id.startbutton);
	  startButton.setOnClickListener(new View.OnClickListener() {
		  public void onClick(View view) {
			  try {
				  //showTimer(100 * 100);
			  } catch (NumberFormatException e) {
				  // method ignores invalid (non-integer) input and waits
				  // for something it can use
			  }
		  }
	  });
   }
}



