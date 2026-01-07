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
        System.out.println(puccy.name);
        System.out.println(puccy.colour);
        System.out.println(puccy.age);
        System.out.println(puccy.breed);
        System.out.print(puccy.getname()+"\t");
        System.out.print(puccy.getage()+"\t");
        System.out.print(puccy.getbreed()+ "\t");
        System.out.print(puccy.getcolour()+"\t");

    }
}
