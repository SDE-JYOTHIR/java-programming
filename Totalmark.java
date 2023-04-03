 import java.util.Scanner;

 class Totalmark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = input.nextInt();

        
        int[] marks = new int[numSubjects];

        
       for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the mark for subject " + (i+1) + ": ");
            marks[i] = input.nextInt();
        }

     
        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++) {
            totalMarks += marks[i];
        }

        
        System.out.println("Total marks obtained: " + totalMarks);
    }
}
