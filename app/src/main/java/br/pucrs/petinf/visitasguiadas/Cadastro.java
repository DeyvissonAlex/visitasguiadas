package br.pucrs.petinf.visitasguiadas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Button botones = (Button) findViewById(R.id.naoalunobotao);
        botones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Cadastro.this, Nao_aluno_cadastro.class);
                startActivity(it);
            }
        });

        Button botao = (Button) findViewById(R.id.alunobotao);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Cadastro.this, Aluno_cadastro.class);
                startActivity(it);
            }
        });
    }

}

