package com.example.athaya.athaya_1202150252_modul6;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class databasePost {
    //mendeklarasikan objek dalam bentuk string
    String image, judul, caption, user, key;

    public databasePost(){

    }
    public databasePost(String caption, String image, String judul, String user ){
        this.image = image;
        this.judul = judul;
        this.caption = caption;
        this.user = user;
    }

    public void setKey(String key) {
        this.key = key;
    }
    //untuk menggambil data
    public String getImage() {
        return image;
    }

    public String getJudul() {
        return judul;
    }

    public String getCaption() {
        return caption;
    }

    public String getUser() {
        return user;
    }

    public String getKey() {
        return key;
    }
}
