import java.util.*;
class Student
{
    private String USN;
    private String name;
    private int n;
    private double SGPA = 0;
    private int totalCredits = 0;
    private int credits[];
    private double marks[];
    Scanner in = new Scanner(System.in);
    
    void accept()
    {
    System.out.println("Enter USN of the student");
    USN = in.nextLine();
    System.out.println("Enter Name of the student");
    name = in.nextLine();
    System.out.println("Enter number of subjects");
    n = in.nextInt();
    credits = new int[n];
    marks = new double[n];
    System.out.println("Details of the subjects:");
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter credits for subject "+(i+1));
        credits[i] = in.nextInt();
        System.out.println("Enter marks for subject "+(i+1));
        marks[i] = in.nextInt();
        Calculate(credits[i],marks[i],i);
    }
    }
    
    
    void Calculate(int credit,double mark,int j)
    {
        totalCredits = totalCredits + credit; 
        if(mark>=90&&mark<=100)
            SGPA = SGPA + (10*credit);
        else if(mark>=80 && mark<90)
            SGPA = SGPA + (9*credit);
        else if(mark>=70&&mark<80)
            SGPA = SGPA + (8*credit);
        else if(mark>=60&&mark<70)
            SGPA = SGPA + (7*credit);
        else if(mark>=50 && mark<60)
            SGPA = SGPA + (6*credit);
        else if(mark>=40&&mark<50)
            SGPA = SGPA + (5*credit);
        else
            System.out.println("Failed in Subject "+(j+1));
    }
    
    
    void Display()
    {
        System.out.println("Details of the Student");
        System.out.println("USN: "+USN);
        System.out.println("Name :"+name);
        System.out.println("SGPA of Student "+(SGPA/totalCredits));
    }
}
    class Main {
    public static void main(String args[]) {
        Student s1 = new Student();
    s1.accept();
    s1.Display();
    }
}
