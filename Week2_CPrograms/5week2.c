#include <stdio.h>
#include <stdlib.h>

int main ()
{
   int n1,n2,t,i,j;

   printf("Enter first number: ");
   scanf("%d",&n1);
   printf("Enter second number: ");
   scanf("%d",&n2);

   printf("Prime numbers between %d and %d are:\n", n1, n2);
   for(i=n1;i<=n2;i++)
   {
      t=0;
      for(j=2;j<=i/2;j++)
      {
         if(i%j==0)
         {
            t=1;
            break;
         }
      }
      if(t==0)
          printf("%d\n", i);
   }
   return 0;
}
