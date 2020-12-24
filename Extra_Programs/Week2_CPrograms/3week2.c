#include <stdio.h>

int main()
{
    int k=1,n,i,j;

    printf("Enter N: ");
    scanf("%d",&n);

    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++,k++)
        {
            printf("%d\t",k);
        }

        printf("\n");
    }

    return 0;
}
