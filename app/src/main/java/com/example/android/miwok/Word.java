package com.example.android.miwok;

/**
 * Created by Damian on 5/8/2017.
 */

public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String wordMiwok;
    private String wordEnglish;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private int audioResourceId;

    public Word(String wordEnglish, String wordMiwok, int audioResourceId) {
        this.wordMiwok = wordMiwok;
        this.wordEnglish = wordEnglish;
        this.audioResourceId = audioResourceId;
    }

    public Word(String wordEnglish, String wordMiwok, int imageResourceId, int audioResourceId) {
        this.wordMiwok = wordMiwok;
        this.wordEnglish = wordEnglish;
        this.imageResourceId = imageResourceId;
        this.audioResourceId = audioResourceId;

    }


    public int getAudioResourceId() {
        return audioResourceId;
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

    @Override
    public String toString() {
        return "Word{" +
                "wordMiwok='" + wordMiwok + '\'' +
                ", wordEnglish='" + wordEnglish + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", audioResourceId=" + audioResourceId +
                '}';
    }
}
