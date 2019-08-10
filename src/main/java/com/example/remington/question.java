package com.example.remington;

import java.util.Random;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class question extends AppCompatActivity {
    static int score;
    private int nroRan1;
    private int nroRan2;
    private int vastaus;
    private int pAnsInt;
    private EditText pAns;
    private TextView exerciseText;
    private Button submAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        score = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);
        exerciseX();
    }
    private void exerciseX() {
        Random rand;
        rand = new Random();
        pAns = findViewById(R.id.pAns);
        exerciseText = (TextView) findViewById(R.id.exerciseText);
        submAns = (Button) findViewById(R.id.submAns);
        nroRan1 = rand.nextInt(1000) + 1;
        nroRan2 = rand.nextInt(1000) + 1;
        String mainEx = (nroRan1 + "+" + nroRan2);
        exerciseText.setText(mainEx);
        vastaus = (nroRan1 + nroRan2);
        submAns.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                checkAns();
            }
        });
    }
    private void checkAns() {
        String pAnsText = pAns.getText().toString();
        pAnsInt = Integer.parseInt(pAnsText);
        if(pAnsInt == vastaus){
            score += 1;
            exerciseX();
            vastaus = (nroRan1 + nroRan2);
        }
        else {
            uLose();
        }
    }
    private void uLose() {
        Intent intent = new Intent(this, ulost.class);
        startActivity(intent);
    }
}
