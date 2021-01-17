import java.util.Scanner;
public class Areas{
void Area(double length,double breadth){
String area=String.format("%.3f", (length*breadth));
System.out.println("Area of Rectange Is "+area+"sq.units"); 
}
void Area(double radius){

double pi = 3.1415;
String area= String.format("%.3f", (pi*Math.pow(radius, 2)));
System.out.println("Area of Circle is "+area+"sq.units");
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double length,breadth,radius;
System.out.println("Enter  length and beadth of the rectangle :");
length = sc.nextDouble();
breadth=sc.nextDouble();
Areas rectangle = new Areas();
rectangle.Area(length, breadth);
System.out.println("Enter radius of the circle :");
radius =sc.nextDouble();
Areas circle = new Areas();
circle.Area(radius);
}
}

