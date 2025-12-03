package Java_Lesson_6.Activity_2;

class Parent{
    public void sayHello(){
        System.out.println("Hello from Parent!");
    }
}

class Child extends Parent{
    @Override
    public void sayHello(){
        System.out.println("Hello from Child!");
    }
}

public class Main{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.sayHello();

        Child c = new Child();
        c.sayHello();
    }
}