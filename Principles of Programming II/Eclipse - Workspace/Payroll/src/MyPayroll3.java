//***************************************************************************************
//Purpose:	Payroll system that prints out employees by their type and pay.
//Author:	Johnnie Oldfield
//Date:		1/26/2018
//Program:	MyPayroll3
//**************************************************************************************

// Employee hierarchy test program.
import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;
public class MyPayroll3{
	//**********************************************************************************
	//main:	declare needed data structures, populate arraylist, and process records
	//**********************************************************************************
	public static void main( String args[] ) {

	   DecimalFormat df = new DecimalFormat("##,###,###.##");
	   ArrayList<Employee> employee = new ArrayList<>();
	   
	   //populate arraylist
	   employee.add(new SalariedEmployee("John", "Smith", "111-11-1111", 48000.00 ));
	   employee.add(new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40 ));
	   employee.add(new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06 ));
	   employee.add(new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300 ));
	   employee.add(new PieceWorker("Rick", "Bridges", "555-55-5555", 2.25, 400 ));
	   employee.add(new SalariedEmployee("Joe", "Jones", "999-99-9999", 68800.00 ));
	   employee.add(new SalariedEmployee("Chris", "Smith", "888-88-8888", 75432.00 ));
	   employee.add(new HourlyEmployee("Sam", "Price", "777-77-7777", 25.75, 25 ));
	   employee.add(new CommissionEmployee("Beth", "Jones", "555-55-5555", 20000, .07 ));
	   employee.add(new BasePlusCommissionEmployee("Matt", "Lewis", "123-45-6789", 10000, .05, 500 ));
	   employee.add(new PieceWorker("Zac", "Bridges", "123-44-5555", 5.25, 200 ));
	   employee.add(new SalariedEmployee("Emily", "Smith", "123-55-6666", 100000.00 ));
	   
	   //1.	Display content of Arraylist
	   for(int i = 0; i < employee.size(); i++) {   
		    System.out.print("\n" + (i + 1) + ". " + employee.get(i));
		    System.out.println();
	   }
	   //2.	Change every Price's last name to your last name.
	   //Collections.replaceAll(employee, "Price", "Oldfield");
	   for(int i = 0; i < employee.size(); i++) {
		    String s = employee.get(i).getLastName();
	        if(s.equals("Price"))
	            employee.get(i).setLastName("Oldfield");
	   }
	   //3.	Sort the items in the arraylist based on earning
	   Collections.sort(employee);
	   
	   //4.	Display only first and last name of all employees with their earnings
	   System.out.println();
	   System.out.println("Employees:");
	   for (Employee o : employee)
		   System.out.println(o.getFirstName() + " " + o.getLastName() + "\t" + (int) o.earnings());
	   
	   //5.	Compute and display the total earning of each employee category
	   //	and the total earnings for all employees.
	   System.out.println();
	   System.out.println("Employee Type:                 \t" + "Total Earnings:");
	   //Salaried Employee
	   int salaryTotal = 0;
	   for (int i = 0; i < employee.size(); i++) {
		   if (employee.get(i) instanceof SalariedEmployee)
			   salaryTotal += employee.get(i).earnings();
	   }
	   System.out.println("Salaried Employees:		\t" + salaryTotal);
	   //Piece workers
	   int pieceTotal = 0;
	   for (int i = 0; i < employee.size(); i++) {
		   if (employee.get(i) instanceof PieceWorker)
			   pieceTotal += employee.get(i).earnings();
	   }
	   System.out.println("Piece Worker Employees:		\t" + pieceTotal);
	   //Hourly Employee
	   int hourlyTotal = 0;
	   for (int i = 0; i < employee.size(); i++) {
		   if (employee.get(i) instanceof HourlyEmployee)
			   hourlyTotal += employee.get(i).earnings();
	   }
	   System.out.println("Hourly Employees:		\t" + hourlyTotal);
	   //BasePlus Commission
	   int baseTotal = 0;
	   for (int i = 0; i < employee.size(); i++) {
		   if (employee.get(i) instanceof BasePlusCommissionEmployee)
			   baseTotal += employee.get(i).earnings();
	   }
	   System.out.println("Base Plus Commission Employees:	\t" + baseTotal);
	   //Commission
	   int commissionTotal = 0;
	   for (int i = 0; i < employee.size(); i++) {
		   if (employee.get(i) instanceof CommissionEmployee)
			   commissionTotal += employee.get(i).earnings();
	   }
	   System.out.println("Commission Employees:		\t" + (commissionTotal - baseTotal));
	   System.out.println();
	   //6.	Display total of different employee type
	   
	   //7.	Display the total earnings for all employees
	   double total = 0;
	   for (int i = 0; i < employee.size(); i++) {
		   if (employee.get(i) instanceof Employee)
			   total += employee.get(i).earnings();
	   }
	   System.out.println("Total for all employees:	\t" + total);
   } // end main
} // end class MyPayroll5
