package Java_Lesson_9.Activity_2;

interface vehicle {
    public void changeGear(int a);
    public void applyBrakes(int a);
    public void speedUp(int a);
}

class bicycle implements vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("Speed:"+speed);
        System.out.println("Gear:"+gear);
    }
}

class car implements vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("Speed:"+speed);
        System.out.println("Gear:"+gear);
    }
}

class Main{
    public static void main(String[] args) {
        bicycle obj1 = new bicycle();
        obj1.changeGear(4);
        obj1.speedUp(5);
        obj1.applyBrakes(2);
        
        car obj2 = new car();
        obj2.changeGear(6);
        obj2.speedUp(4);
        obj2.applyBrakes(2);

        obj1.printStates();
        obj2.printStates();
    }
}