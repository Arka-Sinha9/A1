import CIE.*;
import SEE.*;
import java.util.*;
public class pack
{
    public static void main(String args[])
    {
        int n;
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        n=ss.nextInt();
        CIE.Student[] st =new CIE.Student[n];
        CIE.Internals[] in =new CIE.Internals[n];
        SEE.Externals[] e =new SEE.Externals[n];
        for(int i=0;i<n;i++)
        {
            st[i]=new CIE.Student();
            st[i].display();
            in[i]=new CIE.Internals();
            in[i].display();
            e[i]=new SEE.Externals();
            e[i].display();
            System.out.println("Total marks of student "+st[i].name+" in 5 subjects are:");
            for(int j=0;j<5;j++)
            {
                System.out.println(in[i].cie_m[j]+(e[i].see_m[j]/2));
            }

        }
    }
}
