package com.example.android.worldknowledgequiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.R.attr.data;
import static com.example.android.worldknowledgequiz.R.id.opt1;
import static com.example.android.worldknowledgequiz.R.id.opt10;
import static com.example.android.worldknowledgequiz.R.id.opt11;
import static com.example.android.worldknowledgequiz.R.id.opt12;
import static com.example.android.worldknowledgequiz.R.id.opt13;
import static com.example.android.worldknowledgequiz.R.id.opt14;
import static com.example.android.worldknowledgequiz.R.id.opt9;
import static com.example.android.worldknowledgequiz.R.id.persons_name;
import static com.example.android.worldknowledgequiz.R.id.radio1;
import static com.example.android.worldknowledgequiz.R.string.quantity;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onRadioButtonClicked1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.boy:
                if (checked)
                    // A boy
                    Toast.makeText (this, "Yup! That's who you are!", Toast.LENGTH_SHORT).show();
                     return;

            case R.id.girl:
                if (checked)
                    // A girl
                    Toast.makeText (this, "Yup! That's who you are!", Toast.LENGTH_SHORT).show();
                return;
            case R.id.anET:
                if (checked)
                    // An E.t
                    Toast.makeText (this, "Yup! That's who you are!", Toast.LENGTH_SHORT).show();
                return;
            case R.id.none:
                if (checked)
                    // None
                Toast.makeText (this, "Yup! That's who you are!", Toast.LENGTH_SHORT).show();
                return;
        }

    }


    /**
     * This method is called when the check button is clicked.
     */
    public void checkAnswers(View view) {
        //Access the RadioGroup view and save it to a variable.

        RadioGroup radioQuestionOne = (RadioGroup)findViewById(R.id.radio1);

        //Save solution to add to score

        int solutionOne = radioQuestionOne.getCheckedRadioButtonId();
        if (solutionOne == R.id.jp) {
            score = score + 1;
        } else {
            score = score + 0;

        }


        //Access the RadioGroup2 view and save it to a variable.

        RadioGroup radioQuestionTwo = (RadioGroup)findViewById(R.id.radio2);

        //Save solution to add to score

        int solutionTwo = radioQuestionTwo.getCheckedRadioButtonId();
        if (solutionTwo == R.id.opt3) {
            score = score + 1;
        } else {
            score = score + 0;

        }

        //Access the RadioGroup3 view and save it to a variable.

        RadioGroup radioQuestionThree = (RadioGroup)findViewById(R.id.radio3);

        //Save solution to add to score

        int solutionThree = radioQuestionThree.getCheckedRadioButtonId();
        if (solutionThree == R.id.opt8) {
            score = score + 1;
        } else {
            score = score + 0;

        }

        CheckBox checkBox1 = (CheckBox) findViewById(opt9);
        if (checkBox1.isChecked()) {
            score = score + 0;
        } else {
            score = score + 1;
        }

        CheckBox checkBox2 = (CheckBox) findViewById(opt10);
        if (checkBox2.isChecked()) {
            score = score + 1;
        } else {
            score = score + 0;
        }

        CheckBox checkBox3 = (CheckBox) findViewById(opt11);
        if (checkBox3.isChecked()) {
            score = score + 0;
        } else {
            score = score + 1;
        }

        CheckBox checkBox4 = (CheckBox) findViewById(opt12);
        if (checkBox4.isChecked()) {
            score = score + 1;
        } else {
            score = score + 0;
        }

        CheckBox checkBox5 = (CheckBox) findViewById(opt13);
        if (checkBox5.isChecked()) {
            score = score + 1;
        } else {
            score = score + 0;
        }

        CheckBox checkBox6 = (CheckBox) findViewById(opt14);
        if (checkBox6.isChecked()) {
            score = score + 1;
        } else {
            score = score + 0;
        }


    }

    public void checkResult(View view) {

        // Get the final score.

        int finalScore = score;

        // Get the text from EditText variable.

        EditText nameField = (EditText) findViewById (R.id.persons_name);
        String nameId = nameField.getText().toString();

        // Show score in Toast

        Toast.makeText (this, "You've scored " + score + " points, out of 9pts " + nameId, Toast.LENGTH_SHORT).show();
        return;


    }

    public void resetQuiz(View v) {
        int finalScore= score;
    }




    }

