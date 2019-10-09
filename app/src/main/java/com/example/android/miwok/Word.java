package com.example.android.miwok;

class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mAudioResourceId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = 0;

    //Constructor pentru cuvinte
    Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
         mAudioResourceId = audioResourceId;
    }

    //Constructor pentru imagini
    Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    // todo: For code readability and consistency you should use the naming for all your getters.
    //  In this case your getter name should drop the 'm'. getImageResourceId is consistent with the
    //  other getters naming.
    int getmImageResourceId(){
        return mImageResourceId;
    }

    boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    int getAudioResourceId(){
        return mAudioResourceId;
    }
}
