package com.example.myapplication;

import android.content.Context;
import android.content.SharedPreferences;

public class SharePreference {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public SharePreference(Context context) {
       sharedPreferences=context.getSharedPreferences(
               "com.example.myapplication",
               context.MODE_PRIVATE
       );
       editor=sharedPreferences.edit();
       setAsDefaultValue();
    }

    private void setAsDefaultValue() {
        setUsername("admin");

        setPassword("12345678");
    }

    private void setPassword(String password) {
        editor.putString("sp_password",password);
        editor.commit();
    }

    private void setUsername(String admin) {
        editor.putString("sp_username",admin);
        editor.commit();

    }
    public void  saveIsLogin(Boolean value){
        editor.putBoolean("sp_islogin",value);
        editor.commit();
    }
    public String getusername(){
        return sharedPreferences.getString(
                "sp_password","");

    }
    public String getPassword(){
        return sharedPreferences.getString(
                "sp_password",""
        );
    }
    public boolean getIslogin(){
        return sharedPreferences.getBoolean("sp_islogin",false);
    }
}

