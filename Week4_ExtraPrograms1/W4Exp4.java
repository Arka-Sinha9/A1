import java.util.*;
class W4Exp4{
  public static void main(String[] args){
    Scanner xx=new Scanner(System.in);
    int an,bn=0,cn=0,i,j,max,min,sum=0;
    double avg;
    int[] A=new int[10];
    int[] B=new int[10];
    int[] C=new int[10];
    System.out.print("Enter the number of elements in A: ");
    an=xx.nextInt();
    System.out.println("Enter the elements-");
    for(i=0;i<an;i++)
    {
      A[i]=xx.nextInt();
    }
    for(i=0;i<an;i++)
    {
      if(A[i]%2==1)
      {
        B[bn]=A[i];
        bn++;
      }
      else if(A[i]%2==0)
      {
        C[cn]=A[i];
        cn++;
      }
    }
    for(i=0;i<cn;i++)
    {
      sum+=C[i];
    }
    max=C[0];
    min=C[0];
    for(i=0;i<cn;i++)
    {
      for(j=i;j<cn;j++)
      {
        if(C[j]>C[i])
        {
          max=C[j];
        }
      }
    }
    for(i=0;i<cn;i++)
    {
      for(j=i;j<cn;j++)
      {
        if(C[j]<C[i])
        {
          min=C[j];
        }
      }
    }
    avg=sum/cn;
    System.out.println("Sum of elements in C "+sum);
    System.out.println("Minimum element of C "+min);
    System.out.println("Maximum element of C "+max);
    System.out.println("Average of elements in C "+avg);
  }
}
