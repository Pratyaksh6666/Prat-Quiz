package com.example.pratquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int Points = 0;
    private RadioButton firstAnswer, secondAnswer, thirdAnswer;
    private CheckBox fourth1, fourth2,fourth3, fourth4;
    private EditText fifthAnswer;
    private TextView points_display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstAnswer = (RadioButton)findViewById(R.id.firstOption_3);
        secondAnswer = (RadioButton)findViewById(R.id.secondOption_1);
        thirdAnswer = (RadioButton)findViewById(R.id.thirdOption_2);
        fourth1 = (CheckBox)findViewById(R.id.fourthOption_1);
        fourth2 = (CheckBox)findViewById(R.id.fourthOption_2);
        fourth3 = (CheckBox)findViewById(R.id.fourthOption_3);
        fourth4 = (CheckBox)findViewById(R.id.fourthOption_4);
        fifthAnswer = (EditText)findViewById(R.id.fifth_answer);
        points_display = (TextView)findViewById(R.id.points_display);
    }

    public void onSubmit(View view) {
        Points = 0;
        String editTextAnswer = fifthAnswer.getText().toString().toLowerCase().trim();
        if (firstAnswer.isChecked()) {
            Points++;
        }
        if (secondAnswer.isChecked()) {
            Points++;
        }
        if (thirdAnswer.isChecked()) {
            Points++;
        }
        if (fourth1.isChecked() && fourth2.isChecked() && fourth4.isChecked()) {
            if(fourth3.isChecked()){

            }else{
                Points++;
            }

        }
        if (editTextAnswer.equals("")) {


        } else if (editTextAnswer.contains(getString(R.string.charles_babbage))) {
            Points++;
        }
        points_display.setText("Points: "+Points);
        Toast.makeText(this, "Total Points: "+Points, Toast.LENGTH_SHORT).show();

    }
}
