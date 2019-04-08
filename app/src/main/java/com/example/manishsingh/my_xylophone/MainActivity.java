package com.example.manishsingh.my_xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.manishsingh.my_xylophone.R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);

        // TODO: Load and get the IDs to identify the sounds
        mASoundId = mSoundPool.load(getApplicationContext(), com.example.manishsingh.my_xylophone.R.raw.note6_a,1);
        mBSoundId = mSoundPool.load(getApplicationContext(),com.example.manishsingh.my_xylophone.R.raw.note7_b,1);
        mCSoundId = mSoundPool.load(getApplicationContext(), com.example.manishsingh.my_xylophone.R.raw.note1_c,1);
        mDSoundId = mSoundPool.load(getApplicationContext(), com.example.manishsingh.my_xylophone.R.raw.note2_d,1);
        mESoundId = mSoundPool.load(getApplicationContext(), com.example.manishsingh.my_xylophone.R.raw.note3_e,1);
        mFSoundId = mSoundPool.load(getApplicationContext(), com.example.manishsingh.my_xylophone.R.raw.note4_f,1);
        mGSoundId = mSoundPool.load(getApplicationContext(), com.example.manishsingh.my_xylophone.R.raw.note5_g,1);


    }

    // TODO: Add the play methods triggered by the buttons
    public void playC(View V){
        mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playD(View V){
        mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playE(View V){
        mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playG(View V){
        mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playA(View V){
        mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playF(View V){
        mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playB(View V){
        mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }



}
