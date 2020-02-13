/* The first example on 'struct' concept */
/* The 'struct' can be defined inside a method as well 
   as global structure. However, the latter is preferred. */

#include<stdio.h>

struct person{  // creates a 'person' structure (similar to class)
  char name[20];
  int age;
  char gender;
  };

int main(){

  struct employee_record{ 
    struct person employee; // a structure can be a field in another structure
    int num;
    char street[20];
    char city[10];
    int zip;
  };

  struct person Emp1 = {"Jane Doe", 33, 'F'}; // an instance of 'person' 
  Emp1.age++; //individual fields can be manipulated

  puts("\nPrinting fields of 'person' structure");
  printf("Name: %s\t Age: %d\t Gender: %c\n", Emp1.name, Emp1.age, Emp1.gender);

  struct employee_record empl = {Emp1, 123, "Main Street", "Valdosta", 31698}; // an instance of 'employee_record' 
 
  puts("\nPrinting fields of 'employee_record' structure:");
  printf(" Employee name: %s\n Employee age: %d\n",empl.employee.name, --empl.employee.age);
  //Note above, how filed manipulation is done for nested structure
  printf(" Employee address: %d %s, %s, %d\n\n", empl.num, empl.street, empl.city, empl.zip);

  return 0;
}
