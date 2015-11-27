package com.gmail.pdnghiadev.ex3_1fragment.model;

import android.text.TextUtils;

import com.gmail.pdnghiadev.ex3_1fragment.untils.OnNextListener;

/**
 * Created by PDNghiaDev on 11/26/2015.
 */
public class SignUpStep1InteractorImpl implements SignUpStep1Interactor {
    @Override
    public void next(String firstname, String lastname, String email, String phonenumber, OnNextListener listener) {
        boolean error = false;

        if (TextUtils.isEmpty(firstname)){
            listener.onFistnameError();
            error = true;
        }
        if (TextUtils.isEmpty(lastname)){
            listener.onLastnameError();
            error = true;
        }
        if (TextUtils.isEmpty(email)){
            listener.onEmailError();
            error = true;
        }
        if (TextUtils.isEmpty(phonenumber)){
            listener.onPhonenumberError();
            error = true;
        }
        if (!error){
            listener.onSuccess();
        }
    }
}
