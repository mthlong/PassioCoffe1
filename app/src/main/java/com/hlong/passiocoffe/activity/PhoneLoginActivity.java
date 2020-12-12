package com.hlong.passiocoffe.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.hbb20.CountryCodePicker;
import com.hlong.passiocoffe.R;


public class PhoneLoginActivity extends AppCompatActivity {
    CountryCodePicker countryCodePicker_107;
    EditText edt_phone_107;
    Button btn_continue_107;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_login);
        countryCodePicker_107 = findViewById(R.id.ccp_107);
        edt_phone_107 = findViewById(R.id.edt_input_phone_107);
        btn_continue_107 = findViewById(R.id.btn_continue_107);
        countryCodePicker_107.registerCarrierNumberEditText(edt_phone_107);

        btn_continue_107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneLoginActivity.this, OTPManaActivity.class);
                intent.putExtra("mobile", countryCodePicker_107.getFullNumberWithPlus().replace(" ",""));
                startActivity(intent);
            }
        });

    }

    public void back_login(View view) {
    }
}