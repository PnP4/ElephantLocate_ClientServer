package com.ucsc.pnp.elephantlocalize;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import java.io.IOException;

/**
 * Created by nrv on 7/13/16.
 */
public class NetWorkAccess extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent,flags,startId);
        try {
            new ServerApp().start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return START_STICKY;
    }
}
