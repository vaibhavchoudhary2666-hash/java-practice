package classes;

class Student{
    int id;
    String n;
    public Student(int id,String n) {
        this.id=id;
        this.n=n;
    }

}

public class day1 {
    public static void main(String[] args) {
        Student s1= new Student(20,"vaibhav");
        Student s2= new Student(21,"soske aizen");
        Student s3= new Student(19,"itachi");
        System.out.println(s1.n);
        System.out.println(s1.id);
        System.out.println(s2.n);
        System.out.println(s2.id);
        System.out.println(s3.n);
        System.out.println(s3.id);
    }
}
