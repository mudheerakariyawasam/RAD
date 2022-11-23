import java.util.*;

class Q3{
    public static void main (String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter any word: ");
    String word = scan.nextLine();

    System.out.println(word);

    String str=word;

    System.out.println("Press Enter to Exit");

    while(!word.isEmpty()){
        System.out.println("Enter any word: ");
        word=scan.nextLine();

        if(word.isEmpty()){
            break;
        }

        str=str+", "+word;
        System.out.println(str);
    }

    System.out.println(str);
    }
}