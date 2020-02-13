/* This example shows redirection to read input from a file */
/* Use the following: gcc redirect1.c -o redirect1
                     ./redirect1 < scores.txt
Note, you do not need to enter the values manually. The < redirects 
the input from the supplied file scores.txt and the program processes
them to produce the output. */

/* Input File contents: 
98
89
92
78
83
68
56
97 */

#include<stdio.h>

int main(){
   int readnum;
   char grade;
   while(scanf("%d", &readnum) == 1){
      if(readnum >= 90)
         grade = 'A';
      else if(readnum >= 80)
         grade = 'B';
      else if(readnum >= 70)
         grade = 'C';
      else if(readnum >= 60)
         grade = 'D';
      else
         grade = 'F';
      
      printf("Score: %d\t Grade: %c\n", readnum, grade);
   }
   return 0;
}