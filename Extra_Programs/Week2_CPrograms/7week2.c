#include<stdio.h>
#include<stdlib.h>

int main()
{
    int a,stu[1000],n,s1[500],s2[500],s3[500],i,i1=0,i2=0,i3=0,a1,a2,a3,j,k,l,x,y,z,x1,y1,z1,x2,y2,z2;
    printf("Enter number of students: ");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("\n\nEnter your id: ");
        scanf("%d",&stu[i]);
        printf("1-Internet of Things\n2-Advanced Java and J2EE\n3-Advanced Data Structures\n");
        printf("Choose from the above electives: ");
        scanf("%d",&a);
        switch(a)
        {
            case 1:
                s1[i1]=stu[i];
                i1++;
                printf("Number of students for elective 1 till now: %d",i1);
                break;
            case 2:
                s2[i2]=stu[i];
                i2++;
                printf("Number of students for elective 2 till now: %d",i2);
                break;
            case 3:
                s3[i3]=stu[i];
                i3++;
                printf("Number of students for elective 3 till now: %d",i3);
                break;
            default:
                printf("Enter valid choice");
                break;
        }
    }
    printf("\nTotal number of students in each elective is\n1-%d\n2-%d\n3-%d\n",i1,i2,i3);
    printf("\nStudents in elective 1 are-");
    for(x=0;x<i1;x++)
    {
        printf("%d\n",s1[x]);
    }
    printf("\nStudents in elective 2 are-");
    for(y=0;y<i2;y++)
    {
        printf("%d\n",s2[y]);
    }
    printf("\nStudents in elective 3 are-");
    for(z=0;z<i3;z++)
    {
        printf("%d\n",s3[z]);
    }
    if(i1<30)
    {
        printf("\nInternet of Things will not be floated due to lack of students\nPlease choose from the remaining two electives-");
        for(j=0;j<i1;j++)
        {
            printf("Student with id %d please choose",s1[j]);
            printf("\n1-Advanced Java and J2EE\n2-Advanced Data Structures\n");
            scanf("%d",&a1);
            switch(a1)
            {
                case 1:
                    s2[i2]=s1[j];
                    i2++;
                    break;
                case 2:
                    s3[i3]=s1[j];
                    i3++;
                    break;
                default:
                    printf("Enter valid choice");
                    break;
            }
        }
        printf("\nNow total students in each elective\n1-%d\n2-%d\n",i2,i3);
        printf("\nStudents in elective 1 are-");
        for(y2=0;y2<i2;y2++)
        {
            printf("%d\n",s2[y2]);
        }
        printf("\nStudents in elective 2 are-");
        for(z1=0;z1<i3;z1++)
        {
            printf("%d\n",s3[z]);
        }
    }
    else if(i2<30)
    {
        printf("\nAdvanced Java and J2EE will not be floated due to lack of students\nPlease choose from the remaining two electives-");
        for(k=0;k<i1;k++)
        {
            printf("Student with id %d please choose",s2[k]);
            printf("\n1-Internet of Things\n2-Advanced Data Structures\n");
            scanf("%d",&a2);
            switch(a2)
            {
                case 1:
                    s1[i1]=s2[k];
                    i1++;
                    break;
                case 2:
                    s3[i3]=s2[k];
                    i3++;
                    break;
                default:
                    printf("Enter valid choice");
                    break;
            }
        }
        printf("\nNow total students in each elective\n1-%d\n2-%d\n",i1,i3);
        printf("\nStudents in elective 1 are-");
        for(x2=0;x2<i1;x2++)
        {
            printf("%d\n",s1[x2]);
        }
        printf("\nStudents in elective 2 are-");
        for(z2=0;z2<i3;z2++)
        {
            printf("%d\n",s3[z2]);
        }
    }
    else if(i3<30)
    {
        printf("\nAdvanced Data Structures will not be floated due to lack of students\nPlease choose from the remaining two electives-");
        for(l=0;l<i1;l++)
        {
            printf("Student with id %d please choose",s3[l]);
            printf("\n1-Internet of Things\n2-Advanced Java and J2EE\n");
            scanf("%d",&a3);
            switch(a3)
            {
                case 1:
                    s1[i1]=s3[l];
                    i1++;
                    break;
                case 2:
                    s2[i2]=s2[l];
                    i2++;
                    break;
                default:
                    printf("Enter valid choice");
                    break;
            }
        }
        printf("\nNow total number of students in each elective\n1-%d\2-%d\n",i1,i2);
        printf("\nStudents in elective 1 are-");
        for(x1=0;x1<i1;x1++)
        {
            printf("%d\n",s1[x1]);
        }
        printf("\nStudents in elective 2 are-");
        for(y1=0;y1<i2;y1++)
        {
            printf("%d\n",s2[y1]);
        }
    }
    return 0;
}
