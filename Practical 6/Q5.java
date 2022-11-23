import java.util.*;

class Q5{
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
    
        int [] marks=new int[3];
        int tot=0;

        for (int i=0;i<3;i++){
            System.out.print("Enter Marks: ");
            marks[i]=scan.nextInt(); 
            tot+=marks[i];
        }

        System.out.print("Marks are ");
        for (int i=0;i<3;i++){
            System.out.print(marks[i]+",");
        }
        System.out.println("\b ");

        System.out.println("Total is "+tot);
        
    }
}