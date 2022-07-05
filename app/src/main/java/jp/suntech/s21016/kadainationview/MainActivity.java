package jp.suntech.s21016.kadainationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView LvMenu = findViewById(R.id.LvMenu);
        LvMenu.setOnItemClickListener(new ListItemClickListener());
    }
    private class ListItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            TextView textView = findViewById(R.id.textView2);
            //タップされた定食名を取得します
            String item = (String) parent.getItemAtPosition(position);
            textView.setText(item);
            //トーストで表示する文字列を生成
        }
    }
}