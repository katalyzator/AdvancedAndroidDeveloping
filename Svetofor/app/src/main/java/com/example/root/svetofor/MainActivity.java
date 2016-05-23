package com.example.root.svetofor;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout mRelativeLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
        mInfoTextView = (TextView)findViewById(R.id.textView);

    }


    public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.red);
//        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.redColor, null));
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.redColor));
    }

    public void onYellowButtonClick(View view) {
        mInfoTextView.setText(R.string.Yellow);
//        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
    }

    public void onGreenButtonClick(View view) {
        mInfoTextView.setText(R.string.Green);
//        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
    }
}
