package com.example.android.tietsocial;


public class post {

    private String text;
    private String name;
    private String logoUrl;
    private String photoUrl;

    public post() {
    }

    public post(String text, String name, String logoUrl,String photUrl) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
        this.logoUrl=logoUrl;

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getLogoUrl(){
        return logoUrl;
    }
}