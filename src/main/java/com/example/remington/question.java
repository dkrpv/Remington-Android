package com.example.remington;

import java.util.Random;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class question extends AppCompatActivity {
    public static Random rand = new Random();
    public static int score = 0;
    public static int nroRan1, nroRan2;
    public static String mainEx;
    public static int vastaus;
    public static String pAnsText;
    public static int pAnsInt;
    EditText pAns = findViewById(R.id.pAns);
    TextView exerciseText = findViewById(R.id.exerciseText);
    Button submAns = findViewById(R.id.submAns);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);
        exerciseX();
    }
    private void exerciseX() {
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
