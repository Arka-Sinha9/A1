
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        double r1,r2;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coefficients a, b, c: ");
        double a = scan.nextFloat();
        double b = scan.nextFloat();
        double c = scan.nextFloat();
        double d=b*b-4*a*c;
        if(d>0)
        {
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.printf("root1=%.2f and root2=%.2f",r1,r2);
        }
        else if(d==0)
        {
            r1=r2=-b/(2*a);
            System.out.printf("root1=root2=%.2f",r1);
        }
        else
        {
            double r=-b/(2*a);
            double i=Math.sqrt(-d)/(2*a);
            System.out.printf("root1=%.2f+%.2fi and root2=%.2f-%.2fi",r,i,r,i);
        }
    }
}
