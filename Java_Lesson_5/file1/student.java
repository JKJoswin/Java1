class student {
    int age;
    String name;

    void naming(String name) {
        System.out.println("Name:" + name);
    }
}

class Child extends student{
    void ageN(int age) {
        System.out.println("Age:" + age);
    }
}

class Main {
    public static void main(String[] args) {
        Child s = new Child();
        s.naming("Aashish");
        s.ageN(13);
    }
}