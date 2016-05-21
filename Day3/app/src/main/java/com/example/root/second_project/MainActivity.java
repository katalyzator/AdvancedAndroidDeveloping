package com.example.root.second_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private Button mCrowsCounterButton;
private Button mCatCounterButton;
private int mCountCrows = 0;
private int mCountCat = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCrowsCounterButton = (Button)findViewById(R.id.buttonCrowsCounter);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                TextView mInfoTextView = (TextView)findViewById(R.id.textView);
                mInfoTextView.setText("Я насчитал " + ++mCountCrows + " ворон");
            }
        });

        mCatCounterButton = (Button)findViewById(R.id.buttonHello);
        mCatCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView mInfoTextView = (TextView)findViewById(R.id.textView2);
                mInfoTextView.setText(("Я насчитал " + ++mCountCat + " кошек"));
            }
        });
    }

}
