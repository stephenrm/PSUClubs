package com.stephen.psuclubs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ClubInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_info);

        Intent titleVar = getIntent();
        String clubTitle = titleVar.getStringExtra("CLUB INFO TITLE");

        TextView titleDisplay = findViewById(R.id.Club_Information);
        titleDisplay.setText(clubTitle);

//        TextView meetingLocation = findViewById(R.id.meeting_Location);
//        meetingLocation.setText();


    }
}
