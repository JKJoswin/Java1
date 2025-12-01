package Java_Lesson_5.file3;

class mammal {
    void mam() {
        System.out.println("Inside mammal class!");
    }
}

class lion extends mammal{
    void roar() {
        System.out.println("Inside lion class!");
    }
}

class human extends mammal{
    void hum() {
        System.out.println("Inside human class!");
    }
}

class Main {
    public static void main(String[] args) {
        human obj = new human();
        lion obj1 = new lion();
        obj.hum();
        obj.mam();
        obj1.roar();
        obj1.mam();
    }
}