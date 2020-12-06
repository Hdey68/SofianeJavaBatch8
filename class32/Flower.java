package com.syntax.class32;

public abstract class Flower {
    String name;
    String color;
    Flower(String name, String color){
        this.name = name;
        this.color=color;
    }

    public abstract void bloom();
}

class Rose extends Flower{

    Rose(String type,String color){
        super(type,color);
    }
    @Override
    public void bloom(){
        System.out.println(name +"Blooms in the March");
    }
}

class Tulip extends Flower{

    Tulip(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(name +"Blooms in the April");
    }
}

class SunFlower extends Flower{

    SunFlower(String type, String color) {
        super(type, color);
    }

    @Override
    public void bloom() {
        System.out.println(name +"Bloom in the August");
    }
}

