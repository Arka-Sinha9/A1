#include <stdio.h>
#include<math.h>

void cylinder()
{
    float r,h,sa,v;
    printf("Enter radius: ");
    scanf("%f",&r);
    printf("Enter height: ");
    scanf("%f",&h);
    sa=(2*3.142*r*h)+(2*3.142*r*r);
    v=3.142*r*r*h;
    printf("Surface area is %f\n",sa);
    printf("Volume is %f\n",v);
}
void cone()
{
    float r,h,sa,v,t;
    printf("Enter radius: ");
    scanf("%f",&r);
    printf("Enter height: ");
    scanf("%f",&h);
    t=sqrt((h*h)+(r*r));
    sa=3.142*r*(r+t);
    v=3.142*r*r*h/3;
    printf("Surface area is %f\n",sa);
    printf("Volume is %f\n",v);
}
void sphere()
{
    float r,sa,v;
    printf("Enter radius: ");
    scanf("%f",&r);
    sa=4*3.142*r*r;
    v=4*3.142*r*r*r/3;
    printf("Surface area is %f\n",sa);
    printf("Volume is %f\n",v);
}
int main()
{
    int n;
    char a,t;
    printf("\n\n1-Cylinder\n2-Cone\n3-Sphere\n");
    do
    {
        printf("Choose one: ");
        scanf("%d",&n);
        switch(n)
        {
            case 1:
                cylinder();
                break;
            case 2:
                cone();
                break;
            case 3:
                sphere();
                break;
            default:
                printf("Enter valid choice!!");
                break;
        }
        printf("\nPress 1 to continue or 0 to exit: ");
        scanf("%d",&t);
        if(t==1)
        {
            a=1;
        }
        else if(t==0)
        {
            a=0;
        }
        else
        {
            return -1;
        }
    }while(a==1);
    return 0;
}
