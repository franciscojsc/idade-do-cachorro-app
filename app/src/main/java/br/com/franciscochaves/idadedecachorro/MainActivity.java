package br.com.franciscochaves.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mTextoIdade;
    private Button mButtonIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextoIdade = findViewById(R.id.edit_idade);
        mButtonIdade = findViewById(R.id.button_descobrir_idade);

        mButtonIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textoDigitado = mTextoIdade.getText().toString();

                if( textoDigitado.trim().isEmpty()){

                    Toast.makeText(getApplicationContext(),"Digite valor válido", Toast.LENGTH_LONG).show();


                }else{

                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int valorResultadoFinal = valorDigitado * 7;

                    Toast.makeText(getApplicationContext(),"A idade do cachorro em anos humanos é: " + valorResultadoFinal + " anos.", Toast.LENGTH_LONG).show();

                }

            }
        });

    }
}