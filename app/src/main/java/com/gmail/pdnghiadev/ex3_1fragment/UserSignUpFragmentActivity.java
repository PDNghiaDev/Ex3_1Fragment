package com.gmail.pdnghiadev.ex3_1fragment;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.gmail.pdnghiadev.ex3_1fragment.fragments.SignUpStep1Fragment;

public class UserSignUpFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up_fragment);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        SignUpStep1Fragment fragment = new SignUpStep1Fragment();
        fragmentTransaction.add(R.id.signUp, fragment);
        fragmentTransaction.commit();


    }

    @Override
    public void onBackPressed() {
        getFragmentManager().popBackStack();
    }
}
