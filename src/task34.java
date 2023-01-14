import java.util.Scanner;

public class task34 {
    public static void main(String[] args) {


        //3 num which one is bigger
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter 3 number");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1>num2) {
            if (num1>num3) {
                System.out.println("num is the greatest" + num1);
            }
        }
        if (num2>num1) {
            if (num2>num3) {
                System.out.println("num is the greatest" + num2);
            }

        }
        if (num3>num1) {
            if (num3>num2) {
                System.out.println("num is the greatest" + num3);
            }

        }
    }
}