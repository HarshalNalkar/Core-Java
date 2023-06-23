import java.io.FileNotFoundException;
import java.io.FileInputStream;
class Throws
{
	static void openFile() throws FileNotFoundException
	{
		FileInputStream fs = new FileInputStream("D:\\Demo.text");
	}

	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("Main Starts");
		try{
			openFile();
		}
		catch(Exception e) 
		{
			System.out.println("FNFE Handled"+ e.getMessage());
		}
		System.out.println("Main Ends");
	}
}
