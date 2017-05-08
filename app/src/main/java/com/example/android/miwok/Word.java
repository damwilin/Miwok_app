package com.example.android.miwok;

/**
 * Created by Damian on 5/8/2017.
 */

public class Word {
    private String wordMiwok;
    private String wordEnglish;

    public Word(String wordMiwok, String wordEnglish) {
        this.wordMiwok = wordMiwok;
        this.wordEnglish = wordEnglish;
    }

    public String getWordMiwok() {
        return wordMiwok;
    }

    public String getWordEnglish() {
        return wordEnglish;
    }
}
