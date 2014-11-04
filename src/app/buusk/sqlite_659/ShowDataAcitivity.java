package app.buusk.sqlite_659;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ShowDataAcitivity extends Activity {
	private ListView listView;
	private control659DB contol659DB;

	private void onCreat(Bundle savedInstanState) {
		super.onCreate(savedInstanState);
		setContentView(R.layout.show);

		control659DB control659db = new control659DB(this);
		ArrayList<HashMap<String, String>> arrayList = contol659DB
				.SelectAllData();
		SimpleAdapter adpAdapter;
		adpAdapter = new SimpleAdapter(ShowDataAcitivity.this, arrayList,
				R.layout.show_item, new String[] { "MemberID", "Name", "Tel" },
				new int[] { R.id.ColMemberID, R.id.ColName, R.id.ColTel });
		listView.setAdapter(adpAdapter);
		listView = (ListView) findViewById(R.id.listView1);

	}

}
