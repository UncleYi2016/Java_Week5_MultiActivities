package com.example.java_week5_multiactivites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.view.View.*;
import android.widget.Button;
import android.widget.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btnLogin = (Button) findViewById(R.id.btnLogin);
		btnLogin.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				EditText editUsername = (EditText) findViewById(R.id.editUsername);
				EditText editPwd = (EditText) findViewById(R.id.editPwd);
				String username = editUsername.getText().toString();
				String password = editPwd.getText().toString();
				if(username.equals("BenYi") && password.equals("UIC")){
					Intent i = new Intent(v.getContext(), WelcomeActivity.class);
					startActivity(i);
				}else{
					Intent i = new Intent(v.getContext(), DeniedActivity.class);
					startActivity(i);
				}
			}
		});
	}
}
