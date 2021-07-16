package com.example.miwok;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int audioResourceID;

    private int imageResourceID = NO_IMAGE_AVAILABLE;
    private static final int NO_IMAGE_AVAILABLE = -1;

    public Word(String mMiwokTranslation, String mDefaultTranslation, int imageResourceID ,int audioResourceID) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.imageResourceID = imageResourceID;
        this.audioResourceID = audioResourceID;
    }

    public Word(String mMiwokTranslation, String mDefaultTranslation , int audioResourceID ){
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.audioResourceID = audioResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }

    public int getAudioResourceID() {
        return audioResourceID;
    }

    public void setAudioResourceID(int audioResourceID) {
        this.audioResourceID = audioResourceID;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", audioResourceID=" + audioResourceID +
                ", imageResourceID=" + imageResourceID +
                '}';
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceID() { return imageResourceID; }

    public boolean hasimage(){
        return imageResourceID != NO_IMAGE_AVAILABLE;
    }


}
