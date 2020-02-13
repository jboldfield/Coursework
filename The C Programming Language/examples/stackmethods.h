#include<stdlib.h>
#include "structs.h"

stacknode* newItem(student p){
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