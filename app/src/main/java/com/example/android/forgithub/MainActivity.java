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

import com.example.android.forgithub.R;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onRadioButtonClicked(View view) {
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

    public void sendAnswer1(View view) {

    }

    public void sendAnswer2(View view) {

    }

    public void sendAnswer3(View view) {

    }

    public void sendAnswer4(View view) {

    }


    /**
     * This method is called when the check button is clicked.
     */
    public void checkAnswers(View view) {

        RadioGroup radioPopulation = (RadioGroup)findViewById(R.id.radio1);
        String worldPopulation= (RadioButton)this.findViewById(radioPopulation.getCheckedRadioButtonId())).getText().toString();

        CheckBox spendWaterCheckBox =(CheckBox)findViewById(R.id.opt9);
        boolean liketoSpendWater = spendWaterCheckBox.isChecked();




    }
}
