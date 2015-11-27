package com.gmail.pdnghiadev.ex3_1fragment.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmail.pdnghiadev.ex3_1fragment.R;

/**
 * Created by PDNghiaDev on 11/25/2015.
 */
public class SignUpStep2Fragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sign_up_step_2_fragment, container, false);

        return view;
    }

}
