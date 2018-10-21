package com.example.srini.loginmvpdemo.login;

import android.os.Handler;
import android.os.Looper;

import com.example.srini.loginmvpdemo.model.IUser;
import com.example.srini.loginmvpdemo.model.UserModel;


/**
 * Created by SRINI on 10/19/2018.
 */

public class LoginPresenter implements LoginContract.Presenter {
    LoginContract.View iLoginView;
    IUser user;
    Handler handler;

    public LoginPresenter(LoginContract.View iLoginView) {
        this.iLoginView = iLoginView;
        initUser();
        handler = new Handler(Looper.getMainLooper());
    }

    @Override
    public void clear() {
        iLoginView.onClearText();
    }

    @Override
    public void doLogin(String name, String passwd) {
              Boolean isLoginSuccess = true;
        final int code = user.checkUserValidity(name, passwd);
        if (code != 0) isLoginSuccess = false;
        final Boolean result = isLoginSuccess;

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                iLoginView.onLoginResult(result, code);
            }
        }, 5000);
    }

    @Override
    public void setProgressBarVisiblity(int visiblity) {
        iLoginView.onSetProgressBarVisibility(visiblity);
    }

    private void initUser() {
        user = new UserModel("admin", "admin");
    }
}