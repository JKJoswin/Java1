package Java_Lesson_6.Activity_4;

class Parent{
    protected void protect(){
        System.out.println("I am inside protected method!");
    }
}

class Child extends Parent{
    private void privateMethod(){
        System.out.println("I am inside private method!");
    }
}

class Main{
    public static void main(String[] args) {
        Child kid = new Child();
        //kid.privateMethod();

        System.out.println("Hello World!");
    }
}