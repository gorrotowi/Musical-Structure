package com.gorrotowi.musicalstructure.items;

/**
 * Created by Gorro on 20/12/16.
 */

public class ItemAlbum {

    private int imgAlbum;
    private String title;
    private String author;

    public ItemAlbum(int imgAlbum, String title, String author) {
        this.imgAlbum = imgAlbum;
        this.title = title;
        this.author = author;
    }

    public int getImgAlbum() {
        return imgAlbum;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
