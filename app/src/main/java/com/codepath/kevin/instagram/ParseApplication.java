package com.codepath.kevin.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        //Register your parse models
        //ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("IuHsTOA4Q5vjwFEETMR1m19RcV60pw78CZWiBiQC")
                .clientKey("H0MnrfYp3z5upnxHsZls1OZvF2r0KOW3mlSMzHA8")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
