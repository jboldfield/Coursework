/*Example illustrates output to file using redirection supported by operating systems */
/* Try the following: gcc redirect.c -o redirect
                     ./redirect > Output.txt
You should see no output on the screen, rather a new file Output.txt created that contains 
all names and scores. The output is formatted according to the printf() statement here. This
shows > redirected the output to a file rather than screen. This is an OS feature and not a
feature of C language. */

/* Output file contents
Name: Alice	 Score: 98
Name: Bob	 Score: 89
Name: Charlie	 Score: 92
Name: Dave	 Score: 78
Name: Elli	 Score: 83*/

#include<stdio.h>

int main(){
   char *names[5] = {"Alice", "Bob", "Charlie", "Dave", "Elli"};
   int nums[5] = {98, 89, 92, 78, 83};
   int i;
   for(i=0; i<5; i++)
      printf("Name: %s\t Score: %d\n", names[i], nums[i]);
   return 0;
}