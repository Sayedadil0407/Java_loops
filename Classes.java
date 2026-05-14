class Student {

    String name;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Classes{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Adil";
        s1.age = 22;
        s1.display();

    }
}