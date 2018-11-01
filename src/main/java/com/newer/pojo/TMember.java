package com.newer.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;


import java.io.Serializable;
import java.sql.Date;

public class TMember implements Serializable{
        private Integer mId;
        private String  mName;
        private String  mPhone;
        private Integer mLevel;
        @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
        private Date    mInTime;
        private String  mCardNo;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public Integer getmLevel() {
        return mLevel;
    }

    public void setmLevel(Integer mLevel) {
        this.mLevel = mLevel;
    }

    public Date getmInTime() {
        return mInTime;
    }

    public void setmInTime(Date mInTime) {
        this.mInTime = mInTime;
    }

    public String getmCardNo() {
        return mCardNo;
    }

    public void setmCardNo(String mCardNo) {
        this.mCardNo = mCardNo;
    }

    public TMember() {
    }

    public TMember(Integer mId, String mName, String mPhone, Integer mLevel, Date mInTime, String mCardNo) {
        this.mId = mId;
        this.mName = mName;
        this.mPhone = mPhone;
        this.mLevel = mLevel;
        this.mInTime = mInTime;
        this.mCardNo = mCardNo;
    }

    @Override
    public String toString() {
        return "tMember{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mPhone='" + mPhone + '\'' +
                ", mLevel=" + mLevel +
                ", mInTime=" + mInTime +
                ", mCardNo='" + mCardNo + '\'' +
                '}';
    }
}
