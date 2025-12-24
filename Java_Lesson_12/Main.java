package Java_Lesson_12;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double[] acc_bal = new double[100];
        String[] acc_name = new String[100];
        int[] acc_no = new int[100];
        Scanner sc = new Scanner(System.in);
        Boolean flag = true;
        int choice;
        int size = 0;
        int acn = 100;
        int no;

        while (true) { 
            System.out.println("1.Add Customer \n2.Change Customer Name \n3.Check Balance \n4.Update Balance \n5.Check Details \n6.Exit");
            choice = sc.nextInt();
            if (choice == 1){
                String n;
                System.out.println("Enter Customer Name:");
                n = sc.next();
                acc_name[size] = n;
                System.out.println("Enter the Opening Balance:");
                Double bal = sc.nextDouble();
                acc_bal[size] = bal;
                acc_no[size] = acn;
                System.out.println("Account Created Successfully!");
                System.out.println("Account Details:");
                System.out.println("Account no.:" + acc_no[size]);
                System.out.println("Account Holder Name:" + acc_name[size]);
                System.out.println("Account Balance:" + acc_bal[size]);
                size = size + 1;
                acn = acn + 1;
            } else if (choice == 2){
                System.out.println("Enter the Account no.:");
                no = sc.nextInt();
                for(int i = 0; i <= size + 1; i++){
                    if (no == acc_no[i]){
                        System.out.println("Enter the New Name:");
                        String myname;
                        myname = sc.next();
                        acc_name[i] = myname;
                        System.out.println("Name Updated Successfully!");
                        System.out.println("Account Details:");
                        System.out.println("Account no.:" + acc_no[i]);
                        System.out.println("Account Holder Name:" + acc_name[i]);
                        System.out.println("Account Balance:" + acc_bal[i]);
                        flag = false;
                        break;
                    }
                }
                    if (flag == true){
                        System.out.println("Account does not exist!");
                    }
                
            } else if (choice == 3){
                System.out.println("Enter the Account no.:");
                no = sc.nextInt();
                for(int i = 0; i <= size + 1; i++){
                    if (no == acc_no[i]){
                        System.out.println("Account Details:");
                        System.out.println("Account no.:" + acc_no[i]);
                        System.out.println("Account Holder Name:" + acc_name[i]);
                        System.out.println("Account Balance:" + acc_bal[i]);
                        flag = false;
                        break;
                    }
                }
                    if (flag == true){
                        System.out.println("Account does not exist!");
                    }
            } else if (choice == 4){
                System.out.println("Enter the Account no.:");
                no = sc.nextInt();
                for(int i = 0; i <= size + 1; i++){
                    if (no == acc_no[i]){
                        System.out.println("Enter the Amount to be deposited:");
                        Double dep;
                        dep = sc.nextDouble();
                        acc_bal[i] = acc_bal[i] + dep;
                        System.out.println("Account Details:");
                        System.out.println("Account no.:" + acc_no[i]);
                        System.out.println("Account Holder Name:" + acc_name[i]);
                        System.out.println("Account Balance:" + acc_bal[i]);
                        flag = false;
                        break;
                    }
                }
                    if (flag == true){
                        System.out.println("Account does not exist!");
                    }
            } else if (choice == 5){
                for(int i = 0; i < size + 1; i++){
                        System.out.println("Account Details:");
                        System.out.println("Account no.:" + acc_no[i]);
                        System.out.println("Account Holder Name:" + acc_name[i]);
                        System.out.println("Account Balance:" + acc_bal[i]);
                } 
            } else {
                break;
            }
        }
    }
}