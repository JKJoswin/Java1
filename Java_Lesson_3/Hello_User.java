import java.util.*;
public class Hello_User {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your lucky number:");
        int lucky = sc.nextInt();
        System.out.println("Hello "+ name +"! Your lucky number is "+ lucky +". Your lucky number shows that you really work hard! Keep it up!");
        sc.close();
    }
}
