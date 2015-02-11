package juano.pininos.cheersphysics;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
	public void openQ1(View v) {
		Intent intent = new Intent(this, Question1.class);
        startActivity(intent);
		
	}
	public void openQ2(View v) {
		Intent intent = new Intent(this, Question2.class);
        startActivity(intent);
	}
	public void openQ3(View v) {
		Intent intent = new Intent(this, Question3.class);
        startActivity(intent);
	}
	public void openQ4(View v) {
		Intent intent = new Intent(this, Question4.class);
        startActivity(intent);
	}


	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
