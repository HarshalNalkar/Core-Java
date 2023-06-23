import java.util.Scanner;
import java.lang.Integer;
class StringException extends Exception
{
    @Override
    public String getMessage() {
        return "You cannot start number or special character in Name format." ;
    }
}
class SalaryException extends Exception
{
    @Override
    public String toString() {
        return "You cannot insert any character or negative values or special character in salary";
    }
}
class IdException extends Exception
{
    @Override
    public String getMessage() {
        return "you cannot insert any special charcter in ID Format.";
    }
}
class Employee
{
    String name;
    String id;
    double salary;
    String salary1 = String.valueOf(salary);
    int salary2 = Integer.parseInt(salary1);
    boolean flagName = false, flagId = false, flagSalary = false ;

    Employee(String name, String id, double salary) 
    throws StringException, IdException, SalaryException, Exception
    {
        for(int i = 0; i < name.length(); i++)
        {
            if(name.charAt(i) >= 65 && name.charAt(i) <= 90 ||
                name.charAt(i) >= 97 && name.charAt(i) <= 122)
                {
                    flagName = true;
                }
        }
        if(flagName) {
            this.name = name;
        }
        else {
            throw new StringException();
        }

        for (int i = 0; i < id.length(); i++)
        {
            if(id.charAt(i) >= 65 && id.charAt(i) <= 90 ||
                id.charAt(i) >= 97 && id.charAt(i) <= 122 ||
                id.charAt(i) >= 48 && id.charAt(i) <= 57)
                {
                    flagId = true;
                }
        }
        if(flagId)
        {
            this.id = id;
        }
        else {
            throw new IdException();
        }

        for (int i = 0 ; i < salary1.length(); i++) 
        {
            if(salary > 0 && salary1.charAt(i) >=48 && salary <= 57)
            {
                flagSalary = true ;
            }
        }
        if (flagSalary)
        {  
            this.salary = salary2 ;
        }
        else {
            throw new SalaryException();
        }
    }
    
}

public class EmployeeDriver 
{
    public static void main(String[] args)
    {
        System.out.println("Main Starts");
        Scanner sc = new Scanner(System.in);

        System.out.println("How many records insert of Employee");
        int num = sc.nextInt();
        sc.nextLine();

        Employee[] stdArr = new Employee[num] ;
        for (int i = 0 ; i < stdArr.length; i++)
        {
            System.out.println("Enter the name");
            String name =  sc.nextLine();
            System.out.println("Enter the id number");
            String id = sc.next();
            System.out.println("Enter the salary");
            double salary = sc.nextDouble();

            try {
                stdArr[i] = new Employee(name, id, salary);
                System.out.println("Employee record are added");
            }
            catch(StringException e)
            {
                System.out.println(e.getMessage());
                System.out.println("Employee not added becauae of name");
                i--;
            }
            catch(IdException e) 
            {
                System.out.println(e.getMessage());
                System.out.println("Employee not added bcz of id");
                i--;
            }
            catch(SalaryException e) 
            {
                System.out.println(e.getMessage());
                System.out.println("Employee not added bcz of sal");
                i--;
            }
            catch(Exception e)
            {
                System.out.println("Handled any Exception");
                e.printStackTrace();
                i--;
            }
            finally{
                //sc.close();
                System.out.println("Thank you");
            }
        }
     
    }   
}
