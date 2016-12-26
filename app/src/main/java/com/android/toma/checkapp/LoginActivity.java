package com.android.toma.checkapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity{

    private EditText mLogin;
    private EditText mPassword;
    private Button mLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login);

        mLogin = (EditText) findViewById(R.id.loginEdit);
        mPassword = (EditText) findViewById(R.id.password);
        mLoginBtn = (Button) findViewById(R.id.loginBtn);
    }

//    public void authenticateLogin(View view){
//        if ()
//    }
}
