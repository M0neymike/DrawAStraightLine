package com.singlefilelineproductions.drawastraightline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import java.util.TimerTask;

public class Game extends AppCompatActivity {

    private LineView lineView;
    private ImageView line;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        lineView = (LineView) findViewById(R.id.lineView);
        Button retrybtn = (Button) findViewById(R.id.retry);
        Button backbutton = (Button) findViewById(R.id.backbutton);
        line = (ImageView) findViewById(R.id.line);

        retrybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(   Game.this, Game.class));
            }
        });

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Game.this, HomeActivity.class));
            }
        });

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        lineView.init(metrics);
    }

}

