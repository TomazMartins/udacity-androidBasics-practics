package br.com.udacity.androidbasics.tomazmartins.courtcounter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView score_TeamA;
    private TextView score_TeamB;
    private AppCompatButton btn_threePoints_teamA;
    private AppCompatButton btn_twoPoints_teamA;
    private AppCompatButton btn_freeThrow_teamA;

    private AppCompatButton btn_threePoints_teamB;
    private AppCompatButton btn_twoPoints_teamB;
    private AppCompatButton btn_freeThrow_teamB;

    private AppCompatButton btn_reset_game;

    private int scoreTeamA;
    private int scoreTeamB;

    @SuppressLint( "WrongViewCast" )
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        score_TeamA = (TextView) findViewById( R.id.points_teamA );
        btn_threePoints_teamA = (AppCompatButton) findViewById( R.id.btn_threePoints_teamA );
        btn_twoPoints_teamA = (AppCompatButton) findViewById( R.id.btn_twoPoints_teamA );
        btn_freeThrow_teamA = (AppCompatButton) findViewById( R.id.btn_freeThrow_teamA );

        score_TeamB = (TextView) findViewById( R.id.points_teamB );
        btn_threePoints_teamB = (AppCompatButton) findViewById( R.id.btn_threePoints_teamB );
        btn_twoPoints_teamB = (AppCompatButton) findViewById( R.id.btn_twoPoints_teamB );
        btn_freeThrow_teamB = (AppCompatButton) findViewById( R.id.btn_freeThrow_teamB );

        btn_reset_game = (AppCompatButton) findViewById( R.id.btn_reset );

        scoreTeamA = 0;
        scoreTeamB = 0;

        setButtons();
    }

    public void setButtons() {
        addThreePointsTeamA();
        addTwoPointsTeamA();
        addOnePointTeamA();

        addThreePointsTeamB();
        addTwoPointsTeamB();
        addOnePointTeamB();

        resetGame();
    }

    public void addThreePointsTeamA() {
        btn_threePoints_teamA.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                scoreTeamA += 3;
                displayForTeamA( scoreTeamA );
            }
        } );
    }

    public void addTwoPointsTeamA() {
        btn_twoPoints_teamA.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                scoreTeamA += 2;
                displayForTeamA( scoreTeamA );
            }
        } );
    }

    public void addOnePointTeamA() {
        btn_freeThrow_teamA.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                scoreTeamA += 1;
                displayForTeamA( scoreTeamA );
            }
        } );
    }

    public void displayForTeamA( int score ) {
        score_TeamA.setText( String.valueOf( score ) );
    }

    public void addThreePointsTeamB() {
        btn_threePoints_teamB.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                scoreTeamB += 3;
                displayForTeamB( scoreTeamB );
            }
        } );
    }

    public void addTwoPointsTeamB() {
        btn_twoPoints_teamB.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                scoreTeamB += 2;
                displayForTeamB( scoreTeamB );
            }
        } );
    }

    public void addOnePointTeamB() {
        btn_freeThrow_teamB.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                scoreTeamB += 1;
                displayForTeamB( scoreTeamB );
            }
        } );
    }

    public void displayForTeamB( int score ) {
        score_TeamB.setText( String.valueOf( score ) );
    }

    public void resetGame() {
        btn_reset_game.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                scoreTeamA = 0;
                scoreTeamB = 0;

                displayForTeamA( scoreTeamA );
                displayForTeamB( scoreTeamB );
            }
        } );
    }
}

