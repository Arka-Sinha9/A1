package CIE;
import CIE.*;
import java.util.*;

public class Internals extends Student
{
    public double[] cie_m;

    public void display()
    {
        cie_m=new double[5];
        Scanner ss=new Scanner(System.in);
        System.out.println("CIE Marks for 5 subjects(out of 50):");
        for(int i=0;i<5;i++)
            cie_m[i]=ss.nextDouble();
    }
}
