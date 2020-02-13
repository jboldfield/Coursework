// Employee abstract superclass.

public abstract class Employee implements Comparable<Employee>
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;

   // three-argument constructor
   public Employee( String first, String last, String ssn )
   {
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
   } // end three-argument Employee constructor

   // set first name
   public void setFirstName( String first )
   {
      firstName = first;
   } // end method setFirstName

   // return first name
   public String getFirstName()
   {
      return firstName;
   } // end method getFirstName

   // set last name
   public void setLastName( String last )
   {
      lastName = last;
   } // end method setLastName

   // return last name
   public String getLastName()
   {
      return lastName;
   } // end method getLastName

   // set social security number
   public void setSocialSecurityNumber( String ssn )
   {
      socialSecurityNumber = ssn; // should validate
   } // end method setSocialSecurityNumber

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } // end method getSocialSecurityNumber

   // return String representation of Employee object
   public String toString()
   {
      return String.format( "%s %s\nsocial security number: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber() );
   } // end method toString

   // abstract method overridden by subclasses
   public abstract double earnings(); // no implementation here
   
   //Compare
   public int compareTo (Employee o) {
	   Double thisEarnings = Double.valueOf(this.earnings());
	   Double oEarnings = Double.valueOf(o.earnings());
	   int earningsComparison = thisEarnings.compareTo(oEarnings);
	     if (earningsComparison == 0) {
	   		if (earningsComparison > 0)
				return -1;
			else if (earningsComparison < 0)
				return 1;
			else
				return 0;
	   	}
	     return earningsComparison;
   }
} // end abstract class Employee