package Java_Lesson_6.Activity_3;

class Superclass {
    int number = 56;
}

class Subclass extends Superclass{
    int number = 96;

    void printNumber(){
        System.out.println(number);
        System.out.println(super.number);
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println("OUTPUT");
        Subclass sub = new Subclass();
        sub.printNumber();
    }
}