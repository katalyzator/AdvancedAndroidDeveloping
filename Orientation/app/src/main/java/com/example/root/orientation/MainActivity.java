package com.example.root.orientation;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private String getScreenOrientation() {
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
            return "Портретная ориентация";
        else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            return "Альбомная Ориентация";
        else
            return "";
    }


    public void onClick(View view) {
        TextView mLandscapeInfo = (TextView) findViewById(R.id.textView);
        mLandscapeInfo.setText(getScreenOrientation());


    }

    public void onClick2(View view) {
        TextView mPortraitInfo = (TextView) findViewById(R.id.textView2);
        mPortraitInfo.setText(getScreenOrientation());
    }
}
