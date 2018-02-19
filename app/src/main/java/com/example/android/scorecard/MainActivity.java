package com.example.android.scorecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreNearCorner = 10;
    int scoreFarCorner = 10;
    String wNearCorner = "W";
    String wFarCorner = "W";
    String lNearCorner = "L";
    String lFarCorner = "L";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        CheckBox chebox = (CheckBox)findViewById(R.id.checkBox);
        CheckBox chebox2 =  (CheckBox)findViewById(R.id.checkBox2);
        CheckBox chebox3 =  (CheckBox)findViewById(R.id.checkBox3);
        CheckBox chebox4 = (CheckBox) findViewById(R.id.checkBox4);
        CheckBox chebox5 = (CheckBox) findViewById(R.id.checkBox5);
        


        // do som}ething =

        // do something else

    }


    /**
     * displays penalty for far corner
     */
    public void penFarCorner(View v) {

        scoreFarCorner = scoreFarCorner - 1;
        displayForFarCorner(scoreFarCorner);

    }

    /**
     * displays penalty for Near corner
     */
    public void penNearCorner(View v) {

        scoreNearCorner = scoreNearCorner - 1;
        displayForNearrCorner(scoreNearCorner);

    }

    /**
     * displays knock down for far corner
     */
    public void kdFarCorner(View v) {

        scoreFarCorner = scoreFarCorner - 1;
        displayForFarCorner(scoreFarCorner);
    }

    /**
     * displays penalty for near corner
     */
    public void kdNearCorner(View v) {

        scoreNearCorner = scoreNearCorner - 1;
        displayForNearrCorner(scoreNearCorner);

    }

    public void winNearCorner(View v) {
        displayForNearrCorner(wNearCorner);
        displayForFarCorner(lFarCorner);
    }

    public void winFarCorner(View v) {
        displayForFarCorner(wFarCorner);
        displayForNearrCorner(lNearCorner);

    }

    /**
     * This Method Displays the reset of the score
     */
    public void resetScore(View v) {
        scoreFarCorner = 10;
        scoreNearCorner = 10;

        displayForNearrCorner(scoreNearCorner);
        displayForFarCorner(scoreFarCorner);

    }


    /**
     * Displays the given score for  corner.
     */
    public void displayForFarCorner(int score) {

        TextView scoreView = (TextView) findViewById(R.id.farCorner);

        scoreView.setText(String.valueOf(score));
    }

    public void displayForFarCorner(String score) {

        TextView scoreView = (TextView) findViewById(R.id.farCorner);

        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for far corner.
     */
    public void displayForNearrCorner(int score) {

        TextView scoreView = (TextView) findViewById(R.id.nearCorner);

        scoreView.setText(String.valueOf(score));
    }

    public void displayForNearrCorner(String score) {

        TextView scoreView = (TextView) findViewById(R.id.nearCorner);

        scoreView.setText(String.valueOf(score));
    }

}