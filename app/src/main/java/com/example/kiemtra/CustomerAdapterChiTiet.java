package com.example.kiemtra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomerAdapterChiTiet extends BaseAdapter {
    Context context;
    ArrayList<ModelChiTiet> Data1;
    LayoutInflater layoutInflater;
        ModelChiTiet model1;

    public CustomerAdapterChiTiet(Context context, ArrayList<ModelChiTiet> data) {
        this.context = context;
        this.Data1 = data;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return Data1.size();
    }

    @Override
    public Object getItem(int position) {
        return Data1.get(position);
    }

    @Override
    public long getItemId(int position) {
        return Data1.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View rowView = view;
        if(rowView==null){
            rowView=layoutInflater.inflate(R.layout.product,null,true);
        }


        TextView name = rowView.findViewById(R.id.name);
        TextView mota = rowView.findViewById(R.id.mota);


        model1=Data1.get(position);

        name.setText(model1.getName());
        mota.setText(model1.getName());



        return rowView;
    }
}
