import java.util.Scanner;
class Shapes
{
void area(int r)
{
System.out.println("Area of circle is " + (3.14*r*r));
}
void area(int l, int b)
{

System.out.println("Area of Rectangle is " + (l*b));
}
void area(double s)
{
System.out.println("Area of square " + (s*s));
}}
class methodover
{
public static void main(String args[])
{
Shapes a =new Shapes();

Scanner sc= new Scanner(System.in);
System.out.println("Enter the area of circle");
int p =sc.nextInt();
System.out.println("Enter the length and breadth of the rectangle");
int q =sc.nextInt();
int r=sc.nextInt();
System.out.println("Enter the side of square");
double s=sc.nextDouble();
a.area(s);
a.area(p);
a.area(q,r);
}
}

