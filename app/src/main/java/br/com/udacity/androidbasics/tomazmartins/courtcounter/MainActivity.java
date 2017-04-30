package br.com.udacity.androidbasics.tomazmartins.courtcounter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView scoreView;
    private AppCompatButton btn_threePoints_teamA;
    private AppCompatButton btn_twoPoints_teamA;
    private AppCompatButton btn_freeThrow_teamA;

    private int scoreTeamA;

    @SuppressLint( "WrongViewCast" )
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        scoreView = (TextView) findViewById( R.id.points_teamA );
        btn_threePoints_teamA = (AppCompatButton) findViewById( R.id.btn_threePoints_teamA );
        btn_twoPoints_teamA = (AppCompatButton) findViewById( R.id.btn_twoPoints_teamA );
        btn_freeThrow_teamA = (AppCompatButton) findViewById( R.id.btn_freeThrow_teamA );

        scoreTeamA = 0;

        setButtons();
    }

    public void setButtons() {
        addThreePointsTeamA();
        addTwoPointsTeamA();
        addOnePointTeamA();
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
        TextView scoreView = (TextView) findViewById( R.id.points_teamA );
        scoreView.setText( String.valueOf( score ) );
    }
}

