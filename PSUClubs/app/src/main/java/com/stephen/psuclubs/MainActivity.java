package com.stephen.psuclubs;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List clubsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //globalFunctions.getList();


        MyGlobals globalFunctions = new MyGlobals(this.getApplicationContext());
        globalFunctions.sendList(this);
    }


    public void receiveClubsList(List clubsList) {
        this.clubsList = clubsList;

        LinearLayout buttonHouse = (LinearLayout) findViewById(R.id.button_House);

        for(int i=0; i < clubsList.size(); i++) {
            Button newButton = new Button(this);
            newButton.setText(((Club)(clubsList.get(i))).getName());
            newButton.setBackgroundColor(getResources().getColor(R.color.colorAccent));

            newButton.setOnClickListener(buttonClick);
            buttonHouse.addView(newButton);
        }
    }


    private View.OnClickListener buttonClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button bttnclicked = (Button)v;
            Intent clubStart = new Intent(MainActivity.this, ClubInfo.class);
            clubStart.putExtra("CLUB INFO TITLE", bttnclicked.getText());
            startActivity(clubStart);
        }
    };

//    public void clubInfo(View v){
//        Button bttnclicked = (Button)v;
//        Intent clubStart = new Intent(MainActivity.this, ClubInfo.class);
//        clubStart.putExtra("CLUB INFO TITLE", bttnclicked.getText());
//        startActivity(clubStart);
//    }


}
