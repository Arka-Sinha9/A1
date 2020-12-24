#include <stdio.h>
int main()
{
    int n1,n2,p,y=0,a;
    while(y==0)
    {
        printf("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Greater\n6-Smaller\n7-Equality\n8-Greater than or Equal\n9-Cube\n10-Square\n");
        printf("\nInput your option :\n");
        scanf("%d",&p);
        printf("Enter the first Integer :");
        scanf("%d",&n1);
        printf("Enter the second Integer :");
        scanf("%d",&n2);


        switch(p)
        {
            case 1:
                printf("The Addition of  %d and %d is: %d\n",n1,n2,n1+n2);
                break;

            case 2:
                printf("The Subtraction of %d  and %d is: %d\n",n1,n2,n1-n2);
                break;

            case 3:
                printf("The Multiplication of %d  and %d is: %d\n",n1,n2,n1*n2);
                break;

            case 4:
            if(n2==0)
            {
                printf("Cannot divide by zero!!\n");
            }
            else
            {
                printf("The Division of %d  and %d is : %d\n",n1,n2,n1/n2);
            }
            break;

            case 5:
            if (n1>n2)
            {
                printf("The Greater number is %d",n1);
            }
            else
            {
                printf("The Greater number is %d",n2);
            }
            break;

        case 6:
        if (n1<n2)
        {
            printf("The Smaller number is %d",n1);
        }
        else
        {
            printf("The Smaller number is %d",n2);
        }
        break;

        case 7:

        if (n1==n2)
        {
            printf("The numbers are Equal");
        }
        else
        {
            printf("The numbers are not Equal");
        }
        break;

        case 8:
        if(n1>=n2)
        {
            printf("The Number %d is greater  than or equal to %d",n1,n2);
        }
        else
        {
            printf("The Number %d is greater  than or equal to %d",n2,n1);
        }
        break;
        case 9:

            printf("The cube of %d is %d\n",n1,n1*n1*n1);
            printf("The cube of %d is %d\n",n2,n2*n2*n2);
            break;

        case 10:
            printf("The square of %d is %d\n",n1,n1*n1);
            printf("The square of %d is %d\n",n2,n2*n2);
            break;


        default:
            printf("Option not available\n");
            break;

    }

        printf("\nPress 0 to exit or 1 to continue.\n");
        scanf("%d",&a);
        if(a==0)
        {
            y=1;
        }
        else if(a==1)
        {
            y=0;
        }
    }
    return 0;
}
