package Java_Lesson_7.Activity_1;

class student{
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

class Main{
    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("Joswin Jayakumar");
        System.out.println(s1.getName());
    }
}