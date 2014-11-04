package app.buusk.sqlite_659;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements
		android.view.View.OnClickListener {
	SQLiteDatabase db;
	private Button btninsert, btnshow;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		control659DB control659db = new control659DB(this);
		control659db.getWritableDatabase();
		btninsert = (Button) findViewById(R.id.btn_insert);
		btnshow = (Button) findViewById(R.id.btn_insert);
		btninsert.setOnClickListener(this);
		btnshow.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_insert:
			Intent intent = new Intent(MainActivity.this, AddActivity.class);
			startActivity(intent);
			break;
		case R.id.Show:
			Intent show = new Intent(MainActivity.this, ShowDataAcitivity.class);
			startActivity(show);
			break;

		default:
			break;
		}

	}
}
