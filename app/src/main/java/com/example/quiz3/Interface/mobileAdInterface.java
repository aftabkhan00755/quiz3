package com.example.quiz3.Interface;

import android.app.Activity;

import com.google.android.gms.ads.interstitial.InterstitialAd;

public interface mobileAdInterface {


    void onAdLoaded(InterstitialAd ad, Activity activity);

    void onAdFailedToLoad(String error,Activity activity);

}
