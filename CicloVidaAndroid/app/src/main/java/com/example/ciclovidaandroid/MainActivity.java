package com.example.ciclovidaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String Tag = "TelaPrincipal";

    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        Log.i(Tag, "onCreate");

        Button btnEntrar = findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edLogin = findViewById(R.id.edLogin);
                EditText edSenha = findViewById(R.id.edSenha);

                String login = edLogin.getText().toString();
                String senha = edSenha.getText().toString();

                if(login.equals("ddm") && senha.equals("123")){
                    Intent intent = new Intent(v.getContext(), Tela2.class);
                    intent.putExtra("usuario", "ddm");
                    startActivity(intent);
                }
                else {
                    Toast.makeText(v.getContext(), "Dados incorretos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(Tag, "onStop");
        //metodo()
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(Tag, "onPause");
        //metodo()
    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.i(Tag, "onStart");
        //metodo()
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(Tag, "onResume");
        //metodo()
    }


}