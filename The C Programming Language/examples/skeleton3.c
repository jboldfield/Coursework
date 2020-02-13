#include<stdio.h>
#include<stdlib.h>
#define SIZE 10
typedef struct{
   int score;
   char name[10];
}student;

struct gradestack{ // complete the structure
   int top; //to indicate the 'top' position of the stack
   student stack[SIZE]; // make fixed stack array
}gradestack;

void push(student s){
 //Check is stack is full
 if (gradestack.top == SIZE){
     printf("Stack is full\n");
     return;
 }
else{
    gradestack.top = gradestack.top + 1;
    gradestack.stack[gradestack.top] = s;
}
return;
}

void pop(){
    student s;
    //Check is stack is empty
    if (gradestack.top == -1){
        printf("Empty stack\n");
    }
    else {
        s = gradestack.stack[gradestack.top];
        printf ("Poped: = %s %d\n", gradestack.stack[gradestack.top].name, gradestack.stack[gradestack.top]. score);
        gradestack.top = gradestack.top - 1;
    }
}

void peek(){
    printf("%s %d", gradestack.stack[gradestack.top].name, gradestack.stack[gradestack.top].score);
}


int main(){
   //read data from testscores.txt file and place them in stack to initialize
   //allow user to do push, pop, or peek

   //Data field
   FILE *ifp;
   int choice = 0;
   char name[15];
   int score;
   student s;

   //Open file
   ifp = fopen("testscores.txt", "r");

   //push file into stack
    while (fscanf(ifp, "%s %2d", &s.name, &s.score) != EOF){
        push(s);
    }

   //Get user input
   while (choice != 4){
    printf("\n1 - Push \n2 - Pop\n3 - Peek\n4 - End\n");
    scanf("%d", &choice);
    switch(choice){
        case 1: ;
            printf("Enter student and grade");
            scanf("%s %d", &s.name, &s.score);
            push(s);
            break;
        case 2: 
            pop();
            break;
        case 3: 
            peek();
            break;
        case 4:
            break;
    }
   }

   //Close file
   fclose(ifp);

   return 0;
}