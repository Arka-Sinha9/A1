import java.util.*;
class W4Exp2{
  public static void main(String[] args){
    Scanner ss = new Scanner(System.in);
    int n,i,pos=0,zer=0,neg=0;
    int[] a = new int[100];
    System.out.print("Enter the number of elements: ");
    n=ss.nextInt();
    System.out.println("Enter the numbers-");
    for(i=0;i<n;i++)
    {
      a[i]=ss.nextInt();
    }
    for(i=0;i<n;i++)
    {
      if(a[i]>0)
      {
        pos++;
      }
      else if(a[i]<0)
      {
        neg++;
      }
      else if(a[i]==0)
      {
        zer++;
      }
    }
    System.out.println("Number of positive numbers are "+pos);
    System.out.println("Number of negative numbers are "+neg);
    System.out.println("Number of zeros are "+zer);
  }
}
