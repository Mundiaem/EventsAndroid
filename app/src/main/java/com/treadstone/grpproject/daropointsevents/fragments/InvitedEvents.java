package com.treadstone.grpproject.daropointsevents.fragments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.treadstone.grpproject.daropointsevents.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InvitedEvents extends Fragment {


    public InvitedEvents() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_invited_events, container, false);
    }

}
