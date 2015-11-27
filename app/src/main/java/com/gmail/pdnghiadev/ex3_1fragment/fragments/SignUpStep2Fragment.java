package com.gmail.pdnghiadev.ex3_1fragment.fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.gmail.pdnghiadev.ex3_1fragment.R;

/**
 * Created by PDNghiaDev on 11/25/2015.
 */
public class SignUpStep2Fragment extends Fragment implements SeekBar.OnSeekBarChangeListener, View.OnClickListener {
    private SeekBar mSalary;
    private TextView mCountSalary;
    private Button mBtnDone;
    private CheckBox mFootball, mTennis, mPingpong, mSwimming, mVolleyball, mBasketball;
    private int salary = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sign_up_step_2_fragment, container, false);

        loadComponents(view);

        mSalary.setOnSeekBarChangeListener(this);
        mBtnDone.setOnClickListener(this);

        return view;
    }

    private void loadComponents(View view) {
        mSalary = (SeekBar) view.findViewById(R.id.skbSalary);
        mCountSalary = (TextView) view.findViewById(R.id.txtSalary);
        mBtnDone = (Button) view.findViewById(R.id.btnDone);
        mFootball = (CheckBox) view.findViewById(R.id.ckFootball);
        mTennis = (CheckBox) view.findViewById(R.id.ckTennis);
        mPingpong = (CheckBox) view.findViewById(R.id.ckPingpong);
        mSwimming = (CheckBox) view.findViewById(R.id.ckSwimming);
        mVolleyball = (CheckBox) view.findViewById(R.id.ckVolleyball);
        mBasketball = (CheckBox) view.findViewById(R.id.ckBasketball);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        salary = progress;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        mCountSalary.setText("Your salary: " + salary + "00 dollars");
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        mCountSalary.setText("Your salary: " + salary + "00 dollars");
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(), getHobbies(), Toast.LENGTH_SHORT).show();
    }

    public StringBuilder getHobbies(){
        StringBuilder result = new StringBuilder();
        result.append("I like: ");
        if (mFootball.isChecked()){
            result.append("\nFootball");
        }
        if (mTennis.isChecked()){
            result.append("\nTennis");
        }
        if (mPingpong.isChecked()){
            result.append("\nPingpong");
        }
        if (mSwimming.isChecked()){
            result.append("\nSwimming");
        }
        if (mVolleyball.isChecked()){
            result.append("\nVolleyball");
        }
        if (mBasketball.isChecked()){
            result.append("\nBasketball");
        }

        return result;
    }
}
