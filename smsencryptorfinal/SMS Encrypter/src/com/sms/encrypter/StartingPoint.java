package com.sms.encrypter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StartingPoint extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btnEncryptImage = (Button) findViewById(R.id.btnEncryptImage);
        
        btnEncryptImage.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(StartingPoint.this,UploadToServer.class);
				startActivity(i);
			}
		});
        
        
        
        Button btn1 = (Button) findViewById(R.id.btnLogin);
        btn1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(StartingPoint.this,EncDecSMSActivity.class);
				startActivity(i);
			}
		});
    }
}