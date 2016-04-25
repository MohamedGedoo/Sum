package com.blog.sum;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	// Initialize variables

	// ⁄—›‰«Â„ ›Ì «·Œ«—Ã ⁄·‘«‰ «ﬁœ— «‘ €· ⁄·ÌÂ„ „‰ «Ì „ﬂ«‰
	EditText num_1, num_2;
	Button sumNum;
	TextView viewResult;
	int number_1, number_2, result;

	// the clicking method to sum numbers

	public void sum_Numbers(View view) {

		// « EditeText Œ–‰« «·ﬁÌ„… „‰ «·
		// int À„ Ê÷⁄‰«Â« ›Ì «·
		number_1 = Integer.parseInt(num_1.getText().toString());
		number_2 = Integer.parseInt(num_2.getText().toString());

		result = number_1 + number_2;

		// TextView «Œ–‰« «·ﬁÌ„… Ê⁄—÷‰«Â« œ«Œ· «·
		viewResult.setText(String.valueOf(result));

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		num_1 = (EditText) findViewById(R.id.etNum1);
		num_2 = (EditText) findViewById(R.id.editText2);
		sumNum = (Button) findViewById(R.id.button1);
		viewResult = (TextView) findViewById(R.id.textView1);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
