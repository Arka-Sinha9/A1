import java.util.*;
class CircleDemo{
  static double radius;
  static double area;
  static double perimeter;
  public static void getRadius(){
    Scanner xx = new Scanner(System.in);
    System.out.print("Enter radius: ");
    radius = xx.nextDouble();
  }
  public static double findArea(double rad){
    return(area = 3.14*rad*rad);
  }
  public static double findPerimeter(double rad){
    return(perimeter = 2*3.14*rad);
  }
  public static void display(){
    System.out.println("Entered radius is: "+radius);
    System.out.println("Area is: "+area);
    System.out.println("Perimeter is: "+perimeter);
  }
  public static void main(String[] args){
    getRadius();
    findArea(radius);
    findPerimeter(radius);
    display();
  }
}
