package com.example.srini.loginmvpdemo.model;

/**
 * Created by SRINI on 10/19/2018.
 */

public interface IUser {
    String getName();

    String getPasswd();

    int checkUserValidity(String name, String passwd);
}