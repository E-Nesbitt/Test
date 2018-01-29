package com.example.ethannesbitt.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ConversionActivity extends AppCompatActivity
{
    EditText editText1;
    EditText editText2;
    Button buttonConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);

        buttonConvert = (Button)findViewById(R.id.button);
        buttonConvert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double centInput;
                double inchOutput;
                String centText = editText1.getText().toString();
                if (centText.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter a centimeter value first!", Toast.LENGTH_LONG).show();
                } else {
                    centInput = Double.valueOf(editText1.getText().toString());

                    inchOutput = centInput * 0.393701;

                    editText2.setText(String.valueOf(inchOutput));
                }

            }
        });


    }
}

