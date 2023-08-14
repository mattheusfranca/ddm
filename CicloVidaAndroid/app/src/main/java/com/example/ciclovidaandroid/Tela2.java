package com.example.ciclovidaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tela2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        String usuario = getIntent().getStringExtra("usuario");
        if(usuario != null)
            Toast.makeText(this, "Bem-vindo: " + usuario, Toast.LENGTH_SHORT).show();
        //Vinculando componentes
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);

        //Ação do btn7 está Definida no xml. Usando o método acaoBtn7(View v)


        btn1.setOnClickListener(new AcaoBtn1());
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Clique no Btn2", Toast.LENGTH_SHORT).show();
            }
        });

        btn3.setOnClickListener(v -> Toast.makeText(v.getContext(), "Clique no Btn3", Toast.LENGTH_SHORT).show());

        btn4.setOnClickListener(v -> Toast.makeText(this, "Clique no Btn4", Toast.LENGTH_SHORT).show());


        btn5.setOnClickListener(this);

        btn6.setOnClickListener(v -> realizarLogin());
    }

    public void realizarLogin(){
        //processo para realizar login
        Toast.makeText(this, "Clique no botão 6", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn1){
            Toast.makeText(this, "Clique no Btn1", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.btn5){
            Toast.makeText(this, "Clique no Btn5", Toast.LENGTH_SHORT).show();
        }

    }

    public void acaoBtn7(View v) {
        Toast.makeText(this, "Clique no Btn7", Toast.LENGTH_SHORT).show();
    }

}