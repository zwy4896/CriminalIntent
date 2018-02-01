package com.example.zoe48.criminalintent;

import android.util.AndroidException;

import java.util.Date;
import java.util.UUID;

/**
 * Created by zoe48 on 2017-11-23.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime()
    {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public String Format()
    {
        String mmDate = (String) android.text.format.DateFormat
                .format("EEE, d MMM yyyy HH:mm", getmDate());
        return mmDate;
    }
}
