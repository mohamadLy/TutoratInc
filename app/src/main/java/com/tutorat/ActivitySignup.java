package com.tutorat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class ActivitySignup extends AppCompatActivity {

  ImageView signupback;
    EditText mPassword;
    EditText mFullName;
    EditText mEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        mPassword = (EditText) findViewById(R.id.password);
        mFullName = (EditText) findViewById(R.id.fullname);
        mEmail = (EditText) findViewById(R.id.email);
        signupback = (ImageView)findViewById(R.id.signupback);

        signupback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(ActivitySignup.this, MainActivity.class);
                startActivity(it);

            }
        });

    }
}
