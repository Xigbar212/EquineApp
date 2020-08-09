package com.example.starscream.firstapplication;

public class ArticleItem {
    private  int mArticleImage;
    private String mArticleTitle;
    private String mArticleInfo;

    public  ArticleItem(int articleImage, String articleTitle, String articleInfo) {
        mArticleImage = articleImage;
        mArticleTitle = articleTitle;
        mArticleInfo = articleInfo;
    }

    public int getArticleImage() {
        return mArticleImage;
    }

    public void setArticleImage(int articleImage) {
        this.mArticleImage = articleImage;
    }

    public String getArticleTitle() {
        return mArticleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.mArticleTitle = articleTitle;
    }

    public String getArticleInfo() {
        return mArticleInfo;
    }

    public void setArticleInfo(String articleInfo) {
        this.mArticleInfo = articleInfo;
    }
}
