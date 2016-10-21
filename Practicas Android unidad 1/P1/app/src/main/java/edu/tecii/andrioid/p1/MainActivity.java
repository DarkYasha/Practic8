package edu.tecii.andrioid.p1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText numero;
    TextView Resultado;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero=(EditText)findViewById(R.id.numero);
        Resultado=(TextView)findViewById(R.id.Imprimir_Resultado);
    }




    public void sumatoria (View view){
        String valor1=numero.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int suma = nro1* (nro1 + 1)/2;
        String resultado="";
        resultado ="la suma de los " + nro1 + "primeros numeros enteros es: " + suma;
        Resultado.setText(resultado);
    }
}
