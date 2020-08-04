package com.inspiresoftware.bmi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView bmi_result , bmi_comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        bmi_result = (TextView) findViewById(R.id.bmi_result);
        bmi_comment = (TextView) findViewById(R.id.bmi_comment);

        String receivedWeight = getIntent().getExtras().getString("weight");
        String receivedHeight = getIntent().getExtras().getString("height");


        double weight_ft = Double.valueOf(receivedWeight) ;
        double height_ft = Double.valueOf(receivedHeight);


        double result = (weight_ft) / Math.pow(height_ft,2);


        String final_result = String.valueOf(result) ;

        bmi_result.setText(final_result);


        if (result < 18.5){

            bmi_comment.setText("You need to eat alot");

        }else if (result >18.5 && result < 24.9 ) {

            bmi_comment.setText("Good , health weight");

        }else if (result > 30){

            bmi_comment.setText("Do some sport NOW !!");

        }



    }




}
