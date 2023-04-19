class Book
{
	String name ;
	int pages;

	Book(String name , int pages)
	{
		this.name = name;
		this.pages = pages;
	}

	public String toString() {
		return "Name: "+name+", Pages: "+pages;
	}
}
class ToString
{
	public static void main(String[] args)
	{
		Book[] b = new Book[3];
		Book b1 = new Book("Java",1000);
		Book b2 = new Book("Python", 100);
		Book b3 = new Book("c++", 10000);

		b[0] = b1 ;
		b[1] = b2 ;
		b[2] = b3 ;
		
		for (int i = 0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
	}
}