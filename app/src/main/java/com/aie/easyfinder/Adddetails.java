package com.aie.easyfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

public class Adddetails extends AppCompatActivity {
    EditText etName,etMobile,etEmail,etAddress,etStreet,etCity;
    Button btSub,it;

    AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddetails);

        etName = findViewById(R.id.et_name);
        etMobile = findViewById(R.id.et_number);
        etEmail = findViewById(R.id.et_email);
        etAddress = findViewById(R.id.et_address);
        etCity = findViewById(R.id.et_city);
        btSub = findViewById(R.id.bt_submit);

        //validation

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        //add validation


    }
}
