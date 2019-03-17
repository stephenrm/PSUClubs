package com.stephen.psuclubs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clubInfo(View v){
        Button bttnclicked = (Button)v;
        Intent clubStart = new Intent(MainActivity.this, ClubInfo.class);
        clubStart.putExtra("CLUB INFO TITLE", bttnclicked.getText());
        startActivity(clubStart);
    }

}
