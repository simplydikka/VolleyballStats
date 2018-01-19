package com.example.android.volleyballstats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.volleyballstats.R;

public class MainActivity extends AppCompatActivity {

    int currentScoreTeamA = 0;

    int currentScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds three points for team A.
     */
    public void addThreeForTeamA(View view) {
        currentScoreTeamA = currentScoreTeamA + 3;
        displayForTeamA(currentScoreTeamA);

    }

    /**
     * Adds two points for team A
     */
    public void addTwoForTeamA(View view) {
        currentScoreTeamA = currentScoreTeamA + 2;
        displayForTeamA(currentScoreTeamA);
    }

    /**
     * Adds one point for team A
     */
    public void addOneForTeamA(View view) {
        currentScoreTeamA = currentScoreTeamA + 1;
        displayForTeamA(currentScoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds three points for team B.
     */
    public void addThreeForTeamB(View view) {
        currentScoreTeamB = currentScoreTeamB + 3;
        displayForTeamB(currentScoreTeamB);

    }

    /**
     * Adds two points for team B
     */
    public void addTwoForTeamB(View view) {
        currentScoreTeamB = currentScoreTeamB + 2;
        displayForTeamB(currentScoreTeamB);
    }

    /**
     * Adds one point for team A
     */
    public void addOneForTeamB(View view) {
        currentScoreTeamB = currentScoreTeamB + 1;
        displayForTeamB(currentScoreTeamB);
    }

    public void resetBothScores(View view) {
        currentScoreTeamA = 0;
        currentScoreTeamB = 0;
        displayForTeamA(currentScoreTeamA);
        displayForTeamB(currentScoreTeamB);
    }
}
