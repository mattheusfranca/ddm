package br.udesc.ddm.exemplo_imagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        ListView listAlunos = findViewById(R.id.listAlunos);


        //Criar lista de dados
        List<String> alunos = new ArrayList<>();
        alunos.add("Rafael");
        alunos.add("Davi");
        alunos.add("Gabriel");
        alunos.add("Max");
        alunos.add("Alison");
        alunos.add("Pedro");
        alunos.add("João Marcus");
        alunos.add("João Eduardo");
        alunos.add("Matheus");
        alunos.add("Igor");
        alunos.add("Diogo");
        alunos.add("Mauricio");
        alunos.add("Erick");
        alunos.add("Felipe");

        List<Aluno> alunos2 = getAlunos();
        ArrayAdapter<Aluno> adaptador = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                alunos2);

        //Adicionar adaptador ao listview
        //listAlunos.setAdapter(adaptador);
        //listAlunos.setAdapter(new SimpleAlunoAdapter(context));
        //listAlunos.setAdapter(new AlunoAdapter(context, alunos2));
        listAlunos.setAdapter(new AlunoAdapterLayout(context, alunos2));

        listAlunos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(context, "clique na posição" + position, Toast.LENGTH_SHORT).show();
                Aluno aluno = (Aluno) parent.getItemAtPosition(position);
                Toast.makeText(context, "código: " + aluno.getCodigo(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    public List<Aluno> getAlunos(){
        //Criar lista de dados
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Rafael"));
        alunos.add(new Aluno("Davi"));
        alunos.add(new Aluno("Gabriel"));
        alunos.add(new Aluno("Max"));
        alunos.add(new Aluno("Alison"));
        alunos.add(new Aluno("Pedro"));
        alunos.add(new Aluno("João Marcus"));
        alunos.add(new Aluno("João Eduardo"));
        alunos.add(new Aluno("Matheus"));
        alunos.add(new Aluno("Igor"));
        alunos.add(new Aluno("Diogo"));
        alunos.add(new Aluno("Mauricio"));
        alunos.add(new Aluno("Erick"));
        alunos.add(new Aluno("Felipe"));
        return alunos;
    }
}