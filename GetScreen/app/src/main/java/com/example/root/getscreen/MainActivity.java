package com.example.root.getscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userEditText = (EditText) findViewById(R.id.editTextUser);
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, ActivityAbout.class);
        startActivity(intent);
    }

    public void onClickSend(View view) {



        EditText giftEditText = (EditText) findViewById(R.id.editTextGift);

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("username", userEditText.getText().toString());
        intent.putExtra("gift", giftEditText.getText().toString());
        startActivity(intent);
    }

}
