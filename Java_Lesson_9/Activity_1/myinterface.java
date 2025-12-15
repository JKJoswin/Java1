package Java_Lesson_9.Activity_1;

interface myinterface {
    public void method1();
    public void method2();
}

class Main implements myinterface{
    public void method1(){
        System.out.println("Implementation of method1!");
    }

    public void method2(){
        System.out.println("Implementation of method2!");
    }

    public static void main(String[] args) {
        myinterface obj1 = new Main();
        obj1.method1();
        obj1.method2();
    }
}