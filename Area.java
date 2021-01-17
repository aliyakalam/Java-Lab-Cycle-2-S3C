import java.util.Scanner;
class Area{
int length,breadth;
public Area(int l, int b){
length=l;
breadth=b;
}
public  int area()
{
  return length*breadth;
}
}
class rectangle{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the length: ");
  int l = sc.nextInt();
  System.out.println("Enter the breadth: ");
  int b = sc.nextInt();
  Area a = new Area(l,b);
  System.out.println("Area of rectangle: "+a.area());
}
}