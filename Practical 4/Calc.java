import java.util.*;

class Calc{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first number (A)");
        int a=input.nextInt();

        System.out.println("Enter your second number (B)");
        int b=input.nextInt();

        int add=a+b;
        int sub=a-b;
        int mult=a*b;
        double div= (double)a/b;

        System.out.println("A+B = "+add);
        System.out.println("A-B = "+sub);
        System.out.println("A*B = "+mult);
        System.out.println("A/B = "+div);
    }
}