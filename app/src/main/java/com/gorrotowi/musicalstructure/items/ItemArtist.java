package com.gorrotowi.musicalstructure.items;

/**
 * Created by Gorro on 20/12/16.
 */

public class ItemArtist {
    int img;
    String name;

    public ItemArtist(int img, String name) {
        this.img = img;
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }
}
