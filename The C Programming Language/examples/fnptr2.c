/* Example demonstrates, like previous one, how a function pointer
can be passed as an argument to a function and be invoked. */

/* Modified from source code in geeksforgeeks.org */

#include<stdio.h>

void function1(){
  printf("This is funtion 1.\n");
}

void function2(){
  printf("This is function 2.\n");
}

void function3(){
  printf("This is function 3.\n");
}

void calling_function(void (*funct)()){
    funct();
  }
/* In the above calling function is a function that accepts a function 
pointer as argument. The function pointer *funct is pointing to a function 
that has no argument and has return type void. */

int main(){

  calling_function(function1);
  /* by passing function1(), which has no argument and return type void, we 
     are asserting that the function pointer 'funct' is pointing to function1 */

  // ======== ALTERNATIVE WAY ========
  
  // declaring a pointer to a function that has no argument, and return type void
  void (*fnptr)();
  
  // the function points to the concrete function (the function3() that matches the requirement
  fnptr = function3;

  // passing the pointer to the calling function, which in turn will execute function3()
  calling_function(fnptr);

  return 0;
}
