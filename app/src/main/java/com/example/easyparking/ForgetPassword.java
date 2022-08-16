package com.example.easyparking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgetPassword extends AppCompatActivity {

    EditText email_address_ET;
    Button rest_Password_Btn;
    FirebaseAuth auth ;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        email_address_ET= (EditText) findViewById(R.id.email_reset);
        rest_Password_Btn= (Button) findViewById(R.id.reset_btn);
        progressBar= (ProgressBar) findViewById(R.id.progressbar);

        auth= FirebaseAuth.getInstance();

        rest_Password_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetPassword();
            }
        });

    }

    private void resetPassword(){

        String email = email_address_ET.getText().toString().trim();

        if(email.isEmpty()){
            email_address_ET.setError("Email is Required!");
            email_address_ET.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            email_address_ET.setError("Please Provide vaild email!");
            email_address_ET.requestFocus();
            return;
        }

        progressBar.setVisibility(View.GONE);
        auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {

                if(task.isSuccessful()){
                    Toast.makeText(ForgetPassword.this, " Check Your e-mail to reset your password", Toast.LENGTH_LONG).show();

                }else {
                    Toast.makeText(ForgetPassword.this, " Try Again!, Something worng happende", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}