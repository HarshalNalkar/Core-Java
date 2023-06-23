import java.util.Scanner;
class InvalidNameException extends Exception
{
	@Override
		public String getMessage() {
			return "you cannot start number or special character";
		}
}
class InvalidAgeException extends Exception
{
	@Override
		public String getMessage() {
			return "you are not eligible by age";
		}
}
class Student
{
	String name;
	int age ;
	Student(String name, int age) throws InvalidNameException , InvalidAgeException
	{
		if (name.charAt(0) >=65 && name.charAt(0) <= 90 || 
			name.charAt(0) >= 97 && name.charAt(0) <= 122)
		{
			this.name = name ;
		}
		else {
			throw new InvalidNameException();
		}
		if (age > 0 && age < 100)
		{
			this.age = age ;
		}
		else {
			throw new InvalidAgeException();
		}
	}
	@Override
		public String toString() {
			return "Name: "+name+", Age: "+age;
		}
}
class StudentDriver1 
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("How many records insert of students");
		int num = sc.nextInt();

		Student[] stdArr = new Student[num];
		System.out.println("Enter the student details");

		for (int i = 0 ; i < stdArr.length; i++)
		{
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the Age");
			int age = sc.nextInt();

			try
			{
				stdArr[i] = new Student(name, age);
				System.out.println("Student was added");
			}
			catch (InvalidNameException e)
			{
				System.out.println(e.getMessage());
				System.out.println("Student was no added");
				i--;
			}
			catch(InvalidAgeException e)
			{
				System.out.println(e.getMessage());
				System.out.println("Student was not added");
				i--;
			}
		}

		for (Student e1 : stdArr)
		{
			System.out.println(e1);
		}
	}
}