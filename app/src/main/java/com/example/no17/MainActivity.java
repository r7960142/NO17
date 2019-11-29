package com.example.no17;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        listView = (ListView) findViewById(R.id.listview);
        listView.setOnItemClickListener(listViewOnClickListener);
        //ListView 要顯示的內容
        String[] str = {"新北市","台北市","台中市","高雄市"};
        //android.R.layout.simple_list_item_1 為內建樣式，還有其他樣式可自行研究
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                str);
        listView.setAdapter(adapter);
    }
    private AdapterView.OnItemClickListener listViewOnClickListener
            = new AdapterView.OnItemClickListener()
    {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id)
        {
            // TODO Auto-generated method stub

            textView.setText("你選擇了: " + ((TextView) view).getText());
        }
    };
}
