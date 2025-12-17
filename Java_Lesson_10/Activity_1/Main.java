package Java_Lesson_10.Activity_1;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x/y;
            System.out.println(x + "/" + y + "=" + z);
        } catch (ArithmeticException ex) {
            System.out.println(ex.toString());
        } finally {
            System.out.println("Application designed and developed by Joswin");
        }
        
    }
}