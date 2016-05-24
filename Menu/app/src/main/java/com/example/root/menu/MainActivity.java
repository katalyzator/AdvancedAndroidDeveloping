package com.example.root.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        TextView textView = (TextView) findViewById(R.id.textView);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);


        button.setOnClickListener(viewOnclickListener);
        textView.setOnClickListener(viewOnclickListener);
        imageView.setOnClickListener(viewOnclickListener);
    }

    View.OnClickListener viewOnclickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showPopupMenu(v);
        }
    };

    private void showPopupMenu(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        popupMenu.inflate(R.menu.popupmenu);

        popupMenu
                .setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu1:
                                Toast.makeText(getApplicationContext(),
                                        "You choose PopupMenu 1",
                                        Toast.LENGTH_SHORT).show();
                                return true;
                        case R.id.menu2:
                                Toast.makeText(getApplicationContext(),
                                        "You choose PopupMenu 2",
                                        Toast.LENGTH_SHORT).show();
                                return true;
                        case R.id.menu3:
                                Toast.makeText(getApplicationContext(),
                                        "You choose PopupMenu 3",
                                        Toast.LENGTH_SHORT).show();
                                return true;
                        default:
                            return false;

                        }
                    }
                });
        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() {

            @Override
            public void onDismiss(PopupMenu menu) {
                Toast.makeText(getApplicationContext(), "onDismiss",
                        Toast.LENGTH_SHORT).show();
            }
        });
        popupMenu.show();
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
