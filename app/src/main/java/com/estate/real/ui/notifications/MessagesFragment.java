package com.estate.real.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.estate.real.MainActivity;
import com.estate.real.R;

public class MessagesFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_messages, container, false);
        // If hidden, then show it here
        MainActivity activity = (MainActivity) getActivity();
        activity.getSupportActionBar().show();

        return root;
    }
}