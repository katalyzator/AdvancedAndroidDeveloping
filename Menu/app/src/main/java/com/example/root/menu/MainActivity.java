package com.example.root.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        TextView infoTextView = (TextView) findViewById(R.id.textView);

        switch (id) {

            case R.id.action_about:
                infoTextView.setText("You choose Action About");
                return true;
            case R.id.action_language:
                infoTextView.setText("You choose Action Languages");
                return true;
            case R.id.action_settings:
                infoTextView.setText("You choose Action Settings");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
