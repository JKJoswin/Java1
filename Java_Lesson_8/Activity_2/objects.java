package Java_Lesson_8.Activity_2;

abstract class Objects{
    abstract void showShape();
        public void Shape(){
            System.out.println("I am from the abstract class!");
        }
}

class Sphere extends Objects{
    void showShape(){
        System.out.println("I am sphere!");
    }
}

class Cube extends Objects{
    void showShape(){
        System.out.println("I am cube!");
    }
}

class Cylinder extends Objects{
    void showShape(){
        System.out.println("I am cylinder!");
    }
}

class Main{
    public static void main(String[] args){
        Objects obj = new Sphere();
        obj.showShape();
        Objects obj1 = new Cube();
        obj1.showShape();
        Objects obj2 = new Cylinder();
        obj2.showShape();
        obj.Shape();
    }
}