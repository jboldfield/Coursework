#include<stdio.h>
#include "stackmethods.h"

int main(){ 

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
  
  return 0;
 }