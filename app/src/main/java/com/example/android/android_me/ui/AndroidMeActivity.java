package com.example.android.android_me.ui;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        // HeadFragment Starting...
        BodyPartFragment headFragment = new BodyPartFragment();
        headFragment.setmImageIds(AndroidImageAssets.getHeads());
        headFragment.setmListIndex(0);

        // Add the fragment to its container using a FragmentManager and a Transaction
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.Headfragment, headFragment)
                .commit();
        // ...End

        //BodyFragment Starting...
        BodyPartFragment bodyFragment = new BodyPartFragment();
        bodyFragment.setmImageIds(AndroidImageAssets.getBodies());
        bodyFragment.setmListIndex(0);

        fragmentManager.beginTransaction()
                .add(R.id.Bodyfragment, bodyFragment)
                .commit();
        // ...End

        //LegFragment Starting...
        BodyPartFragment legFragment = new BodyPartFragment();
        legFragment.setmImageIds(AndroidImageAssets.getLegs());
        legFragment.setmListIndex(0);

        fragmentManager.beginTransaction()
                .add(R.id.Legfragment, legFragment)
                .commit();
        // ...End

    }
}
