/* This is a solution to the stack problem based on dynamic memory allocation. 
The stack is implemented as a linked list where the first node ('head') serves
as the top of the stack. However, there is no need to create a stack object as 
the linked list of 'node' objects is the stack. */

#include<stdio.h>
#include<stdlib.h>

typedef struct{
   int score;
   char name[10];
}student;

typedef struct stacknode{
  student element;
  struct stacknode *next;
}stacknode;


stacknode* newItem(student p){ // creating a new node with the item
  stacknode* stnode = (stacknode*)malloc(sizeof(stacknode));
  stnode->element = p;
  stnode->next = NULL;
  return stnode;
}

int isEmpty(stacknode *s){
  return !s;
}

void push(stacknode **s, student p){ // indicates pointer to a pointer referencing the start node
  stacknode *item = newItem(p);
  item->next = *s;
  *s = item;
  printf("%s's record is pushed successfully!\n", p.name);
}

student pop(stacknode **s){
  if(isEmpty(*s)){
    fprintf(stderr, "The stack is empty. Cannot delete!\n");
    exit(1);
  }
  stacknode *temp = *s;
  *s = (*s)->next;
  student popped = temp->element;
  free(temp);
  return popped;
}

student peek(stacknode *s){
  if(isEmpty(s)){
    fprintf(stderr, "The stack is empty!\n");
    exit(1);
  }
  return s->element;
}

//can you implement a printStack function that would display the content


int main(){
   /* This demo creates some objects manually and insert into stack; you 
   can replace this by reading the data from file and store the student 
   objects into a data structure (or, insert directly into the stack). */ 

  stacknode *head = NULL;

  student s1 = {92, "John"};
  student s2 = {89, "Alice"};
  student s3 = {77, "Bob"};

  push(&head, s1);
  push(&head, s2);
  push(&head, s3);

  student removed = pop(&head);
  printf("Popped item: %s\t %d\n", removed.name, removed.score);

  printf("Top element: %s\t %d\n", peek(head).name, peek(head).score);
  
  student s4 = {83, "Charlie"};
  student s5 = {98, "Dave"};

  push(&head, s4);
  push(&head, s5);
  
  printf("Now, the top element: %s\t %d\n", peek(head).name, peek(head).score);
  
  // Try to empty the stack and then use peek() to see the result.

  return 0;
}
