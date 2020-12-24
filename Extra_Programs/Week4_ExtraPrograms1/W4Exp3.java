import java.util.Scanner;
public class W4Exp3 {
 	public static void main(String[] args) {
 	 	Scanner in=new Scanner(System.in);
    System.out.println("Enter number of items:");
    int n=in.nextInt();
    double total=0;
    double rip[]=new double[n];
    int q[]=new int[n];
 	  double tot[]=new double[n];
    System.out.println("Enter rate and quantity of each item");
    for(int i=0;i<n;i++)
 	  {
      System.out.print((i+1)+"-");
      System.out.print("Rs.");
      rip[i]=in.nextDouble();
      System.out.print("Quantitiy=");
      q[i]=in.nextInt();
    }
 	  for(int i=0;i<n;i++)
 	  {
 	    tot[i]=rip[i]*q[i];
      total+=tot[i];
    }
    if (total>=10000)
    {
      System.out.println("Discount = 5%. Total bill = " + total + " Discounted bill = " + (total - total * 0.05));
    }
    else if (total>=7500 && total<10000)
    {
      System.out.println("Discount = 3%. Total bill = " + total + " Discounted bill = " + (total - total * 0.03));
    }
 	 	else if (total >= 5000)
    {
      System.out.println("Discount = 2%. Total bill = " + total + " Discounted bill = " + (total - total * 0.02));
    }
 	 	else
    {
      System.out.println(" No discount. Total bill = " + total );
    }
  }
}
