package sg.edu.rp.c347.portfolio_2;

public class Ride {
    private String time;
    private String date;
    private String meetup;
    private String destination;
    private String planner;

    public Ride(String time, String date, String meetup, String destination, String planner){
        this.time = time;
        this.date = date;
        this.meetup = meetup;
        this.destination = destination;
        this.planner = planner;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMeetup() {
        return meetup;
    }

    public void setMeetup(String meetup) {
        this.meetup = meetup;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
