package com.basic.udacity.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // GLOBAL VARIABLES
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the TOUCHDOWN button for team A is clicked.
     * A touchdown is worth six points, and is scored when a team crosses
     * the opposition's goal line with the ball, or catches or collects the
     * ball in the end zone.
     */
    public void updateScoreBySixPointsTeamA(View view) {
        scoreTeamA += 6;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * This method is called when the FIELD POINT button for team A is clicked.
     * A Field goal is worth three points. Field goals are usually attempted on
     * fourth down if the kicker is close enough to the end zone to kick the
     * ball through the posts.
     */
    public void updateScoreByThreePointsTeamA(View view) {
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * This method is called when the +2 POINTS button for team A is clicked.
     * Two points is awarded to the defensive team for a safety when a member
     * of the offensive team is tackled with the ball in his own end zone.
     */
    public void updateScoreByTwoPointsTeamA(View view) {
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * This method is called when the +1 POINT button for team A is clicked.
     * An extra point is earned by kicking the ball through the uprights after a touchdown.
     * The team can go for two points by taking the ball into the end zone again.
     */
    public void updateScoreByOnePointTeamA(View view) {
        scoreTeamA += 1;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * This method is called when the TOUCHDOWN button for team B is clicked.
     */
    public void updateScoreBySixPointsTeamB(View view) {
        scoreTeamB += 6;
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * This method is called when the FIELD GOAL button for team B is clicked.
     */
    public void updateScoreByThreePointsTeamB(View view) {
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * This method is called when the +2 POINTS button for team B is clicked.
     */
    public void updateScoreByTwoPointsTeamB(View view) {
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * This method is called when the +1 POINT button for team B is clicked.
     */
    public void updateScoreByOnePointTeamB(View view) {
        scoreTeamB += 1;
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * This method is called when the RESET button is clicked.
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * This method displays the score for team A on the screen.
     */
    private void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays the score for team B on the screen.
     */
    private void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
