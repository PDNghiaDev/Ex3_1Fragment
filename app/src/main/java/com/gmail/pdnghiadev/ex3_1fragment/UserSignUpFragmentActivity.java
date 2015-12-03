package com.gmail.pdnghiadev.ex3_1fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.gmail.pdnghiadev.ex3_1fragment.fragments.SignUpStep1Fragment;
import com.gmail.pdnghiadev.ex3_1fragment.untils.UserInfoConstant;

public class UserSignUpFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_sign_up_fragment);

        SignUpStep1Fragment fragment = (SignUpStep1Fragment) getSupportFragmentManager().findFragmentByTag(UserInfoConstant.SIGNUP_STEP1);
        if (fragment == null){
            fragment = new SignUpStep1Fragment();

        }else {
            FragmentManager fragmentManager = getSupportFragmentManager();
            for (int i = 0; i < fragmentManager.getBackStackEntryCount(); i++) {
                fragmentManager.popBackStack();
            }
        }

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction(); // Su dung dung goi cua Fragment
        fragmentTransaction.replace(R.id.signUp, fragment, UserInfoConstant.SIGNUP_STEP1);
        fragmentTransaction.commit();

    }

}
