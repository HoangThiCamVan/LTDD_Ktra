package com.example.kiemtra;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainChiTiet extends AppCompatActivity {
    private ListView listProduct;
    Context context;
    ArrayList<ModelChiTiet> data;
    CustomerAdapterChiTiet customerAdapter;
    ModelChiTiet model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        setContentView(R.layout.product_chitiet);





        listProduct=findViewById(R.id.listProduct);
        registerForContextMenu(listProduct);
        data=new ArrayList<>();

        populateData();
        customerAdapter= new CustomerAdapterChiTiet(context,data);
        listProduct.setAdapter(customerAdapter);


    }

    private void populateData(){



        model=new ModelChiTiet();
        model.setId(1);
        model.setName("Cẩm Vân");
        model.setMota("hôm qua");


        data.add(model);
        model=new ModelChiTiet();
        model.setId(1);
        model.setName("Cẩm Vân");
        model.setMota("hôm qua");


        data.add(model);
        model=new ModelChiTiet();
        model.setId(1);
        model.setName("Cẩm Vân");
        model.setMota("hôm qua");


        data.add(model);
        model=new ModelChiTiet();
        model.setId(1);
        model.setName("Cẩm Vân");
        model.setMota("hôm qua");


        data.add(model);
        model=new ModelChiTiet();
        model.setId(1);
        model.setName("Cẩm Vân");
        model.setMota("hôm qua");


        data.add(model);
        model=new ModelChiTiet();
        model.setId(1);
        model.setName("Cẩm Vân");
        model.setMota("hôm qua");


        data.add(model);


    }


}
