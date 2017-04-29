package br.pucrs.petinf.visitasguiadas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    //private GoogleApiClient client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botao = (Button) findViewById(R.id.inicio);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(it);
            }
        });
    }

    public void img_click(View v) {
        Uri u;
        switch(v.getId()) {
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