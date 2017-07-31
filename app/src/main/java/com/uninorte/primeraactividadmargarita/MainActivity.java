package com.uninorte.primeraactividadmargarita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Nota1;
    EditText Nota2;
    EditText Nota3;
    EditText Nota4;
    TextView Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nota1 = (EditText) findViewById(R.id.Nota1);
        Nota2 = (EditText) findViewById(R.id.Nota2);
        Nota3 = (EditText) findViewById(R.id.Nota3);
        Nota4 = (EditText) findViewById(R.id.Nota4);
        Total = (TextView) findViewById(R.id.Total);
    }

    public void OnclickBotonAceptar(View view) {
        float N1=0;
        float N2=0;
        float N3 =0;
        float N4 =0;
        double Res = 0;
        if(!TextUtils.isEmpty(Nota1.getText().toString())){
            N1 = Float.parseFloat(Nota1.getText().toString());
            Res = Res + N1*0.25;
        }
        if(!TextUtils.isEmpty(Nota2.getText().toString())){
            N2 = Float.parseFloat(Nota2.getText().toString());
            Res = Res + N2*0.25;
        }
        if(!TextUtils.isEmpty(Nota3.getText().toString())){
            N3 = Float.parseFloat(Nota3.getText().toString());
            Res = Res + N3*0.25;
        }
        if(!TextUtils.isEmpty(Nota4.getText().toString())){
            N4 = Float.parseFloat(Nota4.getText().toString());
            Res = Res + N4*0.25;
        }
        int c=0;
        if(N1==0){
            c=c+1;
        }
        if(N2==0){
            c=c+1;
        }
        if(N3==0){
            c=c+1;
        }
        if(N4==0){
            c=c+1;
        }
        double Resultado=0;
        if(c!=0){
            double Total1=3.8;
            if(c==1){
                Resultado= (3.8 - Res )/0.25;
                if(N1==0){
                    Nota1.setText(Resultado+"");
                }
                if (N2==0){
                    Nota2.setText(Resultado+"");
                }
                if (N3 ==0){
                    Nota3.setText(Resultado+"");
                }
                if (N4 ==0){
                    Nota4.setText(Resultado+"");
                }
                Res= Resultado*0.25 + Res;
            } else if (c == 2) {
                Resultado= (3.8 - Res )/0.5;
                if(N1==0){
                    Nota1.setText(Resultado+"");
                }
                if(N2==0){
                    Nota2.setText(Resultado+"");
                }
                if (N3 ==0){
                    Nota3.setText(Resultado+"");
                }
                if (N4 ==0){
                    Nota4.setText(Resultado+"");
                }
                Res= Resultado*0.5 + Res;
            } else if (c == 3){
                Resultado= (3.8 - Res )/0.75;
                if(N1==0){
                    Nota1.setText(Resultado+"");
                }
                if(N2==0){
                    Nota2.setText(Resultado+"");
                }
                if(N3 ==0){
                    Nota3.setText(Resultado+"");
                }
                if(N4 ==0){
                    Nota4.setText(Resultado+"");
                }
                Res= Resultado*0.75 + Res;
            } else if (c == 4){
                if(N1==0){
                    Nota1.setText(3.8+"");
                }
                if(N2==0){
                    Nota2.setText(3.8+"");
                }
                if(N3 ==0){
                    Nota3.setText(3.8+"");
                }
                if(N4 ==0){
                    Nota4.setText(3.8+"");
                }
                Res=3.8;
            }

            Total.setText(Res+"");

        } else {
            Total.setText(Res+"");
        }




    }
}
