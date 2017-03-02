package com.github.dracute.fullscreendemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }
    public void image(View v){
        Intent firstButton=new Intent(LoginActivity.this,MainActivity.class);
        startActivity(firstButton);
            }
}
