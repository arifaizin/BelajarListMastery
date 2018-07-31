package com.android_mastery.belajarlist.recyclerview;

public class ListModel {
    String namaBuah;
    int gambarBuah;

    //constructor
    public ListModel(String namaBuah, int gambarBuah) {
        this.namaBuah = namaBuah;
        this.gambarBuah = gambarBuah;
    }

    //setter and getter
    public String getNamaBuah() {
        return namaBuah;
    }

    public void setNamaBuah(String namaBuah) {
        this.namaBuah = namaBuah;
    }

    public int getGambarBuah() {
        return gambarBuah;
    }

    public void setGambarBuah(int gambarBuah) {
        this.gambarBuah = gambarBuah;
    }
}
