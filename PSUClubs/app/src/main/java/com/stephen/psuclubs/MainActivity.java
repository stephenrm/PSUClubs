package com.stephen.psuclubs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ScrollView scroller = new ScrollView(this);
//        LinearLayout linLayVar = new LinearLayout(this);
//
//        linLayVar.setOrientation(LinearLayout.HORIZONTAL);
//
//        scroller.addView(linLayVar);
//
//        Button newButt = new Button(this);
//        newButt.setText("PULLED FROM DATABASE");
//
//        LinearLayout.LayoutParams paramsVar = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//        paramsVar.setMargins(48, 320, 48, 320);
//        linLayVar.addView(newButt, paramsVar);
//
//        this.setContentView(scroller);
    }

    public void clubInfo(View v){
        Button bttnclicked = (Button)v;
        Intent clubStart = new Intent(MainActivity.this, ClubInfo.class);
        clubStart.putExtra("CLUB INFO TITLE", bttnclicked.getText());
        startActivity(clubStart);
    }

}
