import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*System.out.println("please enter your age");
        int age=scan.nextInt();
        System.out.println("you are "+age+" years old");
        System.out.println("please enter your weight");
        double weight=scan.nextDouble();
        System.out.println("your weight is "+weight+" kgs");
        System.out.println("are u hungry?");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);

        System.out.println("please enter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("your gender is "+gender);*/

        System.out.println("please enter your name");
        String name=scan.next();
        System.out.println("your name is "+name);
        System.out.println("please enter your full name");
        String FullName=scan.nextLine();
        System.out.println("your full name is "+FullName);
        scan.close();



    }
}
