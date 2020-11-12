package com.example.kiemtra;

public class ModelChiTiet {
    int id;
    String name,mota;
    public ModelChiTiet() {

    }

    public ModelChiTiet(int id, String name, String mota) {
        this.id = id;
        this.name = name;
        this.mota = mota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
