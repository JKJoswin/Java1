package Java_Lesson_5.file2;

class animal {
    void eating() {
        System.out.println("Eating");
    }
}

class lion extends animal{
    void roar() {
        System.out.println("Roaring");
    }
}

class cub extends lion{
    void weeping() {
        System.out.println("Weeping");
    }
}

class Main {
    public static void main(String[] args) {
        cub s = new cub();
        s.weeping();
        s.roar();
        s.eating();
    }
}