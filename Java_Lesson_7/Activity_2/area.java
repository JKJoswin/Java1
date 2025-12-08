package Java_Lesson_7.Activity_2;

class Shape{
    public double getArea(){
        return 0;
    }
}

class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return 0.5 * this.base * this.height;
    }
}

class Square extends Shape{
    private double side;
    public Square(double side){
        this.side = side;
    }

    public double getArea(){
        return this.side * this.side;
    }
}

class Main{
    public static void main(String[] args) {
        Shape[] s1 = new Shape[2];
        s1[0] = new Triangle(10,10);
        s1[1] = new Square(5);

        for(int i = 0; i < 2; i++){
            System.out.println("The area is "+ s1[i].getArea());
        }

        System.out.println("The area of triangle is " + s1[0].getArea());
        System.out.println("The area of square is " + s1[1].getArea());
    }
}