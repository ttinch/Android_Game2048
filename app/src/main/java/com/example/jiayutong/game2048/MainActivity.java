package com.example.jiayutong.game2048;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.jiayutong.game2048.R.string.score;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {
        mainActivity = this;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScore = (TextView) findViewById(R.id.tvScore);
    }

    public void clearScore() {
        score = 0;
    }

    public void showScore() {
        tvScore.setText(score+"");
    }

    void addScore(int s){
        score += s;
        showScore();
    }

    private int score = 0;
    private TextView tvScore;

    private static MainActivity mainActivity = null;

    public static MainActivity getMainActivity() {
        return mainActivity;
    }
}
