package com.example.m1586.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button logIn;
    private  TextView errorMessage;
    private EditText email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logIn = (Button)findViewById(R.id.Login);
        errorMessage = (TextView) findViewById(R.id.errorMessage);
        email = (EditText)findViewById(R.id.Email);
        password = (EditText)findViewById(R.id.Password);

        logIn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {

                if( email.getFreezesText()  ){

                    errorMessage.setText("帳號或密碼錯誤");

                }
                else {

                    //errorMessage.setText("");

                }

            }

        });

    }







}
