package com.example.apptonghop;

public class Flower {
    String title, meaning;
    int soureImg;

    public Flower(int soureImg, String title, String meaning) {
        this.title = title;
        this.soureImg = soureImg;
        this.meaning = meaning;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSoureImg() {
        return soureImg;
    }

    public void setSoureImg(int soureImg) {
        this.soureImg = soureImg;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
