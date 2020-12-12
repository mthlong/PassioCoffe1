package com.hlong.passiocoffe.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import com.hlong.passiocoffe.R;

import java.util.concurrent.TimeUnit;


public class OTPManaActivity extends AppCompatActivity {
    EditText edt_phone_107;
    Button btn_continue_107;
    String phone_num_107;
    private FirebaseAuth mAuth;
    String otpID;
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p_mana);
        edt_phone_107 = findViewById(R.id.edt_code_very_107);
        btn_continue_107 = findViewById(R.id.btn_next_107);
        phone_num_107 = getIntent().getStringExtra("mobile").toString();
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            @Override
            public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                otpID = s;
            }

            @Override
            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                signInWithPhoneAuthCredential(phoneAuthCredential);
            }

            @Override
            public void onVerificationFailed(@NonNull FirebaseException e) {
                Toast.makeText(getApplicationContext(), "Mã xác nhận không đúng", Toast.LENGTH_SHORT).show();
            }
        };


        btn_continue_107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt_phone_107.getText().toString().isEmpty())
                    Toast.makeText(getApplicationContext(), "Vui lòng nhập mã xác nhận", Toast.LENGTH_SHORT).show();
                else if (edt_phone_107.getText().toString().length() != 6)
                    Toast.makeText(getApplicationContext(), "Mã xác nhận phải đủ 6 kí tự", Toast.LENGTH_SHORT).show();
                else {
                    PhoneAuthCredential phoneAuthCredential = PhoneAuthProvider.getCredential(otpID, edt_phone_107.getText().toString());
                    signInWithPhoneAuthCredential(phoneAuthCredential);
                }
            }
        });

    }

    private void intiaotp() {
        PhoneAuthOptions options =
                PhoneAuthOptions.newBuilder(mAuth)
                        .setPhoneNumber(phone_num_107)       // Phone number to verify
                        .setTimeout(60L, TimeUnit.SECONDS) // Timeout and unit
                        .setActivity(this)
                        .setCallbacks(mCallbacks)// Activity (for callback binding)
                        .build();
        PhoneAuthProvider.verifyPhoneNumber(options);
    }

    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            startActivity(new Intent(OTPManaActivity.this, HomeActivity.class));
                            finish();
                        } else {
                            Toast.makeText(getApplicationContext(), "Mã xác nhận không đúng", Toast.LENGTH_SHORT).show();

                        }
                    }
                });
    }


    public void back_type_phone(View view) {

    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        intiaotp();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}