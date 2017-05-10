package com.example.android.miwok;

/**
 * Created by Damian on 5/8/2017.
 */

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String wordMiwok;
    private String wordEnglish;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Word(String wordMiwok, String wordEnglish) {
        this.wordMiwok = wordMiwok;
        this.wordEnglish = wordEnglish;
    }

    public Word(String wordMiwok, String wordEnglish, int imageResourceId) {
        this.wordMiwok = wordMiwok;
        this.wordEnglish = wordEnglish;
        this.imageResourceId = imageResourceId;
    }

    public String getWordMiwok() {
        return wordMiwok;
    }

    public String getWordEnglish() {
        return wordEnglish;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
