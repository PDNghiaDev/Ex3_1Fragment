package com.gmail.pdnghiadev.ex3_1fragment.presenter;

import com.gmail.pdnghiadev.ex3_1fragment.model.SignUpStep1Interactor;
import com.gmail.pdnghiadev.ex3_1fragment.model.SignUpStep1InteractorImpl;
import com.gmail.pdnghiadev.ex3_1fragment.untils.OnNextListener;
import com.gmail.pdnghiadev.ex3_1fragment.view.SignUpStep1View;

/**
 * Created by PDNghiaDev on 11/26/2015.
 */
public class SignUpStep1PresenterImpl implements SignUpStep1Presenter, OnNextListener{
    private SignUpStep1View signUpView;
    private SignUpStep1Interactor signUpInteractor;

    public SignUpStep1PresenterImpl(SignUpStep1View signUpView){
        this.signUpView = signUpView;
        this.signUpInteractor = new SignUpStep1InteractorImpl();
    }

    @Override
    public void validateCredentials(String firstname, String lastname, String email, String phonenumber) {
        signUpInteractor.next(firstname, lastname, email, phonenumber, this);
    }

    @Override
    public void onFistnameError() {
        signUpView.setFistnameError();
    }

    @Override
    public void onLastnameError() {
        signUpView.setLastnameError();
    }

    @Override
    public void onEmailError() {
        signUpView.setEmailError();
    }

    @Override
    public void onPhonenumberError() {
        signUpView.setPhonenumberError();
    }

    @Override
    public void onSuccess() {
        signUpView.navigationToStep2();
    }
}
