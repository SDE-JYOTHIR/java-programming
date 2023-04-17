import java.util.Scanner;

class Totalmark 
{
public static void main(String[] args) 
{
int total=0,percentage,numSubjects;
        
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of subjects: ");
numSubjects = input.nextInt();
int[] marks = new int[numSubjects];

System.out.print("Enter the mark for subject : ");
for (int i = 0; i < numSubjects; i++) 
{
marks[i] = input.nextInt();


if(marks[i]>100)
{
System.out.println("Enter the mark less than 100!");
}
else
{
 total=total+marks[i];
}

}
percentage=total/numSubjects;

System.out.println("Total marks obtained: " +total);
System.out.println("Percentage="  +percentage);
}
}
