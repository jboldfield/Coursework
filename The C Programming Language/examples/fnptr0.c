/* Example introduces the idea of function pointer, whiich is a pointer 
to a function. This example just shows declaration and basic syntax. */

// Source code modified from www.learn-c.org

#include <stdio.h>

void aFunction(int arg)
  {
    printf("This is aFunction being called and argument is: %d\n", arg);
    printf("Leaving the function now...\n");
  }

int main()
{
  void (*fp)(int); // declaring a function pointer that points to above function.

  fp = &aFunction; //assigning pointer to point to the specific function 

  printf("In main: We're about to call aFunction using a pointer!\n");

  (fp)(7); //instead of calling the function directly, we call it using a pointer
  
  printf("Back in main: Seems cool, but what is the need?\n");

  return 0;
}
