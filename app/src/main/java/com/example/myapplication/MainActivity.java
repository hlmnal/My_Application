package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private Handler handler = new Handler();

    private SharePreference sharePreference;
    private EditText etUsername, etPassword;
    private Button btnLogin;
    private ProgressBar pbLogin;
    private ImageView ivLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharePreference=new SharePreference(this);
    }
}