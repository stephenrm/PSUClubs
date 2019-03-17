package com.stephen.psuclubs;

public class Club {
    //int id;
    private String description;
    private String leadership;
    private String name;
    private String email;
    private String meetingLocation;
    private String meetingTimes;

    public Club(){

    }

    public Club(String name, String description, String leadership, String email, String meetingLocation, String meetingTimes){
        //this.id=id;
        this.name=name;
        this.description=description;
        this.leadership=leadership;
        this.email=email;
        this.meetingLocation=meetingLocation;
        this.meetingTimes=meetingTimes;
    }


  //  public int getId() {
  //      return id;
  //  }

  //  public void setId(int id) {
  //      this.id = id;
  //  }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLeadership() {
        return leadership;
    }

    public void setLeadership(String leadership) {
        this.leadership = leadership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMeetingLocation() {
        return meetingLocation;
    }

    public void setMeetingLocation(String meetingLocation) {
        this.meetingLocation = meetingLocation;
    }

    public String getMeetingTimes() {
        return meetingTimes;
    }

    public void setMeetingTimes(String meetingTimes) {
        this.meetingTimes = meetingTimes;
    }
}
