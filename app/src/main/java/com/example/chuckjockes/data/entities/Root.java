package com.example.chuckjockes.data.entities;

public class Root
{
    private String type;

    private Value value;

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setValue(Value value){
        this.value = value;
    }
    public Value getValue(){
        return this.value;
    }
}
