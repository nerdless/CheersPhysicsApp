package juano.pininos.cheersphysics;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

public class Question3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question3);
		
		WebView pointer = (WebView) findViewById(R.id.webView1);
		pointer.loadUrl("file:///android_asset/physicsQ3.htm");
	}
	public void openW(View v) {
        setContentView(R.layout.activity_answer);
		
		WebView pointer = (WebView) findViewById(R.id.webView1);
		pointer.loadUrl("file:///android_asset/physicsQ3W.htm");
		}
	public void openR(View v) {
        setContentView(R.layout.activity_answer);
		
		WebView pointer = (WebView) findViewById(R.id.webView1);
		pointer.loadUrl("file:///android_asset/physicsQ3R.htm");
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.question3, menu);
		return true;
	}

}
