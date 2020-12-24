import java.util.*;
class W4Exp1{
  public static void main(String args[]){
    Scanner xx = new Scanner(System.in);
    int i;
    int n;
    int[] a=new int[100];
    int sumeven=0;
    int sumodd=0;
    System.out.print("Enter the size of array: ");
    n = xx.nextInt();
    System.out.println("Enter elements-");
    for(i=0;i<n;i++)
    {
      a[i] = xx.nextInt();
    }
    for(i=0;i<n;i++)
    {
      if(a[i]%2==0)
      {
        sumeven += a[i];
      }
      else if(a[i]%2==1)
      {
        sumodd += a[i];
      }
    }
    System.out.println("The summ of even numbers are "+sumeven);
    System.out.println("The summ of odd numbers are "+sumodd);
  }
}
