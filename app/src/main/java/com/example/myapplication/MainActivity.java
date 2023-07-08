package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

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

        sharePreference = new SharePreference(this);

        if (sharePreference.getIslogin()) {

            startHomeUi();
        } else  {

            etUsername = findViewById(R.id.Username);
            etPassword = findViewById(R.id.password);
            btnLogin = findViewById(R.id.btnLogin);
            pbLogin = findViewById(R.id.pblogin);
            ivLogin = findViewById(R.id.Login)
        }
    }

    public void startHomeUi() {
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);
        finishAffinity();
    }

    public void login() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username = etUsername.getText().toString();
                final String password = etPassword.getText().toString();

                pbLogin.setVisibility(View.VISIBLE);
                ivLogin.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });
    }
}