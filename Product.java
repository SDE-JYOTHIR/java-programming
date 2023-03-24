public class Product
{
int pcde;
String  pnme;
double prce;
Product(int pcode,String pname,double price)
{
pcde=pcode;
pnme=pname;
prce=price;
}
public static void main(String args[])
{
Product p1= new Product(101,"product1",55.2);
Product p2= new Product(102,"product1",10.3);
Product p3= new Product(103,"product1",25.9);
if(p1.prce <p2.prce && p1.prce < p3.prce)
{
System.out.println("Price of "+p1.pnme" lowest");
}
else if(p2.prce<p1.prce && p2.prce < p3.prce)
{
System.out.println("Price of "+p2.pnme"lowest");
}
else if(p3.prce>p2.prce && p3.prce<p1.prce)
{
System.out.println("Price of "+p3.pnme"  lowest");
}
}
}

