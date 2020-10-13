import java.util.*;
class Book {
	String name;
	String author;
	float price;
	int num_pages;
	Book()
	{}
	Book(String name,String author,int price,int num_pages)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.num_pages=num_pages;
	}
	void display()
	{
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter name of book:");
		name=inp.next();
		System.out.println("Enter author of book:");
		author=inp.next();
		System.out.println("Enter price of book:");
		price=inp.nextFloat();
		System.out.println("Enter number of pages of book:");
		num_pages=inp.nextInt();
	}
	public String toString()
	{
		return ("Name: "+name + "\n" + "Author: "+author + "\n" + "Price: "+price + "\n" +"Number of pages: "+num_pages );
	}
}
class BookMain {
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the number of books:");
		int n=a.nextInt();
		Book b[]=new Book[n];
		for(int i=0;i<n;i++)
		{
			b[i]=new Book();
			System.out.println("Enter the details of "+(i+1)+" book");
			b[i].display();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Details of book "+(i+1));
			System.out.println(b[i]);
		}
	}
}
