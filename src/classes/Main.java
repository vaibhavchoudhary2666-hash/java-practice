package classes;

class students {
    String name;
    int age;
    int year;

    public students(String name,int age,int year){
        this.name=name;
        this.age=age;
        this.year=year;
    }
    students (students s1) {
        this.name=null;
        this.age=s1.age;
        this.year= s1.year;


    }
    @Override
    public String toString() {
        return "name:" + name +"\nage and year:" + age+"&"+ year;}

}
public class Main{
    public  static void main(String[] args) {
        students s1=new students("vaibhav",20,1);
        students s2= new  students(s1);
        System.out.println(s1);
        System.out.println(s2);
    }
}