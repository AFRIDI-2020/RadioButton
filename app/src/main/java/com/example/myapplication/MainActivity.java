package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup1,radioGroup2,radioGroup3;
    RadioButton option1,option2,option3,option4,option5,option6,option7,option8,option9,option10,option11,option12;
    String Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup1=  findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);
        radioGroup3 = findViewById(R.id.radioGroup3);
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        option5 = findViewById(R.id.option5);
        option6 = findViewById(R.id.option6);
        option7 = findViewById(R.id.option7);
        option8 = findViewById(R.id.option8);
        option9 = findViewById(R.id.option9);
        option10 = findViewById(R.id.option10);
        option11 = findViewById(R.id.option11);
        option12 = findViewById(R.id.option12);
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.option1){

                   task2();
                   Text = option1.getText().toString();
                    Toast.makeText(MainActivity.this, "One"+Text, Toast.LENGTH_SHORT).show();

                }
                if(checkedId==R.id.option2){
                    task2();
                    Text = option2.getText().toString();
                    Toast.makeText(MainActivity.this, "Two"+Text, Toast.LENGTH_SHORT).show();
                    }
                if(checkedId==R.id.option3){

                    task2();
                    Text = option3.getText().toString();
                    Toast.makeText(MainActivity.this, "Three"+Text, Toast.LENGTH_SHORT).show();
                }
                if(checkedId==R.id.option4){
                    task2();
                    Text = option4.getText().toString();
                    Toast.makeText(MainActivity.this, "Four"+Text, Toast.LENGTH_SHORT).show();
                }

            }
        });

        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                if(checkedId == R.id.option5){

                    task1();
                    Text = option5.getText().toString();
                    Toast.makeText(MainActivity.this, "Five"+Text, Toast.LENGTH_SHORT).show();
                      }
                 if(checkedId == R.id.option6){
                     task1();
                     Text = option6.getText().toString();
                     Toast.makeText(MainActivity.this, "Six"+Text, Toast.LENGTH_SHORT).show();
                 }
                if(checkedId == R.id.option7){
                    task1();
                    Text = option7.getText().toString();
                    Toast.makeText(MainActivity.this, "Seven"+Text, Toast.LENGTH_SHORT).show();


                }
                if(checkedId == R.id.option8){
                    task1();
                    Text = option8.getText().toString();
                    Toast.makeText(MainActivity.this, "Eight"+Text, Toast.LENGTH_SHORT).show();


                }

            }
        });

        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                if(checkedId == R.id.option9){

                    task3();
                    Text = option9.getText().toString();
                    Toast.makeText(MainActivity.this, "Nine"+Text, Toast.LENGTH_SHORT).show();

                }
                if(checkedId == R.id.option10){
                    task3();
                    Text = option10.getText().toString();
                    Toast.makeText(MainActivity.this, "Ten"+Text, Toast.LENGTH_SHORT).show();


                }
                if(checkedId == R.id.option11){
                    task3();
                    Text = option11.getText().toString();
                    Toast.makeText(MainActivity.this, "Eleven"+Text, Toast.LENGTH_SHORT).show();


                }
                if(checkedId == R.id.option12){
                    task3();
                    Text = option12.getText().toString();
                    Toast.makeText(MainActivity.this, "Towelve"+Text, Toast.LENGTH_SHORT).show();


                }

            }
        });

    }



    private void task1() {

        radioGroup1.setOnCheckedChangeListener(null);
        radioGroup1.clearCheck();
        radioGroup3.setOnCheckedChangeListener(null);
        radioGroup3.clearCheck();

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                task2();

            }
        });

        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                task3();
            }
        });
    }

    private void task2() {

        radioGroup2.setOnCheckedChangeListener(null);
        radioGroup2.clearCheck();
        radioGroup3.setOnCheckedChangeListener(null);
        radioGroup3.clearCheck();

        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                task1();

            }
        });

        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                task3();
            }
        });
    }

    private void task3() {
        radioGroup1.setOnCheckedChangeListener(null);
        radioGroup1.clearCheck();
        radioGroup2.setOnCheckedChangeListener(null);
        radioGroup2.clearCheck();

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                task1();
            }
        });

        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                task2();

            }
        });



    }



}
