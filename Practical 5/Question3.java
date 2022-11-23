import java.util.*;

class Question3 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number :");
        int num=input.nextInt();
        
        for(int i=1;i<=10;++i){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
