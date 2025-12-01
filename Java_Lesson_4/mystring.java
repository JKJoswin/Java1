package Java_Lesson_4;

public class mystring {
    public static void main(String[] args) {
        String f = "Cod";
    String s = "ingal";
    String cod = f + s;
    String codTrick = "Welcome"+" to "+"Codingal!";
    String codCapital = cod.toUpperCase();
    String codSmall = cod.toLowerCase();

    int len_cod = cod.length();
    int len_codTrick = codTrick.length();
    int sum = len_cod + len_codTrick;

    System.out.println(cod);
    System.out.println(codTrick);
    System.out.println(codCapital);
    System.out.println(codSmall);
    System.out.println(sum);
    } 
}
