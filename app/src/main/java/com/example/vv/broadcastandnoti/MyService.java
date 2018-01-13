package com.example.vv.broadcastandnoti;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.content.LocalBroadcastManager;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Intent intent = new Intent(MainActivity.action);
                    intent.putExtra("testInt", i);
                    LocalBroadcastManager.getInstance(MyService.this).sendBroadcast(intent);
                }
            }
        }.start();
        return START_NOT_STICKY;

    }
}
