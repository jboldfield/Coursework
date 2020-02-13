/* This example shows how struct can be used for 
creating customized data type using 'typedef' 
macro. It facilitates easy referencing. */

#include<stdio.h>

typedef struct{  // Note the use of typedef
  char name[20];
  int age;
  char gender;
}person; // The struct identifier ('person') is moved here

int main(){

  typedef struct{ 
    person employee; // do not need to use the keyword 'struct' in the declaration
    int num;
    char street[20];
    char city[10];
    int zip;
  }employee_record;

  person Emp1 = {"Jane Doe", 33, 'F'}; // as above: 'person' is now a data type
  Emp1.age++;

  puts("\nPrinting fields of 'person' structure");
  printf("Name: %s\t Age: %d\t Gender: %c\n", Emp1.name, Emp1.age, Emp1.gender);

  employee_record empl = {Emp1, 123, "Main Street", "Valdosta", 31698}; // same here: use the 'data type' for declaration 
 
  puts("\nPrinting fields of 'employee_record' structure:");
  printf(" Employee name: %s\n Employee age: %d\n",empl.employee.name, --empl.employee.age);
  
  printf(" Employee address: %d %s, %s, %d\n\n", empl.num, empl.street, empl.city, empl.zip);

  return 0;
}
