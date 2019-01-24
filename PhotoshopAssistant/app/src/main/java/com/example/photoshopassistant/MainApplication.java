package com.example.photoshopassistant;

import android.app.Application;

import com.adobe.creativesdk.foundation.AdobeCSDKFoundation;
import com.adobe.creativesdk.foundation.auth.IAdobeAuthClientCredentials;


public class MainApplication extends Application implements IAdobeAuthClientCredentials {

    /* Be sure to fill in the two strings below. */
    private static final String CREATIVE_SDK_CLIENT_ID      = "9526425167c5489b963f76a3c19fd360";
    private static final String CREATIVE_SDK_CLIENT_SECRET  = "59e3d257-9b1c-4459-9e81-211bfea38496";
    private static final String CREATIVE_SDK_REDIRECT_URI   = "https://10.0.2.2:123/forum/questions/";
    private static final String[] CREATIVE_SDK_SCOPES       = {"email", "profile", "address"};


    @Override
    public void onCreate() {
        super.onCreate();
        AdobeCSDKFoundation.initializeCSDKFoundation(getApplicationContext());
    }

    @Override
    public String getClientID() {
        return CREATIVE_SDK_CLIENT_ID;
    }

    @Override
    public String getClientSecret() {
        return CREATIVE_SDK_CLIENT_SECRET;
    }

    @Override
    public String[] getAdditionalScopesList() {
        return CREATIVE_SDK_SCOPES;
    }

    @Override
    public String getRedirectURI() {
        return CREATIVE_SDK_REDIRECT_URI;
    }
}
