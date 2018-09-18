package com.example.ritakamil.myapplication_mopub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import com.mopub.mobileads.MoPubView;


public class MainActivity extends AppCompatActivity {

    private com.mopub.mobileads.MoPubView MoPubView;

    private Button mShowButton;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.ritakamil.myapplication_mopub.R.layout.activity_main);

        MoPubView = (MoPubView) findViewById(com.example.ritakamil.myapplication_mopub.R.id.adview);
        MoPubView.setAdUnitId("8fbb21e38109419a87a09ca948e8ca42"); // Enter your Ad Unit ID from www.mopub.com
        MoPubView.loadAd();
    }
}
