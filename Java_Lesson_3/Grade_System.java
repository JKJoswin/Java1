package Java_Lesson_3;
import java.util.*;
public class Grade_System {
    public static void main(String[] args) {
        float sum = 0;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of subjects:");
        int ns = sc.nextInt();

        int[] marks = new int[ns];

        System.out.println("Enter the marks as "+ns+" subjects press enter to give marks");
        for(int i=0;i<ns;i++){
            marks[i]=sc.nextInt();
            sum=marks[i]+sum;
        }
        float per = sum/(ns*100)*100;
        System.out.println(per);
        if(per>=95){
            result="O";
        }else if(per>=90){
            result="A+";
        }else if(per>=80){
            result="A";
        }else if(per>=70){
            result="B";
        }else if(per>=60){
            result="C";
        }else if(per>=50){
            result="D";
        }else if(per>=40){
            result="E";
        }else{
            result="Fail";
        }
        System.out.println(result);
    }
}
