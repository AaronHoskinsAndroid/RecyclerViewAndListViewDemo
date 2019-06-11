package examples.aaronhoskins.com.recyclerviewandlistviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    ArrayList<String> stringArrayList = new ArrayList<>();
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        populateList();
        listView = findViewById(R.id.lvExample);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, stringArrayList);
        listView.setAdapter(adapter);
    }

    private void populateList() {
        for(int i = 0 ; i < 10 ; i++) {
            stringArrayList.add("Value " + i);
        }
    }
}
