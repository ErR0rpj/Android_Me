package com.example.android.android_me.ui;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.android.android_me.R;

// This activity will display a custom Android image composed of three body parts: head, body, and legs
public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        // Create a new head BodyPartFragment
        BodyPartFragment headFragment = new BodyPartFragment();

        // TODO (4) Set the list of image id's for the head fragment and set the position to the second image in the list

        // Add the fragment to its container using a FragmentManager and a Transaction
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.head_container, headFragment)
                .commit();

        // TODO (5) Create and display the body and leg BodyPartFragments


    }
}
