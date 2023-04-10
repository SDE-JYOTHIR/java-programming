import java.util.Arrays;
import java.util.Scanner;

 class SortStringCharacters
 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        
        char[] charArray = inputString.toCharArray();

    
        Arrays.sort(charArray);

        
         
        System.out.println( new String(charArray));
    }
}
