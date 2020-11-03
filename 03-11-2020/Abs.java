import java.util.*;

abstract class Shape{
	double dim1,dim2;
	abstract double printArea();
}

class Rectangle extends Shape{
	Rectangle(double a, double b){
		dim1 = a;
		dim2 = b;
	}
	double printArea(){
		System.out.println("Inside the Rectangle");
		return dim1*dim2;
	}
}

class Triangle extends Shape{
	Triangle(double a, double b){
		dim1 = a;
		dim2 = b;
	}
	double printArea(){
		System.out.println("Inside the Triangle");
		return dim1*dim2/2;
	}
}

class Circle extends Shape{
	Circle(double a){
        dim1 = a;
	}
	double printArea(){
		System.out.println("Inside the Circle");
		return 3.14*dim1*dim1;
	}
}

class Abs{
	public static void main(String args[]){
    double rl,rb,th,tb,cr;
    Scanner ss = new Scanner(System.in);
    System.out.println("Enter length and breadth of rectangle: ");
    rl = ss.nextDouble();
    rb = ss.nextDouble();
    System.out.println("Enter height and base length of triangle: ");
    th = ss.nextDouble();
    tb = ss.nextDouble();
    System.out.println("Enter radius of circle: ");
    cr = ss.nextDouble();
		Rectangle r = new Rectangle(rl,rb);
		Triangle t = new Triangle(th,tb);
		Circle c = new Circle(cr);

		System.out.println("Area of Rectangle is:" +r.printArea());
		System.out.println("Area of Triangle is:" +t.printArea());
		System.out.println("Area of Circle is:" +c.printArea());
	}
}
