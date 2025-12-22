package Java_Lesson_11.Activity_1;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Jaguar");
        animals.add("Black Panther");
        System.out.println(animals);
        animals.clear();
        System.out.println(animals);
        System.out.println(animals.isEmpty());
        if (animals.isEmpty()){
            System.out.println("Array List is Empty");
        } else {
            System.out.println("Array is not Empty");
        }
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Jaguar");
        animals.add("Black Panther");
        System.out.println(animals.size());
        animals.add("Puma");
        animals.remove(2);
        System.out.println(animals);
    }
}
