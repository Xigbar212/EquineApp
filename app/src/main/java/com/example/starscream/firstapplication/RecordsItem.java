package com.example.starscream.firstapplication;

public class RecordsItem {
    private String mtestName;
    private String mtestScore;
    private String mhorseName;
    private String mtestDate;

    public RecordsItem(String testName, String testScore, String horseName, String testDate) {
        mtestName = testName;
        mtestScore = testScore;
        mhorseName = horseName;
        mtestDate = testDate;
    }

    public String getMtestName() {
        return mtestName;
    }

    public void setMtestName(String mtestName) {
        this.mtestName = mtestName;
    }

    public String getMtestScore() {
        return mtestScore;
    }

    public void setMtestScore(String mtestScore) {
        this.mtestScore = mtestScore;
    }

    public String getMhorseName() {
        return mhorseName;
    }

    public void setMhorseName(String mhorseName) {
        this.mhorseName = mhorseName;
    }

    public String getMtestDate() {
        return mtestDate;
    }

    public void setMtestDate(String mtestDate) {
        this.mtestDate = mtestDate;
    }
}
