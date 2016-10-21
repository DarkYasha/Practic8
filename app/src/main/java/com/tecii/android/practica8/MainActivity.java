package com.tecii.android.practica8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ainActivity extends AppCompatActivity {

    public EditText txtPies, txtMetros;
    public TextView txtPulga, txtYardas, txtMet, txtMillas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPies = (EditText)findViewById(R.id.txtPies);
        txtMetros = (EditText)findViewById(R.id.txtMetros);
        txtPulga = (TextView)findViewById(R.id.txtPulga);
        txtYardas = (TextView)findViewById(R.id.txtYardas);
        txtMet = (TextView)findViewById(R.id.txtMet);
        txtMillas = (TextView)findViewById(R.id.txtMillas);
    }

    public void convertir (View view){
        String num= txtPies.getText().toString();
        String num2=txtMetros.getText().toString();
        float pulgadas, yardas, Metros, Millas;
        float a = Float.parseFloat(num);
        float b = Float.parseFloat(num2);
        pulgadas = (float) ((a*12)+ (b/0.0254));
        yardas = (float) ((a/3)+ (b*1.09361));
        Metros = (float) ((a*0.3045)+ (b));
        Millas = (float) ((a*0.00019)+ (b/0.0254));
        String res = "Suma en pulgadas es" + pulgadas+"\n";
        String res2 = "Suma en yardas es" + yardas+"\n";
        String res3 = "Suma en metros es" + Metros+"\n";
        String res4 = "Suma en millas es" + Millas+"\n";
        txtPulga.setText(res);
        txtYardas.setText(res2);
        txtMet.setText(res3);
        txtMillas.setText(res4);
    }
}
