class SalaryException extends RuntimeException
{
	@Override
		public String getMessage() {
			return "";
		}
}
class Employee
{
	String name;
	double salary;
	Employee(String name, double salary)
	{
		this.name = name;
		if (salary < 0)
		{
			try
			{
				throw new SalaryException() ;
			}
			catch (Exception e)
			{
				System.out.println("SalaryException Handled");
				e.printStackTrace();
			}
		}
		else {
			this.salary = salary ;
		}
	}
	public String toString() {
		return "Name: "+name+", Salary: "+salary;
	}
}
class SalaryException1
{
	public static void main(String[] args)
	{
		System.out.println("MAin Starts");
		Employee e1 = new Employee("HArshal", 100000);
		System.out.println(e1);
		Employee e2 = new Employee("Vaishali", -100000);
		System.out.println(e2);
	}
}
