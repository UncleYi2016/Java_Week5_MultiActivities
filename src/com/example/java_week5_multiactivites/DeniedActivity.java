package com.example.java_week5_multiactivites;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DeniedActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_denied);
		
		Button btnTry = (Button) findViewById(R.id.btnTry);
		btnTry.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Activity a = (Activity) v.getContext();
				a.finish();
			}
		});
	}
}
