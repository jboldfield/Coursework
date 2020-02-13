/* This example demonstrates how pointer to data types defined by structure can 
be declared, initializaed, and passed as function argument. It also shows how to 
access individual filed of the structure referenced by a pointer using -> symbol. */

/* Carefully compare this example with previous one (struct3.c) for the 
output of last printf() statement in the main(). */ 

#include<stdio.h>

typedef struct{
  char name[20];
  int age;
  char gender;
}person;

typedef struct{ 
  person employee;
    int num;
    char street[20];
    char city[10];
    int zip;
  } employee_record;

void printStruct(employee_record *e){ // e is a pointer to the data type defined by struct and can be passed to a function

  puts("\nPrinting structure data type from within a function...");
  printf(" Employee name and age: %s\t %d\n", e->employee.name, --e->employee.age); // use of '->' instead of '.' to access fields
  printf(" Employee address: %d %s, %s, %d\n\n", e->num, e->street, e->city, e->zip);

}

int main(){

  person Emp1 = {"Jane Doe", 33, 'F'}; // instantiation of a person structure

  employee_record empl = {Emp1, 123, "Main Street", "Valdosta", 31698}; // instantiation of employee_record  
 
  employee_record *er = &empl; // er is a pointer to an employee_record and initialized by an "object" of that type

  printStruct(er); // The pointer is passed as an argument

  printf("In main(): Employee's age is %d years.\n\n", empl.employee.age); // Note the age value printed in this statement.
  
  return 0;
}
