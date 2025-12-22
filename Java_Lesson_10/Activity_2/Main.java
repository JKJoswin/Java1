package Java_Lesson_10.Activity_2;

import java.util.Scanner;
public class Main {
    public static Candidate getCandidateDetails() throws  InvalidInternException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Candidate Details!");

        System.out.println("Name:");
        String name = scanner.next();

        System.out.println("Gender:");
        String gender = scanner.next();

        System.out.println("Percentage:");
        int percentage = scanner.nextInt();

        if (percentage<50){
            throw new InvalidInternException("Registration Failed! Percentage cannot be less than 50%!");
        } else {
            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setPercentage(percentage);

            return candidate;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Intern Hiring Tool!");

        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successful!");
        } catch (InvalidInternException e) {
            System.out.println(e.getMessage());
        }
    }
}
