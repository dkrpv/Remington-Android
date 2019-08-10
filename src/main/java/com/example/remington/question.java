package com.example.remington;

import java.util.Random;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class question extends AppCompatActivity {
    Random rand;
    static int score;
    int nroRan1;
    int nroRan2;
    String mainEx;
    int vastaus;
    String pAnsText;
    int pAnsInt;
    EditText pAns;
    TextView exerciseText;
    Button submAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);
        exerciseX();
    }
    private void exerciseX() {
        rand = new Random();
        score = 0;
        pAns = findViewById(R.id.pAns);
        exerciseText = (TextView) findViewById(R.id.exerciseText);
        submAns = (Button) findViewById(R.id.submAns);
        nroRan1 = rand.nextInt(1000) + 1;
        nroRan2 = rand.nextInt(1000) + 1;
        mainEx = (nroRan1 + "+" + nroRan2);
        exerciseText.setText(mainEx);
        vastaus = (nroRan1 + nroRan2);
        submAns.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                checkAns();
            }
        });
    }
    private void checkAns() {
        pAnsText = pAns.getText().toString();
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

    }
}
