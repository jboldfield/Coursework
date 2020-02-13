/* Though structures can be defined anywhere within the code, it is better to 
define them as global for easy referrencing throughout the code. This example 
will also demonstrate how to pass the data type to a function. */

#include<stdio.h>

typedef struct{
  char name[20];
  int age;
  char gender;
}person; // The struct identifier ('person') is moved here

typedef struct{ 
    person employee;
    int num;
    char street[20];
    char city[10];
    int zip;
  } employee_record;

void printStruct(employee_record e){ // a data type defined by struct can be passed to a function

  puts("\nPrinting structure data type from within a function...");
  printf(" Employee name and age: %s\t %d\n", e.employee.name, --e.employee.age);
  printf(" Employee address: %d %s, %s, %d\n\n", e.num, e.street, e.city, e.zip);

}

int main(){

  person Emp1 = {"Jane Doe", 33, 'F'}; // instantiation of a person structure

  employee_record empl = {Emp1, 123, "Main Street", "Valdosta", 31698}; // instantiation of employee_record  
 
  printStruct(empl);

  printf("In main(): Employee's age is %d years.\n\n", empl.employee.age); // Note the age value printed in this statement.
  
  return 0;
}
