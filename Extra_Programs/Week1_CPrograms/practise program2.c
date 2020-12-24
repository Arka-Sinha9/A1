#include <stdio.h>
float sumaver(int a, int b)
{
    printf("The sum of Two largest numbers is %d\n",a+b);
    return (float)(a+b)/2;
}

int printeven(int x,int y)
{

     printf("Even numbers in between %d and %d:\n",x,y);
     for(int i=x; i<=y; i++)
    {
        if(i%2 == 0)
        {
            printf("%d\n", i);
        }
    }

}
int main ()
{
    int n = 0, i = 0, l1 = 0, l2 = 0, temp = 0;
    int arr[n];
    float avg;
    printf ("Enter the numbers: ");
    for (i = 0; i < 3; i++)
    {
        scanf ("%d", &arr[i]);
        printf("\n");
    }

    l1 = arr[0];
    l2 = arr[1];

    if (l1 < l2)
    {
        temp = l1;
        l1 = l2;
        l2 = temp;
    }

    for (int i = 2; i < 3; i++)
    {
        if (arr[i] > l1)
        {
            l2 = l1;
            l1 = arr[i];
        }
        else if (arr[i] > l2 && arr[i] != l1)
        {
            l2 = arr[i];
        }
    }

    printf ("The largest number = %d\n", l1);
    printf ("The second largest number = %d\n", l2);

   avg=sumaver(l1,l2);
   printf("The average of two largest numbers is %f\n",avg);

   printeven(l2,l1);
    return 0;
}
