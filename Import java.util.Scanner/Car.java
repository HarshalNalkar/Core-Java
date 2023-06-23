class Car
{
	String brand ;
	String color ;
	double price ;
	
	void Cardetails()
	{
		System.out.println("Brand: " +brand);
		System.out.println("color: " +color);
		System.out.println("price: " +price);

	}

	public static void main(String[] args)
	{
		System.out.println("MAin Starts");
		Car c1 = new Car();

		c1.brand = "Mercedes Benz";
		c1.color = "Black";
		c1.price = 2.500000000 ;
		c1.Cardetails();
		 
		System.out.println("Main Ends");

	}
}