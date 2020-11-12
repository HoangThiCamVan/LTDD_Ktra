package com.example.kiemtra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listProduct;
    Context context;
    ArrayList<Model> data;
    CustomerAdapter customerAdapter;
    Model model;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        setContentView(R.layout.activity_main);





        listProduct=findViewById(R.id.listProduct);
        registerForContextMenu(listProduct);
        data=new ArrayList<>();

        populateData();
        customerAdapter=new CustomerAdapter(context,data);
        listProduct.setAdapter(customerAdapter);


    }

    private void populateData(){



        model=new Model();
        model.setId(1);
        model.setName("Cẩm Vân");

        model.setImage(R.drawable.avt);
        data.add(model);

        model=new Model();
        model.setId(1);
        model.setName("Thu Hoài");

        model.setImage(R.drawable.avt);
        data.add(model);

        model=new Model();
        model.setId(1);
        model.setName("Bích Liên");

        model.setImage(R.drawable.avt);
        data.add(model);

        model=new Model();
        model.setId(1);
        model.setName("Ngọc Mai");

        model.setImage(R.drawable.avt);
        data.add(model);


        model=new Model();
        model.setId(1);
        model.setName("Bích Liên");

        model.setImage(R.drawable.avt);
        data.add(model);

        model=new Model();
        model.setId(1);
        model.setName("Ngọc Mai");

        model.setImage(R.drawable.avt);
        data.add(model);


        model=new Model();
        model.setId(1);
        model.setName("Bích Liên");

        model.setImage(R.drawable.avt);
        data.add(model);

        model=new Model();
        model.setId(1);
        model.setName("Ngọc Mai");

        model.setImage(R.drawable.avt);
        data.add(model);
    }


}