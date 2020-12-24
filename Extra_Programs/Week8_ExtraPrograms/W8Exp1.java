import java.util.*;
abstract class Solid{
  double dim1, dim2;
  abstract double surfacearea();
  abstract double volume();
}
class Cylinder extends Solid{
  Cylinder(double h,double r){
    dim1 = h;
    dim2 = r;
  }
  double surfacearea(){
    return(2*3.14*dim2*dim1+2*3.14*dim2*dim2);
  }
  double volume(){
    return(3.14*dim2*dim2*dim1);
  }
}
class Cone extends Solid{
  Cone(double h,double r){
    dim1 = h;
    dim2 = r;
  }
  double surfacearea(){
    double l;
    l=dim1*dim1+dim2*dim2;
    return(3.14*dim2*Math.pow(l,1/2)+3.14*dim2*dim2);
  }
  double volume(){
    return(3.14*dim2*dim2*dim1/3);
  }
}
class Sphere extends Solid{
  Sphere(double r){
    dim1 = r;
  }
  double surfacearea(){
    return(4*3.14*dim1*dim1);
  }
  double volume(){
    return((4/3)*3.14*dim1*dim1*dim1);
  }
}
class W8Exp1{
  public static void main(String[] args){
    Scanner xx=new Scanner(System.in);
    double cyr,cyh,cor,coh,sr;
    int ch,a=1;
    while(a==1)
    {
      System.out.println("Choose from the list!!");
      System.out.println("1.Cylinder\n2.Cone\n3.Sphere\n4.Exit");
      ch=xx.nextInt();
      switch(ch)
      {
        case 1:
          System.out.println("Enter height and radius of Cylinder:");
          cyh=xx.nextDouble();
          cyr=xx.nextDouble();
          Cylinder cy=new Cylinder(cyh,cyr);
          System.out.println("Volume of cylinder is "+cy.volume());
          System.out.println("Surface area of cylinder is "+cy.surfacearea());
          break;
        case 2:
          System.out.println("Enter height and radius of Cone:");
          coh=xx.nextDouble();
          cor=xx.nextDouble();
          Cone co=new Cone(coh,cor);
          System.out.println("Volume of cone is "+co.volume());
          System.out.println("Surface area of cone is "+co.surfacearea());
          break;
        case 3:
          System.out.println("Enter radius of Sphere:");
          sr=xx.nextDouble();
          Sphere s=new Sphere(sr);
          System.out.println("Volume of sphere is "+s.volume());
          System.out.println("Surface area of sphere is "+s.surfacearea());
          break;
        case 4:
          a=0;
          break;
        default:
          System.out.println("Enter a valid choice!!");
      }
    }
  }
}
