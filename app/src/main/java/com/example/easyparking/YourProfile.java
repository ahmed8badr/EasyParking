package com.example.easyparking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class YourProfile extends AppCompatActivity implements View.OnClickListener {
    private Button back;
    private FirebaseUser user;
    private DatabaseReference reference;

    private String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_profile);

        back= (Button) findViewById(R.id.back_Btn);
        back.setOnClickListener(this);

        user = FirebaseAuth.getInstance().getCurrentUser();
        reference= FirebaseDatabase.getInstance().getReference("user");
        userID= user.getUid();

        final TextView greetingTextView= (TextView) findViewById(R.id.greeting);
        final TextView Email_AddressTextView= (TextView) findViewById(R.id.emailAdress);
        final TextView FullNameTextView= (TextView) findViewById(R.id.fullName);
        final TextView carNameTextView= (TextView) findViewById(R.id.carName);
        final TextView carLicenseTextView= (TextView) findViewById(R.id.carLicense);
        final TextView carColorTextView= (TextView) findViewById(R.id.carColor);
        final TextView PhoneNumberTextView= (TextView) findViewById(R.id.phoneNumber);

        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userprofile = snapshot.getValue(User.class);

                if(userprofile != null){
                    String email = userprofile.Email;
                    String fullName = userprofile.fullname;
                    String phone = userprofile.phoneNumber;
                    String carName = userprofile.carName;
                    String carLicense = userprofile.carLicense;
                    String carColor = userprofile.carColor;

                    greetingTextView.setText("Welcome, " + fullName + "!");
                    Email_AddressTextView.setText(email);
                    FullNameTextView.setText(fullName);
                    carNameTextView.setText(carName);
                    carLicenseTextView.setText(carLicense);
                    carColorTextView.setText(carColor);
                    PhoneNumberTextView.setText(phone);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(YourProfile.this,"Something wrong Happend!",Toast.LENGTH_LONG).show();

            }
        });




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back_Btn:
                startActivity(new Intent(YourProfile.this, Menu_Activity.class));
                break;
        }
    }
}