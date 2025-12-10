package Java_Lesson_8.Activity_1;

class Hillstation{
    void location(){
        System.out.println("Location:");
    }
    void famousFor(){
        System.out.println("Famous for:");
    }
}

class Yercaud extends Hillstation{
    void location(){
        System.out.println("Yercaud is located near Salem, Tamil Nadu.");
    }

    void famousFor(){
        System.out.println("It is famous for its coffee plantation.");
    }
}

class Nilgiris extends Hillstation{
    void location(){
        System.out.println("Nilgiris is in Tamil Nadu.");
    }

    void famousFor(){
        System.out.println("It is famous for its tea & coffee plantations.");
    }
}

class Kodaikanal extends Hillstation{
    void location(){
        System.out.println("Kodaikanal is in Tamil Nadu.");
    }

    void famousFor(){
        System.out.println("It is famous for the Guna Caves.");
    }
}

class Main{
    public static void main(String[] args) {
        Hillstation h = new Hillstation();
        Hillstation y = new Yercaud();
        Hillstation n = new Nilgiris();
        Hillstation k = new Kodaikanal();
        
        h.location();
        y.location();
        h.famousFor();
        y.famousFor();
        System.out.println("");

        h.location();
        n.location();
        h.famousFor();
        n.famousFor();
        System.out.println("");

        h.location();
        k.location();
        h.famousFor();
        k.famousFor();
        System.out.println("");
    }
}