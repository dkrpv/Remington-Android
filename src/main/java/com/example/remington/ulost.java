package com.example.remington;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ulost extends AppCompatActivity {
    TextView scoreText = findViewById(R.id.scoreText);
    public static String scoreSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ulost);
        loseFinal();
    }
    private void loseFinal() {
        scoreSet = ("You got: " + question.score);
        scoreText.setText(scoreSet);
    }
}
