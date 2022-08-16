package com.example.easyparking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Registration extends AppCompatActivity implements View.OnClickListener{

    private EditText full_name_editText, email_editText, password_editText,car_name_editText, car_license_editText, phone_editText, car_color_editText;
    private Button register_btn;

    private ProgressBar progressBar;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mAuth = FirebaseAuth.getInstance();



        register_btn= (Button) findViewById(R.id.register_btn);
        register_btn.setOnClickListener(this);

        full_name_editText= (EditText) findViewById(R.id.full_name_EditText);
        email_editText= (EditText) findViewById(R.id.email_Regaster_EditText);
        password_editText= (EditText) findViewById(R.id.password_register);
        car_name_editText= (EditText) findViewById(R.id.car_name_Edit_Text);
        car_license_editText= (EditText) findViewById(R.id.car_license_Edit_Text);
        car_color_editText= (EditText) findViewById(R.id.car_color_number);
        phone_editText= (EditText) findViewById(R.id.phone_number);
        progressBar= (ProgressBar) findViewById(R.id.progressbar);
    }

    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.register_btn:
               register();
               break;
        }
    }
    private void register() {
        String email= email_editText.getText().toString().trim();
        String full_name= full_name_editText.getText().toString().trim();
        String password= password_editText.getText().toString().trim();
        String car_name= car_name_editText.getText().toString().trim();
        String car_color= car_color_editText.getText().toString().trim();
        String car_license= car_license_editText.getText().toString().trim();
        String phone= phone_editText.getText().toString().trim();

        if(full_name.isEmpty()){
            full_name_editText.setError("Full Name is Required!");
            full_name_editText.requestFocus();
            return;
        }
        if(email.isEmpty()){
            email_editText.setError("E-mail is Required!");
            email_editText.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            email_editText.setError("Please provide valid E-mail");
            email_editText.requestFocus();
            return;
        }

        if(password.length()<6){
            password_editText.setError("Weak password should be 6 Characters!");
            password_editText.requestFocus();
            return;
        }
        if(car_name.isEmpty()){
            car_name_editText.setError("Car Name is Required!");
            car_name_editText.requestFocus();
            return;
        }
        if(car_license.isEmpty()){
            car_license_editText.setError("Car License Number is Required!");
            car_license_editText.requestFocus();
            return;
        }
        if(phone.isEmpty()){
            phone_editText.setError("Phone Number is Required!");
            password_editText.requestFocus();
            return;
        }
        if(car_color.isEmpty()){
            car_color_editText.setError("Car Color is Required!");
            car_color_editText.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);

        mAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            User user= new User(full_name,email,car_name, car_color, car_license, phone);

                            FirebaseDatabase.getInstance().getReference("user")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()){
                                        Toast.makeText(Registration.this,"User has been registered successfully!", Toast.LENGTH_LONG).show();
                                        progressBar.setVisibility(View.GONE);
                                        // redirect to login.
                                        startActivity(new Intent(Registration.this,MainActivity.class));

                                    }else {
                                        Toast.makeText(Registration.this, " Faild to register! Try Again!", Toast.LENGTH_LONG).show();
                                        progressBar.setVisibility(View.GONE);
                                    }
                                }
                            });

                        }else {
                            Toast.makeText(Registration.this, " Faild to register! Try Again!", Toast.LENGTH_LONG).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });


    }

}