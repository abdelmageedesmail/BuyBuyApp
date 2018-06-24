package com.example.ahmed.buybuyapp.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.andexert.library.RippleView;
import com.example.ahmed.buybuyapp.R;
import com.facebook.CallbackManager;
import com.facebook.login.widget.LoginButton;

public class Login extends AppCompatActivity {
    private CallbackManager callbackManager;
    private LoginButton loginButton;
    Button Ripple_setting;
    TextView create_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        setVar();
        setUpFaceBook();
        setUpClick();

    }
    public void setVar(){
  //      loginButton = (LoginButton) findViewById(R.id.login_button);
   create_account = (TextView) findViewById(R.id.create_account);
        Ripple_setting = (Button) findViewById(R.id.Ripple_setting);
    }
    public void setUpFaceBook() {
//        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
//            @Override
//            public void onSuccess(LoginResult loginResult) {
////                Log.v("ifoo", "User ID: "
////                        + loginResult.getAccessToken().getUserId()
////                        + "\n" +
////                        "Auth Token: "
////                        + loginResult.getAccessToken().getToken());
////
//            }
//
//            @Override
//            public void onCancel() {
//
//            }
//
//            @Override
//            public void onError(FacebookException error) {
//
//            }
//
//            //get Data from face book
//        });
    }

    public void setUpClick(){
        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, Register.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, 0);
            }
        });
        Ripple_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this, HomePageRecycle.class);
                startActivity(i);
                overridePendingTransition(R.anim.slideleft, 0);
            }
        });

    }
}
