import java.util.Scanner;
class Age {
  String name; int year;
  int month;
  void accept() {
    Scanner xx=new Scanner(System.in); System.out.println("Enetr name-");
    name=xx.next();
    System.out.println("Enter year-");
    year=xx.nextInt();
    System.out.println("Enter month:");
    month=xx.nextInt();
  }
  int add(){
    int sum=0;
    sum=month+(year*12);
    return sum;
  }
  String oname(){
    return name;
  }
}
class W5Exp2{
  public static void main(String ss[]){
    Age n1=new Age();
    n1.accept();
    n1.add();
    n1.oname();
    Age n2=new Age();
    n2.accept();
    n2.add();
    n2.oname();
    if(n1.add()>n2.add())
    {
      System.out.printf(n1.oname()+" is older");
    }
    else if(n2.add()>n1.add())
    {
      System.out.println(n2.oname()+" is older");
    }
  }
}
