package com.example.easyparking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    private TextView register, forgotPassword;
    private EditText editText_email, editText_password;
    private Button Login_btn;

    private FirebaseAuth mAuth;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = (TextView) findViewById(R.id.register);
        register.setOnClickListener(this);

        forgotPassword =(TextView) findViewById(R.id.forgotpassword);
        forgotPassword.setOnClickListener(this);

        Login_btn= (Button) findViewById(R.id.login_Button);
        Login_btn.setOnClickListener(this);

        editText_email= (EditText) findViewById(R.id.email_EditText);
        editText_password= (EditText) findViewById(R.id.password_EditText);

        progressBar = (ProgressBar) findViewById(R.id.progressbar);
        mAuth= FirebaseAuth.getInstance();

    }

    @Override
    public void onBackPressed() {
        return;}

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.register:
                startActivity(new Intent(this, Registration.class));
                break;
            case R.id.login_Button:
                UserLogin();
                break;
            case  R.id.forgotpassword:
                startActivity(new Intent(this, ForgetPassword.class));
                break;
        }
    }

    private void UserLogin() {
        String email = editText_email.getText().toString().trim();
        String password = editText_password.getText().toString().trim();

        if(email.isEmpty()){
            editText_email.setError("Email is required!");
            editText_email.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editText_email.setError("Please enter valid email");
            editText_email.requestFocus();
            return;

        }

        if(password.isEmpty()){
            editText_password.setError("Password is Required!");
            editText_password.requestFocus();
            return;
        }
        if(password.length()<6){
            editText_password.setError("Weak password should enter min 6 Characters");
            editText_password.requestFocus();
            return;
        }

        progressBar.setVisibility(View.GONE);
        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){
                    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                    if(user.isEmailVerified()){
                        //redirect to user profile
                        startActivity(new Intent(MainActivity.this, Menu_Activity.class));
                    }else{
                        user.sendEmailVerification();
                        Toast.makeText(MainActivity.this,"Check your Email to verify your account ", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(MainActivity.this, " Faild login! Please check your cerdentials", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}