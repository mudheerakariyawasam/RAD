import java.util.*;


class rocket{
    public static void main (String args[]){
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the total Mass:");
        long mass=input.nextLong();

        System.out.println("Enter the total thrust:");
        long thrust=input.nextLong();

        double weight=mass*9.8;
        double force=thrust-weight;

        double accelaration= force/mass;

        System.out.println("Accelaration is "+accelaration+" ms^(-2)");
    }
}