package SEE;
import java.util.*;
import CIE.*;

public class Externals extends CIE.Student
{
    public double[] see_m;

    public void display()
    {
        see_m=new double[5];
        Scanner ss=new Scanner(System.in);
        System.out.println("SEE Marks for 5 subjects(out of 100):");
        for(int i=0;i<5;i++)
            see_m[i]=ss.nextDouble();
    }
}
