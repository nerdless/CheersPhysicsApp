package juano.pininos.cheersphysics;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

public class Question1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question1);
		
		WebView pointer = (WebView) findViewById(R.id.webView1);
		pointer.loadUrl("file:///android_asset/physicsQ1.htm");
	}
	
	public void openA1(View v) {
        setContentView(R.layout.activity_answer);
		
		WebView pointer = (WebView) findViewById(R.id.webView1);
		pointer.loadUrl("file:///android_asset/physicsA1.htm");
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.question1, menu);
		return true;
	}

}
