package com.estate.real.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.estate.real.MainActivity;
import com.estate.real.R;

public class ProfileFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_profile, container, false);
        // If hidden, then show it here
        MainActivity activity = (MainActivity) getActivity();
        activity.getSupportActionBar().show();

        return root;
    }
}