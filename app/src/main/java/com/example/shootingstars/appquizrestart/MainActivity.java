package com.example.shootingstars.appquizrestart;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Spinner resposta1,resposta2,resposta3,resposta4,resposta5;
    private TextView acerto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resposta1 = findViewById(R.id.resposta);
        resposta2 = findViewById(R.id.resposta2);
        resposta3 = findViewById(R.id.resposta3);
        resposta4 = findViewById(R.id.resposta4);
        resposta5 = findViewById(R.id.resposta5);
        acerto = findViewById(R.id.textAcerto);
    }

    public  void cliqueAcertos(View view) {

        if (view == findViewById(R.id.button)) {

            String resposta_cidade = resposta1.getSelectedItem().toString();
            String resposta_ano = resposta2.getSelectedItem().toString();
            String resposta_copa = resposta3.getSelectedItem().toString();
            String resposta_raça = resposta4.getSelectedItem().toString();
            String resposta_buraco = resposta5.getSelectedItem().toString();

            int acerto_number = 0;
            int acerto_errado = 0;
            int acerto_certo = 1;

            if (resposta_cidade.equals("Curitiba")) {

                acerto_number = acerto_number + acerto_certo;
            } else {

                acerto_number = acerto_number + acerto_errado;
            }

            if (resposta_ano.equals("1945")) {

                acerto_number = acerto_number + acerto_certo;

            } else {

                acerto_number = acerto_number + acerto_errado;
            }

            if (resposta_copa.equals("França")) {

                acerto_number = acerto_number + acerto_certo;
            } else {

                acerto_number = acerto_number + acerto_errado;
            }

            if (resposta_raça.equals("Sayajin")) {

                acerto_number = acerto_number + acerto_certo;
            } else {

                acerto_number = acerto_number + acerto_errado;
            }

            if (resposta_buraco.equals("Sagittarius A")) {

                acerto_number = acerto_number + acerto_certo;
            } else {

                acerto_number = acerto_number + acerto_errado;

            }

            if (acerto_number == 0) {

                acerto.setText("Acertos " + acerto_number + "/5" + " Você não sabe nada");
            } else if (acerto_number <= 2) {
                acerto.setText("Acertos: " + acerto_number + "/5" + " Você está abaixo da media");
            } else if (acerto_number == 3) {
                acerto.setText("Acertos: " + acerto_number + "/5" + " Você está na media");

            } else if (acerto_number == 4) {

                acerto.setText("Acertos: " + acerto_number + "/5" + "Você foi bem");

            } else {

                acerto.setText("Acertos: " + acerto_number + "/5" + " PERFECT!! GOD JOB!!!");
            }


        }

    }

    public void restart(View view){

        if (view == findViewById(R.id.button2)){

            acerto.setText("Acertos: 0/5");
        }
    }
}
