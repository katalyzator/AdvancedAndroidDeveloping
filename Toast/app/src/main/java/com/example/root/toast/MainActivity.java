package com.example.root.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
               R.string.catfood, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastContainer = (LinearLayout) toast.getView();
        ImageView learnImageView = new ImageView(getApplicationContext());
        learnImageView.setImageResource(R.drawable.learnandroid);
        toastContainer.addView(learnImageView, 0);
        toast.show();
    }
}
