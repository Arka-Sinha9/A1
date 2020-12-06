import java.util.*;

class WrongAge extends Exception
{
	public String toString()
	{
		return "Please enter the correct age:"+"Son's age cannot be greater than Father's age";

	}
}
class Father
{
	int age;
	Father(int age1)
	{
		age=age1;
		System.out.println("Father age:"+age);
	}
}
class Son extends Father
{
	Son(int age2)
	{
		System.out.println("Son age:"+age2);
	}
}
class Agemain1
{
	public static void main(String args[]) throws WrongAge
	{
		Scanner ss=new Scanner(System.in);
		System.out.print("Enter the age of father: ");
		int j=ss.nextInt();
		System.out.print("Enter the age of son: ");
		int k=ss.nextInt();

		if(k>=j)
		{
			throw new WrongAge();
		}
		else
		{
			Father f=new Father(j);
			Son s=new Son(k);
		}
	}
}
