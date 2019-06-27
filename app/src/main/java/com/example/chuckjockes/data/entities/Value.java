package com.example.chuckjockes.data.entities;

import java.util.List;

public class Value
{
    private int id;

    private String joke;

    private List<String> categories;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setJoke(String joke){
        this.joke = joke;
    }
    public String getJoke(){
        return this.joke;
    }
    public void setCategories(List<String> categories){
        this.categories = categories;
    }
    public List<String> getCategories(){
        return this.categories;
    }
}
