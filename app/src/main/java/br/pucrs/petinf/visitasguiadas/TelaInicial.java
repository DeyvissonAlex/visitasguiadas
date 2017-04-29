package br.pucrs.petinf.visitasguiadas;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInicial extends AppCompatActivity {

    private AlertDialog alerta;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    //private GoogleApiClient client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);

        Button botao = (Button) findViewById(R.id.botaoInicial);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                                AlertDialog.Builder testeAluno = new AlertDialog.Builder(TelaInicial.this);
                testeAluno.setMessage("Você é aluno da PUCRS?")
                        .setCancelable(false)
                        .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //MainActivity.this.finish();
                                Intent it = new Intent(TelaInicial.this, LoginAluno.class);
                                startActivity(it);
                            }
                        })
                        .setNegativeButton("Não", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //dialog.cancel();
                                Intent it = new Intent(TelaInicial.this, LoginVisitante.class);
                                startActivity(it);
                            }
                        });
                AlertDialog alert = testeAluno.create();
                alert.show();
            }
        });
    }

    public void img_click(View v) {
        Uri u;
        switch (v.getId()) {
            case R.id.pet:
                u = Uri.parse("http://www.inf.pucrs.br/petinf");
                break;
            case R.id.facin:
                u = Uri.parse("http://www.pucrs.br/facin");
                break;
            case R.id.puc:
                u = Uri.parse("http://pucrs.br");
                break;
            default:
                u = Uri.parse("http://google.com");
        }
        startActivity(new Intent(Intent.ACTION_VIEW, u));
    }
}