/* Source code borrowed from geeksforgeeks.com */

/* Examples demonstrates that we can create an array of 
function pointers, too. We can invoke any one, or all 
of the functions pointed by these function pointers. */

#include <stdio.h>

void addition(int a, int b) 
{ 
  printf("Addition of %d and %d is %d\n", a, b, a+b); 
} 
void subtraction(int a, int b) 
{ 
  printf("Subtracting %d from %d results in %d\n", b, a, a-b); 
} 
void multiplication(int a, int b) 
{ 
  printf("Multiplying %d with %d yields %d\n", a, b, a*b); 
} 
  
int main() 
{ 
    // fun_ptr_arr is an array of function pointers 
    void (*fun_ptr_arr[])(int, int) = {addition, subtraction, multiplication}; 
    int choice, a = 6, b = 8; 
  
    printf("Enter Choice: 0 for add, 1 for subtract and 2 for multiplication.\n"); 
    scanf("%d", &choice);
  
    (*fun_ptr_arr[choice])(a, b); 
  
    return 0; 
} 