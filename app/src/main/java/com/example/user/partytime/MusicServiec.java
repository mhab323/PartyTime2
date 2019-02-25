package com.example.user.partytime;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import java.security.PublicKey;

public class MusicServiec extends Service {
    private MediaPlayer mp;
    private static boolean isRunning= false;
    public MusicServiec() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");

    }
    @Override
    public void onCreate(){
        super.onCreate();
        mp=MediaPlayer.create(getApplicationContext(),R.raw.bdsong);
    }
    public int onStartCommand(Intent intent,int flags ,int startId){
        mp.setLooping(true);
        mp.start();
        isRunning=true;
        return START_NOT_STICKY;

    }

    public void onDestroy(){
        mp.stop();
        isRunning=false;
        super.onDestroy();
    }
    public static boolean isRunning(){
        return isRunning;
    }
}
