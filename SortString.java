import java.util.Scanner;
import java.util.Arrays;

 class SortString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the number of strings: ");
        int numStrings = input.nextInt();

        
        String[] arr = new String[numStrings];

       
        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string");
            arr[i] = input.next();
        }

        
        Arrays.sort(arr);

       
        System.out.println("Sorted strings:");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
