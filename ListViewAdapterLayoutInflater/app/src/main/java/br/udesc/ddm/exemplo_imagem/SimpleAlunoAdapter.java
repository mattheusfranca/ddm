package br.udesc.ddm.exemplo_imagem;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SimpleAlunoAdapter extends BaseAdapter {

    private Context context;
    public SimpleAlunoAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Override
    public Object getItem(int position) {
        return "Aluno " + position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView texto = new TextView(context);
        texto.setText("Aluno " + position);
        return texto;
    }
}
