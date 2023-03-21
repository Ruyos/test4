package test1;

public class Student extends Person {
    int id;

    public Student(String name, int age, char gender) {
        super(name, age, gender);
    }
    public String show(){
        return super.show()+" ID: "+id;
    }
    public static void main(String[] args) {
        Student s=new Student("John",20,'M');
        s.id=123;
        System.out.println(s.show());
    }
}
