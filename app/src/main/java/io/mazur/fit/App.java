package io.mazur.fit;

import android.app.Application;
import android.content.Context;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class App extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        Fabric.with(this, new Crashlytics());

        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }
}
