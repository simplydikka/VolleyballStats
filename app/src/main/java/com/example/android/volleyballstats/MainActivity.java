package com.example.android.volleyballstats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.volleyballstats.R;

public class MainActivity extends AppCompatActivity {


    int currentAceScoreTeamA = 0;
    int currentKillScoreTeamA = 0;
    int currentBlockScoreTeamA = 0;
    int currentAceScoreTeamB = 0;
    int currentKillScoreTeamB = 0;
    int currentBlockScoreTeamB = 0;
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
     * Displays the ACEs stats for team A
     */

    public void displayAceStatsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_ace_stats);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds one Ace point for Team A in stats and adds one point to the current score.
     */
    public void addAceForTeamA(View view) {
        currentAceScoreTeamA = currentAceScoreTeamA + 1;
        currentScoreTeamA = currentAceScoreTeamA + currentKillScoreTeamA + currentBlockScoreTeamA;
        displayForTeamA(currentScoreTeamA);
        displayAceStatsTeamA(currentAceScoreTeamA);

    }

    /**
     * Displays the KILLs stats for team A
     */

    public void displayKillsStatsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_kills_stats);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds one Kill point for Team A in stats and adds one point to the current score.
     */
    public void addKillForTeamA(View view) {
        currentKillScoreTeamA = currentKillScoreTeamA + 1;
        currentScoreTeamA = currentAceScoreTeamA + currentKillScoreTeamA + currentBlockScoreTeamA;
        displayForTeamA(currentScoreTeamA);
        displayKillsStatsTeamA(currentKillScoreTeamA);
    }

    /**
     * Displays the BLOCKs stats for team A
     */

    public void displayBlocksStatsTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_blocks_stats);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds one BLOCK point for Team A in stats and adds one point to the current score.
     */
    public void addBlockForTeamA(View view) {
        currentBlockScoreTeamA = currentBlockScoreTeamA + 1;
        currentScoreTeamA = currentAceScoreTeamA + currentKillScoreTeamA + currentBlockScoreTeamA;
        displayForTeamA(currentScoreTeamA);
        displayBlocksStatsTeamA(currentBlockScoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the ACEs stats for team B
     */

    public void displayAceStatsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_ace_stats);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds one Ace point for Team B in stats and adds one point to the current score.
     */
    public void addAceForTeamB(View view) {
        currentAceScoreTeamB = currentAceScoreTeamB + 1;
        currentScoreTeamB = currentAceScoreTeamB + currentKillScoreTeamB + currentBlockScoreTeamB;
        displayForTeamB(currentScoreTeamB);
        displayAceStatsTeamB(currentAceScoreTeamB);

    }

    /**
     * Displays the KILLs stats for team B
     */

    public void displayKillsStatsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_kills_stats);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds one Kill point for Team B in stats and adds one point to the current score.
     */
    public void addKillForTeamB(View view) {
        currentKillScoreTeamB = currentKillScoreTeamB + 1;
        currentScoreTeamB = currentAceScoreTeamB + currentKillScoreTeamB + currentBlockScoreTeamB;
        displayForTeamB(currentScoreTeamB);
        displayKillsStatsTeamB(currentKillScoreTeamB);
    }

    /**
     * Displays the BLOCKs stats for team B
     */

    public void displayBlocksStatsTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_blocks_stats);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Adds one BLOCK point for Team B in stats and adds one point to the current score.
     */
    public void addBlockForTeamB(View view) {
        currentBlockScoreTeamB = currentBlockScoreTeamB + 1;
        currentScoreTeamB = currentAceScoreTeamB + currentKillScoreTeamB + currentBlockScoreTeamB;
        displayForTeamB(currentScoreTeamB);
        displayBlocksStatsTeamB(currentBlockScoreTeamB);
    }

    /**
     * Resets all scores for both themes
     *
     * @param view
     */
    public void resetBothScores(View view) {
        currentScoreTeamA = 0;
        currentScoreTeamB = 0;
        currentAceScoreTeamA = 0;
        currentKillScoreTeamA = 0;
        currentBlockScoreTeamA = 0;
        displayForTeamA(currentScoreTeamA);
        displayForTeamB(currentScoreTeamB);
        displayAceStatsTeamA(currentAceScoreTeamA);
        displayKillsStatsTeamA(currentKillScoreTeamA);
        displayBlocksStatsTeamA(currentBlockScoreTeamA);
        currentAceScoreTeamB = 0;
        currentKillScoreTeamB = 0;
        currentBlockScoreTeamB = 0;
        displayAceStatsTeamB(currentAceScoreTeamB);
        displayKillsStatsTeamB(currentKillScoreTeamB);
        displayBlocksStatsTeamB(currentBlockScoreTeamB);
    }


}

