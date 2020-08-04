package com.inspiresoftware.bmi;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText weight_et , height_et ;
    Button calculate ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight_et = (EditText) findViewById(R.id.weight_et);
        height_et = (EditText) findViewById(R.id.height_et);
        calculate = (Button) findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bmiCalculator();

            }
        });


    }


    public void bmiCalculator(){

        String weight_st = weight_et.getText().toString() ;
        String height_st = height_et.getText().toString();


        if ( !weight_st.equals("")  && !height_st.equals("") ) {

            Intent i = new Intent(MainActivity.this , ResultActivity.class) ;
            i.putExtra("weight",weight_st);
            i.putExtra("height", height_st);

            startActivity(i);


        }else {

            Toast.makeText(getApplicationContext() , "Please enter all data" , Toast.LENGTH_SHORT).show();
        }

    }





}
