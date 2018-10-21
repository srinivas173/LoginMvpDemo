package com.example.srini.loginmvpdemo.login;

/**
 * Created by SRINI on 10/19/2018.
 */

public interface LoginContract {
    public interface View {
        public void onClearText();
        public void onLoginResult(Boolean result, int code);
        public void onSetProgressBarVisibility(int visibility);
    }

    public interface Presenter{
        void clear();
        void doLogin(String name, String passwd);
        void setProgressBarVisiblity(int visiblity);
    }

}
