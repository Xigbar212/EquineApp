package com.example.starscream.firstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText userName, userPassword;
    private Button loginButton;
    public TextView newAccountPrompt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        userName = findViewById(R.id.username_box);
        userPassword = findViewById(R.id.password_box);
        loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHomePage();
            }
        });
        newAccountPrompt = findViewById(R.id.new_user_prompt);
        newAccountPrompt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createAccount();
            }
        });



            }
    public void goToHomePage() {
        String username = userName.getText().toString();
        String password = userPassword.getText().toString();
        String type = "login";
        backgroundLogin backgroundlogin = new backgroundLogin(this);
        backgroundlogin.execute(type, username, password );

       // Intent i = new Intent(this, HomePage.class);
        //startActivity(i);
    }


    public void createAccount() {
        Toast.makeText(getApplicationContext(),"Guide User to Create Account",Toast.LENGTH_SHORT).show();
    }
}


