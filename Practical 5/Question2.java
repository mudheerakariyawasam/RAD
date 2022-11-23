import java.util.*;

class Question2 {
    public static void main (String args[]){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter your Number :");
        int num=input.nextInt();
        int typeA=0, typeB=0;
        
        if(num%25==0 && num%100!=0){
            typeA=1;
        }

        if(num%4==0 && num%128!=0){
            typeB=1;
        }

        if(typeA==1 && typeB==0){
            System.out.println("Type A");
        }else if(typeA==0 && typeB==1){
            System.out.println("Type B");
        }else if(typeA==1 && typeB==1){
            System.out.println("Type A and Type B");
        }else{
            System.out.println("Not (Type A and Type B)");
        }

    }
}
