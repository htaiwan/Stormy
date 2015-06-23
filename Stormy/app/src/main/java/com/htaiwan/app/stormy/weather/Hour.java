package com.htaiwan.app.stormy.weather;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by app on 6/20/15.
 */
public class Hour implements Parcelable{
    public Hour() {}
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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(mTime);
        dest.writeString(mSummary);
        dest.writeDouble(mTempeture);
        dest.writeString(mIcon);
        dest.writeString(mTimeZone);
    }

    private Hour(Parcel in) {
        mTime = in.readLong();
        mSummary = in.readString();
        mTempeture = in.readDouble();
        mIcon = in.readString();
        mTimeZone = in.readString();
    }

    public static final Creator<Hour> CREATOR = new Creator<Hour>() {
        @Override
        public Hour createFromParcel(Parcel source) {
            return new Hour(source);
        }

        @Override
        public Hour[] newArray(int size) {
            return new Hour[size];
        }
    };
}
