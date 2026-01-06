package classes;

public class ca {
    String name;
    String colour;
    int age;
    String breed;
    public ca(String name,String colour,int age,String breed) {
        this.name=name;
        this.colour=colour;
        this.age=age;
        this.breed=breed;

    }
    public static void main(String[] args) {
        ca puccy=new ca("puccy","orange",4,"orange");
        System.out.println(puccy);
        System.out.println(puccy.name);
        System.out.println(puccy.colour);
        System.out.println(puccy.age);
        System.out.println(puccy.breed);

    }
}
