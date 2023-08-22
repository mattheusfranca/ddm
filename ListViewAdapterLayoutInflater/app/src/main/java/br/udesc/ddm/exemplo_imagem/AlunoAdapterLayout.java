package br.udesc.ddm.exemplo_imagem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AlunoAdapterLayout extends BaseAdapter {

    private Context context;
    private List<Aluno> alunos;

    public AlunoAdapterLayout(Context context, List<Aluno> alunos) {
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
        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.aluno_item, parent,false);
        Aluno aluno = alunos.get(position);

        ImageView imgAluno = item.findViewById(R.id.imgAluno);
        imgAluno.setImageResource(R.drawable.imgaluno_foreground);
        TextView txtCodigo = item.findViewById(R.id.txtCodigo);
        TextView txtNome = item.findViewById(R.id.txtNome);
        TextView txtEmail = item.findViewById(R.id.txtNome);

        txtCodigo.setText(String.valueOf(aluno.getCodigo()));
        txtNome.setText(aluno.getNome());
        txtEmail.setText(aluno.getEmail());

        return item;
    }
}