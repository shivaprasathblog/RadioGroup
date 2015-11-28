package com.example.radiogroup;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity
{

	//STEP 1: Define the Radiogroup and RadioButton
	RadioGroup rg;
	RadioButton r1,r2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//STEP 2 : Refer the RadioGroup and RadioButton from Layoutfile
		rg=(RadioGroup)findViewById(R.id.radioGroup1);
		r1=(RadioButton)findViewById(R.id.radio0);
		r2=(RadioButton)findViewById(R.id.radio1);
		
		//STEP 3 : Creating the Listener for RadioGroup
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId)
			{
				// TODO Auto-generated method stub
				
				//STEP 4 : Action to be performed when Radiobutton 1(r1) is selected 
				if(r1.isChecked()==true)
				{
					Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_LONG).show();
				}
				//STEP 5 : Action to be performed when Radiobutton 2(r2) is selected
				if(r2.isChecked()==false)
				{
					Toast.makeText(MainActivity.this, "Female", Toast.LENGTH_LONG).show();
				}
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
