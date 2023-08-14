package com.example.ciclovidaandroid;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class AcaoBtn1 implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        apresentarMsg(v.getContext(), "Clique no Btn1");
//        Toast.makeText(v.getContext(), "Clique no Btn1", Toast.LENGTH_SHORT).show();
    }

    public void apresentarMsg(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
