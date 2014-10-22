package com.mikejharris.rabbit;

import android.app.Application;

import com.parse.Parse;


/**
 * Created by Mike on 10/22/2014.
 */
public class RabbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "S3zQxybtkx7ORgtrYg5TcYLgaG77MliUnAupqAVV", "fAYVapzSLHkLHRTDNBRkdLImzhOCiqZc7KE1Ifti");


    }
}
