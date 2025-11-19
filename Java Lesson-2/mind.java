public class mind {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("**********Guess the answers**********");
        System.out.println("Uniary operator:"+(a++));
        System.out.println("Uniary operator:"+(++b));
        System.out.println("Binary operators:");
        System.out.println("1+2:"+1+2);
        System.out.println("1+2:"+(1+2));
        System.out.println((1+2)+"+=3");
        int increment = ++a * b++ ;
        System.out.println(increment);
        System.out.println("Ternary operator:");
        int largestnumber = a>b?a:b ;
        System.out.println("Largest number:"+largestnumber);

    }
}