package de.derandroidpro.appoeffnentutorial;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	public Button btn1;
	
	public PackageManager pm;
	public Intent appintent;
	
	public String packagename = "com.android.calculator2";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		
		btn1 = (Button) findViewById(R.id.button1);
		
		btn1.setOnClickListener(this);
		
		pm = getPackageManager();
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
		
		case R.id.button1:{
			
			
			try{
			
			appintent = pm.getLaunchIntentForPackage(packagename);
			startActivity(appintent);
			
			}
			
			catch(Exception e) {
				
				Toast.makeText(getApplicationContext(), "App konnte nicht geöffnet werden.", Toast.LENGTH_SHORT).show();
			}
						
		}
		
		
		}
		
		
		
	}


}
