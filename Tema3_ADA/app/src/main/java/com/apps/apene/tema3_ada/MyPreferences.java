package com.apps.apene.tema3_ada;

import android.os.Bundle;
import android.preference.PreferenceFragment;


public class MyPreferences extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Load preferences from XML resource
        addPreferencesFromResource(R.xml.preferences);
    }

}
