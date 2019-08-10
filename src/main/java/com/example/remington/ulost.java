package com.example.remington;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ulost extends AppCompatActivity {
    String scoreSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ulost);
        loseFinal();
    }
    public void loseFinal() {
        TextView scoreText = findViewById(R.id.scoreText);
        scoreSet = ("You got: " + question.score);
        scoreText.setText(scoreSet);
    }
}
