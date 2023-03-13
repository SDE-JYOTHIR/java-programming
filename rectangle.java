class Rectangle
{
    
 double length;
double breadth;

void setData(double l,double b)
{
length=l;
breadth=b;
}
double getArea()
{ double rectArea;
rectArea=length*breadth;
return rectArea;
}
}

class rectangle{
public static void main(String[] args)
{
Rectangle rect= new Rectangle();
rect.setData(2.48,13);
double result=rect.getArea();
System.out.println("Area is"+result);
}
}
