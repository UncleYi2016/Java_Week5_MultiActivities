package com.example.java_week5_multiactivites;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		
		Button btnGo = (Button) findViewById(R.id.btnGo);
		btnGo.setOnClickListener(new OnClickListener() {
		 public void onClick(View v) {
			 // Implicit activity to show a web link to the user using a browser.
			 EditText editSearch = (EditText) findViewById(R.id.editSearch);
			 String search = editSearch.getText().toString();
			 Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com.hk/search?q=" + search));
			 startActivity(i);
			 }
		 });
		
		Button btnLogout = (Button) findViewById(R.id.btnLogout);
		btnLogout.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Intent i = new Intent(v.getContext(), ConfirmActivity.class);
				startActivity(i);
			}
		});

	}

}
