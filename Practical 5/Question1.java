import java.util.*;

class Question1 {
    public static void main (String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number of Inputs");
        int no_of_inputs=input.nextInt();

        int odd=0, even=0;
        //int even=0;
        for(int i=0;i<no_of_inputs;i++){
            System.out.println("Enter the Input Number "+(i+1));
            int num=input.nextInt();

            if (num%2==0){
                even++;
            }else if (num%2==1){
                odd++;
            }
        }

        System.out.println("Number of Even Numbers :"+(even));
        System.out.println("Number of Odd Numbers :"+(odd));
    }
}
