package Java_Lesson_11.Activity_2;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Lambda");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(32);
        numbers.add(47);
        numbers.add(56);
        numbers.add(49);
        numbers.forEach((x) -> {System.out.println(x);} );
        numbers.forEach(n -> {if (n==49){System.out.println("Found 49!");}} );
    }
}
