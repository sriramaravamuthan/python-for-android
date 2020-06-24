package com.eroad.uploader;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.util.Log;
import org.kivy.android.DashCamPythonService;

public class DashcamuploaderBootReceiver extends BroadcastReceiver {

    private static final String TAG = "DashcamuploaderBootReceiver";

    public void onReceive(Context context, Intent intent) {
        Log.v(TAG, "Boot complete received DashCam");
        context.startForegroundService(DashCamPythonService.getDashCamIntent(context, 
                    ServiceDashcamuploaderservice.class,
                    "gen3cam/services/dashCamUploaderService.py", 
                    "dashCamUploaderService"));
    }
}