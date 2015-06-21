package com.htaiwan.app.stormy.weather;

/**
 * Created by app on 6/20/15.
 */
public class Hour {
    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public double getTempeture() {
        return mTempeture;
    }

    public void setTempeture(double tempeture) {
        mTempeture = tempeture;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    private long mTime;
    private String mSummary;
    private double mTempeture;
    private String mIcon;
    private String mTimeZone;


}
