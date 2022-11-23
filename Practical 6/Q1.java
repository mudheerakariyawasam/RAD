import java.util.*;

class Q1{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=scan.nextLine();

        int count=0;

        for (int i=0 ; i<word.length(); i++){
         char ch = word.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){
            count ++;
         }
        }
        System.out.println("Number of vowels in the given word is "+count);
    }
}