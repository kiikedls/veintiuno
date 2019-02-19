package com.example.rey_m.veintiuno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txt1, txt2, txt3;
    Button btn1, btn2, btn3, btn4, btn5, reset;
    int cont = 0, tot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.marca);
        txt2 = findViewById(R.id.suma);
        txt3 = findViewById(R.id.msg);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        reset = findViewById(R.id.restart);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        reset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Random ran = new Random();
        int x = ran.nextInt(10) + 1;
        switch (view.getId()) {
            case R.id.btn1:
                cont++;
                Log.i(String.valueOf(x), "num");

                btn1.setEnabled(false);
                txt1.setText("" + x);
                tot = Integer.parseInt(txt2.getText().toString()) + x;
                txt2.setText("" + tot);
                break;

            case R.id.btn2:
                cont++;
                Log.i(String.valueOf(x), "num");

                btn2.setEnabled(false);
                txt1.setText("" + x);
                tot = Integer.parseInt(txt2.getText().toString()) + x;
                txt2.setText("" + tot);
                break;

            case R.id.btn3:
                cont++;
                Log.i(String.valueOf(x), "num");

                btn3.setEnabled(false);
                txt1.setText("" + x);
                tot = Integer.parseInt(txt2.getText().toString()) + x;
                txt2.setText("" + tot);
                break;

            case R.id.btn4:
                cont++;
                Log.i(String.valueOf(x), "num");

                btn4.setEnabled(false);
                txt1.setText("" + x);
                tot = Integer.parseInt(txt2.getText().toString()) + x;
                txt2.setText("" + tot);
                break;

            case R.id.btn5:
                cont++;
                Log.i(String.valueOf(x), "num");

                btn5.setEnabled(false);
                txt1.setText("" + x);
                tot = Integer.parseInt(txt2.getText().toString()) + x;
                txt2.setText("" + tot);
                break;

            case R.id.restart:
                cont = 0;
                tot = 0;
                txt1.setText("0");
                txt2.setText("0");
                txt3.setText("A jugar!!!");
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                reset.setVisibility(view.INVISIBLE);
        }
        ganar(tot, cont);

    }

    private void ganar(int tot, int i) {
        if (tot > 21) {
            txt3.setText("perdiste!! :(");
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            reset.setVisibility(View.VISIBLE);
        } else if (tot <= 21 && i == 5) {
            txt3.setText("Ganador!!");
            reset.setVisibility(View.VISIBLE);
        }
    }
}
