package com.treadstone.grpproject.daropointsevents.app;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

import androidx.multidex.MultiDex;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
      /*     Parse.initialize(new Parse.Configuration.Builder(this)
      .applicationId(getString(R.string.parse_app_id))
      .server(getString(R.string.parse_server_url))
      .build()
    );
*/
//
//        MobileAds.initialize(this, getString(R.string.admob_app_id));
//        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);
//        // initialize the AdMob app
//        MobileAds.initialize(this, getString(R.string.admob_app_id));
//        Stetho.initializeWithDefaults(this); // init Stetho before Parse
//        ;
//        Parse.initialize(new Parse.Configuration.Builder(this)
//                .applicationId(getString(R.string.parse_app_id))
//                .server(getString(R.string.parse_server_url))
//
//
//                .build()
//        );
//        ParseInstallation.getCurrentInstallation().saveInBackground();

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
    public static void setRalewayRegular(Context context, TextView textView){
        Typeface typeface= Typeface.createFromAsset(context.getAssets(),"fonts/Raleway-Regular.ttf");
        textView.setTypeface(typeface);
    }
    public static void setQuicksand_Regular(Context context, TextView... textViews){
        Typeface typeface= Typeface.createFromAsset(context.getAssets(),"fonts/Quicksand-Regular.ttf");
        for (TextView textView:textViews){
            textView.setTypeface(typeface);
        }
    }
    public static void setQuicksand_Regular(Context context, TextView textViews){
        Typeface typeface= Typeface.createFromAsset(context.getAssets(),"fonts/Quicksand-Regular.ttf");
        textViews.setTypeface(typeface);

    }
    public static void setMontserratSemiBold(Context context, TextView textView){
        Typeface typeface= Typeface.createFromAsset(context.getAssets(),"fonts/Montserrat-SemiBold.ttf");
        textView.setTypeface(typeface);
    }
    public static void setRalewayThin(Context context, TextView textView){
        Typeface typeface= Typeface.createFromAsset(context.getAssets(),"fonts/Raleway-Thin.ttf");
        textView.setTypeface(typeface);
    }
    public static void setRalewayThin(Context context, TextView... textViews){
        Typeface typeface= Typeface.createFromAsset(context.getAssets(),"fonts/Raleway-Thin.ttf");
        for (TextView textView:textViews){
            textView.setTypeface(typeface);
        }
    }
}

