package CIE;
import java.util.*;

public class Student
{
    public String name;
    public String usn;
    public int sem;
    public void display()
    {
        Scanner ss=new Scanner(System.in);
        System.out.println("Name:");
        name=ss.next();
        System.out.println("USN:");
        usn=ss.next();
        System.out.println("Semester:");
        sem=ss.nextInt();
    }
}
