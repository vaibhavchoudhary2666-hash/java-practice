package classes;

public class cat {
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
    public static void main(String[] args) {
        cat puccy=new cat("puccy","orange",4,"orange");
        System.out.println(puccy);
        System.out.println(puccy.name);
        System.out.println(puccy.colour);
        System.out.println(puccy.age);
        System.out.println(puccy.breed);

    }
}
