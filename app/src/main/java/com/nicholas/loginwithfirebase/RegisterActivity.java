package com.nicholas.loginwithfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    //private TextView banner,register_user;
    private Button Register;
    private EditText name,email,phonenumber,password;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialize Firebase Auth here
        mAuth = FirebaseAuth.getInstance();

        Register=(Button)findViewById(R.id.register);
        //Register.setOnClickListener((View.OnClickListener) this);
        name=(EditText)findViewById(R.id.name);
        email=(EditText)findViewById(R.id.email);
        phonenumber=(EditText)findViewById(R.id.phone);
        password=(EditText)findViewById(R.id.password);

        progressBar=(ProgressBar)findViewById(R.id.progressbar);

        //setting the button onclick listener
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //continue here
            }
        });

    }
}