package com.example.java_week5_multiactivites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ConfirmActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_confirm);
		
		Button btnYes = (Button) findViewById(R.id.btnYes);
		btnYes.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Intent i = new Intent(v.getContext(), MainActivity.class);
				i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(i);
			}
		});
		
		Button btnNo = (Button) findViewById(R.id.btnNo);
		btnNo.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Activity a = (Activity) v.getContext();
				a.finish();
			}
		});
	}
}
