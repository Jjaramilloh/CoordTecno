package com.example.coordtecno83;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    private EditText _campo_1;
    private EditText _campo_2;
    private EditText _campo_3;
    private EditText _campo_4;
    private EditText _campo_5;
    private EditText _campo_6;
    private EditText _campo_7;
    private EditText _campo_8;
    private EditText _campo_9;
    private EditText _campo_10;
    private EditText _campo_11;
    private EditText _campo_12;
    private EditText _campo_13;
    private EditText _campo_14;
    private EditText _campo_15;

    private Button _btn_link;
    private Button _btn_limpiar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _campo_1 = (EditText) findViewById(R.id.campo_1);
        _campo_2 = (EditText) findViewById(R.id.campo_2);
        _campo_3 = (EditText) findViewById(R.id.campo_3);
        _campo_4 = (EditText) findViewById(R.id.campo_4);
        _campo_5 = (EditText) findViewById(R.id.campo_5);
        _campo_6 = (EditText) findViewById(R.id.campo_6);
        _campo_7 = (EditText) findViewById(R.id.campo_7);
        _campo_8 = (EditText) findViewById(R.id.campo_8);
        _campo_9 = (EditText) findViewById(R.id.campo_9);
        _campo_10 = (EditText) findViewById(R.id.campo_10);
        _campo_11 = (EditText) findViewById(R.id.campo_11);
        _campo_12 = (EditText) findViewById(R.id.campo_12);
        _campo_13 = (EditText) findViewById(R.id.campo_13);
        _campo_14 = (EditText) findViewById(R.id.campo_14);
        _campo_15 = (EditText) findViewById(R.id.campo_15);

        _btn_link = findViewById(R.id.btn_link);
        _btn_limpiar = findViewById(R.id.btn_limpiar);

        _btn_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String del=",%20";
                String campo_1="";
                String campo_2="";
                String campo_3="";
                String campo_4="";
                String campo_5="";
                String campo_6="";
                String campo_7="";
                String campo_8="";
                String campo_9="";
                String campo_10="";
                String campo_11="";
                String campo_12="";
                String campo_13="";
                String campo_14="";
                String campo_15="";

                campo_1 =_campo_1.getText().toString();
                campo_2 =_campo_2.getText().toString();
                campo_3 =_campo_3.getText().toString();
                campo_4 =_campo_4.getText().toString();
                campo_5 =_campo_5.getText().toString();
                campo_6 =_campo_6.getText().toString();
                campo_7 =_campo_7.getText().toString();
                campo_8 =_campo_8.getText().toString();
                campo_9 =_campo_9.getText().toString();
                campo_10 =_campo_10.getText().toString();
                campo_11 =_campo_11.getText().toString();
                campo_12 =_campo_12.getText().toString();
                campo_13 =_campo_13.getText().toString();
                campo_14 =_campo_14.getText().toString();
                campo_15 =_campo_15.getText().toString();

                String url ="http://192.168.1.29/OnLineImprHtml/Guia6.aspx?guias="+
                        campo_1+del+
                        campo_2+del+
                        campo_3+del+
                        campo_4+del+
                        campo_5+del+
                        campo_6+del+
                        campo_7+del+
                        campo_8+del+
                        campo_9+del+
                        campo_10+del+
                        campo_11+del+
                        campo_12+del+
                        campo_13+del+
                        campo_14+del+
                        campo_15
                ;
                Uri link = Uri.parse(url);
                Intent i = new Intent(Intent.ACTION_VIEW,link);
                startActivity(i);
                //Log.d("Click","OK");
            }
        });

        _btn_limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _campo_1.setText("");
                _campo_2.setText("");
                _campo_3.setText("");
                _campo_4.setText("");
                _campo_5.setText("");
                _campo_6.setText("");
                _campo_7.setText("");
                _campo_8.setText("");
                _campo_9.setText("");
                _campo_10.setText("");
                _campo_11.setText("");
                _campo_12.setText("");
                _campo_13.setText("");
                _campo_14.setText("");
                _campo_15.setText("");


            }
        });

    }
}