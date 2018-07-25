package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsForTeamA = 0;
    int foulsForTeamA = 0;
    int yellowCardsForTeamA = 0;
    int redCardsForTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addTeamAPoints(View view){
        pointsForTeamA = pointsForTeamA + 1;
        displayTeamAPoints(pointsForTeamA);
    }

    public void addTeamAFouls(View view){
        foulsForTeamA = foulsForTeamA + 1;
        displayTeamAFouls(foulsForTeamA);
    }

    public void addTeamAYellowCards(View view){
        yellowCardsForTeamA = yellowCardsForTeamA + 1;
        displayTeamAYellowCards(yellowCardsForTeamA);
    }

    public void addTeamARedCards(View view){
        redCardsForTeamA = redCardsForTeamA + 1;
        displayTeamARedCards(redCardsForTeamA);
    }

    public void resetAll(View view){
        pointsForTeamA = 0;
        foulsForTeamA = 0;
        yellowCardsForTeamA = 0;
        redCardsForTeamA = 0;
        displayTeamAPoints(pointsForTeamA);
        displayTeamAFouls(foulsForTeamA);
        displayTeamAYellowCards(yellowCardsForTeamA);
        displayTeamARedCards(redCardsForTeamA);
    }

    private void displayTeamAPoints(int points){
        TextView pointsAView = findViewById(R.id.team_a_points);
        pointsAView.setText(String.valueOf(points));
    }

    private void displayTeamAFouls(int fouls){
        TextView foulsAView = findViewById(R.id.team_a_fouls);
        foulsAView.setText(String.valueOf(fouls));
    }

    private void displayTeamAYellowCards(int yellowCards){
        TextView yellowCardsAView = findViewById(R.id.team_a_yellow_cards);
        yellowCardsAView.setText(String.valueOf(yellowCards));
    }

    private void displayTeamARedCards(int redCards){
        TextView redCardsAView = findViewById(R.id.team_a_red_cards);
        redCardsAView.setText(String.valueOf(redCards));
    }
}
