import java.util.*;

class Q4{
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1=scan.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2=scan.nextInt();

        if(num1==num2){
            System.out.println("Numbers are equal");
        }else{
            System.out.println("Numbers are not equal");
        }
    }
}