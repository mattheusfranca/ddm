package br.udesc.ddm.exemplo_imagem;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AlunoAdapter extends BaseAdapter {

    private Context context;
    private List<Aluno> alunos;

    public AlunoAdapter(Context context, List<Aluno> alunos){
        this.context = context;
        this.alunos = alunos;
    }

    @Override
    public int getCount() {
        return alunos.size();
    }

    @Override
    public Object getItem(int position) {
        return alunos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return alunos.get(position).getCodigo();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView texto = new TextView(context);
        Aluno aluno = alunos.get(position);
        texto.setText(aluno.getNome());
        return texto;
    }
}
