import java.util.Scanner;
class Employee{
  int empid;
  String empname; int empnohrs;
  int empbasic; double emphra; double empda; double empit; double empgross;
  void accept() {
    Scanner xx=new Scanner(System.in); System.out.println("Enter details-"); System.out.println("Enter ID:"); empid=xx.nextInt();
    System.out.println("Enter Name:"); empname=xx.next(); System.out.println("Enter number of hours:");
    empnohrs=xx.nextInt(); System.out.println("Enter basic salary:"); empbasic=xx.nextInt(); System.out.println("Enter HRA in %"); emphra=xx.nextDouble(); System.out.println("Enter DA in %"); empda=xx.nextDouble(); System.out.println("Enter IT in %"); empit=xx.nextDouble();
  }
  double salary() {
    empgross=empbasic+(empbasic*(emphra/100))+(empbasic*(empda/100))- (empbasic*(empit/100));
    return empgross;
  }
  void overtime() {
    int x; if(empnohrs>200){
      x=empnohrs-200;
      x*=100;
      System.out.println("additional payment= "+x+"\n gross salary after addition= "+(empgross+x));
    }
    else if(empnohrs<200){
      x=200-empnohrs;
      x*=100;
      System.out.println("reduced payment= "+x+"\n gross salary after reduction= "+(empgross-x));
    }
  }
}
class W5Exp1{
public static void main(String ss[]){
  Employee e1=new Employee();
  e1.accept();
  e1.salary();
  System.out.println("The gross salary is= "+e1.empgross); e1.overtime();
  }
}
