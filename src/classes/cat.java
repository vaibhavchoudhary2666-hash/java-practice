package classes;

import Interface.animal;

public class cat implements animal {
    String name;
    String colour;
    int age;
    String breed;
    public cat(String name,String colour,int age,String breed) {
        this.name=name;
        this.colour=colour;
        this.age=age;
        this.breed=breed;

    }
    public String getname() { return name;}
    public String getcolour() { return colour;}
    public int getage() {return age;}
    public String getbreed() {return breed;}

    @Override
    public String toString() {
        return "Name is :" + name +"\ncolour age and breed are :" + colour +" " + age +" " + breed;
    }

    public static void main(String[] args) {
        cat puccy=new cat("Puccy","orange",4,"Prussian");
        System.out.println(puccy);
        puccy.sleep();
        puccy.dead();
        puccy.sound();
    }

    @Override
    public void sleep() {
        System.out.println("cat is sleeping");
    }

    @Override
    public void eat() {
        System.out.println(" cat is eating😸😸");

    }

    @Override
    public void dead() {
        animal.super.dead();
    }

    @Override
    public void sound() {
        System.out.println("meawwwww");

    }
}
