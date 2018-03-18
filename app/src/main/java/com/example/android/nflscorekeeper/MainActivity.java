package com.example.android.nflscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void displayA(int score) {
        TextView scoreA = (TextView) findViewById(R.id.score_a);
        scoreA.setText(String.valueOf(score));
    }

    public void displayB(int score) {
        TextView scoreB = (TextView) findViewById(R.id.score_b);
        scoreB.setText(String.valueOf(score));
    }

    public void showFootballA(View view) {
        ImageView football = (ImageView) findViewById(R.id.football);
        football.setVisibility(View.VISIBLE);
    }


    int scoreA = 0;
    int scoreB = 0;


    public void noScore(View view) {
        scoreA = 0;
        displayA(scoreA);
        scoreB = 0;
        displayB(scoreB);
    }


    public void sixPointsB(View view) {
        scoreB = scoreB + 6;
        displayB(scoreB);
    }

    public void onePointB(View view) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }

    public void twoPointsB(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

    public void threePointsB(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    public void safetyB(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }



    public void sixPointsA(View view) {
        scoreA = scoreA + 6;
        displayA(scoreA);
    }

    public void onePointA(View view) {
        scoreA = scoreA + 1;
        displayA(scoreA);
    }

    public void twoPointsA(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }

    public void threePointsA(View view) {
        scoreA = scoreA + 3;
        displayA(scoreA);
    }

    public void safetyA(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

}

