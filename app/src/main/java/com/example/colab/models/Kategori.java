package com.example.colab.models;

public class Kategori {
    private int id_kategori;
    private String name;
    private String code;
    private String information;
    private String created_at;
    private String updated_at;


    public Kategori(int id_kategori, String name, String code, String information, String created_at, String updated_at) {
        this.id_kategori = id_kategori;
        this.name = name;
        this.code = code;
        this.information = information;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
