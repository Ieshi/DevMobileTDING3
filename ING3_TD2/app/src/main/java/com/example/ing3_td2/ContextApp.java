package com.example.ing3_td2;

public class ContextApp extends android.app.Application {

    private String login;
    @Override
    public void onCreate()
    {
        super.onCreate();
        this.login = null;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}