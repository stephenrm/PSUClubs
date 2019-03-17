package com.stephen.psuclubs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ClubInfo extends AppCompatActivity {

    private Club receivedClub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_info);

        Intent titleVar = getIntent();
        String clubTitle = titleVar.getStringExtra("CLUB INFO TITLE");

        TextView titleDisplay = findViewById(R.id.Club_Information);
        titleDisplay.setText(clubTitle);

        MyGlobals globalFunctions = new MyGlobals(getApplicationContext());
        globalFunctions.sendClubObject(this, clubTitle);


    }

    void receiveClubObject(Club receivedClub){
        this.receivedClub=receivedClub;

        TextView meetingLocation = findViewById(R.id.meeting_Location_Details);
        meetingLocation.setText(receivedClub.getMeetingLocation());

        TextView meetingTime = findViewById(R.id.meeting_Time_Details);
        meetingTime.setText(receivedClub.getMeetingTimes());

        TextView clubEmail = findViewById(R.id.email_Details);
        clubEmail.setText(receivedClub.getEmail());

        TextView leadershipDetails = findViewById(R.id.leadership_Details);
        leadershipDetails.setText(receivedClub.getLeadership());

        TextView description = findViewById(R.id.description_Details);
        description.setText(receivedClub.getDescription());

    }
}
