package fr.yakacoder.android.mytestableapplication;

import android.app.Application;

/**
 * Created by odenier on 18/11/2016.
 */

public class MyTestableApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}
