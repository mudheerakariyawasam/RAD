import java.util.*;

class Question4 {
    public static void main (String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your mark :");
        int marks=input.nextInt();
        
        char grade;
        grade = (marks<50)? 'F' : (marks<75)? 'B' :'A';
        System.out.println("Grade : "+grade);
    }
}
