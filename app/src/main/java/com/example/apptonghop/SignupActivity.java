package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignupActivity extends AppCompatActivity {
    Button btn_gotoSignin,btn_signUp;
    EditText edt_SignUpName,edt_SignUpPassword,edt_SignUpEmail;
    boolean status = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        btn_gotoSignin = findViewById(R.id.btn_gotoSignin);
        btn_signUp = findViewById(R.id.btn_signup);
        edt_SignUpName =(EditText) findViewById(R.id.edt_signup_name);
        edt_SignUpPassword= (EditText) findViewById(R.id.edt_signup_password);
        edt_SignUpEmail=(EditText) findViewById(R.id.edt_signup_email);

        btn_gotoSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignupActivity.this, SigninActivity.class);
                if(status){
                    intent.putExtra("user",edt_SignUpName.getText().toString());
                    intent.putExtra("password",edt_SignUpPassword.getText().toString());
                }
                startActivity(intent);
            }
        });
        btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edt_SignUpName.getText().length()!=0 && edt_SignUpPassword.getText().length()!=0 || edt_SignUpEmail.getText().length()!=0){
                    String regex= "^\\w+[a-z0-9]*@{1}\\w+mail.com$";
                    Pattern pattern =Pattern.compile(regex);
                    Matcher matcher =pattern.matcher(edt_SignUpEmail.getText().toString());

                    if(!matcher.find()){
                        Toast.makeText(SignupActivity.this, "Sai dinh dang mail", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(SignupActivity.this, "Dang ki thanh cong ", Toast.LENGTH_SHORT).show();
                        status= true;
                    }

                }else{
                    Toast.makeText(SignupActivity.this, "Nhap day du thong tin!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}