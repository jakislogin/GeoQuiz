package com.example.android.geoquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //New York
    RadioButton rb_q1_a1;
    //Moscow
    RadioButton rb_q2_a2;
    //Shanghai
    RadioButton rb_q3_a2;
    //Berlin
    RadioButton rb_q4_a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb_q1_a1 = findViewById(R.id.rb_q1_a1);
        rb_q2_a2 = findViewById(R.id.rb_q2_a2);
        rb_q3_a2 = findViewById(R.id.rb_q3_a2);
        rb_q4_a3 = findViewById(R.id.rb_q4_a3);
    }

    public void checkMe(View view) {
        //Score
        int totalScore = 0;
        // Get user's name
        EditText nameField = findViewById(R.id.name_field);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();

        // Figure out if the user wants to play :)
        CheckBox wantToPlay = findViewById(R.id.wantPlay);
        boolean playAbility = wantToPlay.isChecked();

        if (playAbility) {
            // Count points
            if (rb_q1_a1.isChecked()) {
                totalScore += 1;
            }
            if (rb_q2_a2.isChecked()) {
                totalScore += 1;
            }
            if (rb_q3_a2.isChecked()) {
                totalScore += 1;
            }
            if (rb_q4_a3.isChecked()) {
                totalScore += 1;
            }
            Toast.makeText(this, name + " your score is " + totalScore, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, name + " check box if you wanna play!", Toast.LENGTH_LONG).show();
        }

    }
}
