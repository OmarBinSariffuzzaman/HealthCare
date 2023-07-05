package com.example.health_care;

public class Store {
    private String heartRate;
    private String systolic;
    private String diastolic;
    private String time;
    private String currentDate;

    private String comment,key;

    public Store() {
        // Empty constructor needed for Firebase
    }

    public Store(String heartRate, String systolic, String diastolic, String time, String currentDate,String comment) {
        this.heartRate = heartRate;
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.time = time;
        this.currentDate = currentDate;

        this.comment = comment;

    }
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getSystolic() {
        return systolic;
    }

    public void setSystolic(String systolic) {
        this.systolic = systolic;
    }

    public String getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(String diastolic) {
        this.diastolic = diastolic;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }



    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}

