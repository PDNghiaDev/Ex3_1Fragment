package com.gmail.pdnghiadev.ex3_1fragment.fragments;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.gmail.pdnghiadev.ex3_1fragment.R;
import com.gmail.pdnghiadev.ex3_1fragment.presenter.SignUpStep1Presenter;
import com.gmail.pdnghiadev.ex3_1fragment.presenter.SignUpStep1PresenterImpl;
import com.gmail.pdnghiadev.ex3_1fragment.view.SignUpStep1View;

/**
 * Created by PDNghiaDev on 11/25/2015.
 */
public class SignUpStep1Fragment extends Fragment implements View.OnClickListener, SignUpStep1View{
    public static final String TAG = "SignUpStep1Fragment";
    private Button mBtnNext;
    private EditText mFirstname, mLastname, mEmail, mPhonenumber;
    private String mStrFirstname, mStrLastname, mStrEmail, mStrPhonenumber;
    private RadioGroup mGender;
    private SignUpStep1Presenter signUpPresenter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.sign_up_step_1_fragment, container, false);

        loadComponents(view);

        signUpPresenter = new SignUpStep1PresenterImpl(this);
        mBtnNext.setOnClickListener(this);

        return view;
    }

    public void loadComponents(View view){
        mBtnNext = (Button) view.findViewById(R.id.btnNext);
        mFirstname = (EditText) view.findViewById(R.id.editFirstName);
        mLastname = (EditText) view.findViewById(R.id.editLastName);
        mEmail = (EditText) view.findViewById(R.id.editEmail);
        mPhonenumber = (EditText) view.findViewById(R.id.editPhoneNumber);
        mGender = (RadioGroup) view.findViewById(R.id.rgGender);
    }


    @Override
    public void onClick(View view) {
        mStrFirstname = mFirstname.getText().toString();
        mStrLastname = mLastname.getText().toString();
        mStrEmail = mEmail.getText().toString();
        mStrPhonenumber = mPhonenumber.getText().toString();
        signUpPresenter.validateCredentials(mStrFirstname, mStrLastname, mStrEmail, mStrPhonenumber);
    }

    @Override
    public void setFistnameError() {
        mFirstname.setError(getString(R.string.first_name_error));
    }

    @Override
    public void setLastnameError() {
        mLastname.setError(getString(R.string.last_name_error));
    }

    @Override
    public void setEmailError() {
        mEmail.setError(getString(R.string.email_error));
    }

    @Override
    public void setPhonenumberError() {
        mPhonenumber.setError(getString(R.string.phone_number_error));
    }

    @Override
    public void setGenderError() {

    }

    @Override
    public void navigationToStep2() {
        SignUpStep2Fragment fragment = new SignUpStep2Fragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.signUp, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }
}