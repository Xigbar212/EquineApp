package com.example.starscream.firstapplication;

public class UpcomingEventsItem {
    private String mEventDate;
    private String mEventName;
    private String mEventTime;

    public  UpcomingEventsItem(String eventDate, String eventName, String eventTime) {
        mEventDate = eventDate;
        mEventName = eventName;
        mEventTime = eventTime;
    }

    public String getmEventDate() {
        return mEventDate;
    }

    public void setmEventDate(String mEventDate) {
        this.mEventDate = mEventDate;
    }

    public String getmEventName() {
        return mEventName;
    }

    public void setmEventName(String mEventName) {
        this.mEventName = mEventName;
    }

    public String getmEventTime() {
        return mEventTime;
    }

    public void setmEventTime(String mEventTime) {
        this.mEventTime = mEventTime;
    }
}
