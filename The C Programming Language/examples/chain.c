/* Example demonstrates how to define a structure that references similar structure. 
Using that we can create a linked-list of structures (similar objects). Note the use
of 'next' pointer i9n the example. */

#include<stdio.h>

typedef struct node{ // you need to use the same structure data type name here...
	int val;
	struct node *next;  //... so that it can be used to define the pointer
}node;

int main(){
	
	node a = {3, NULL};
	node b = {8, NULL};
	node c = {19, NULL};
	
	a.next = &b;
	b.next = &c;
	
	node *i; // declare a pointer to a 'node' type
	i = &a;  // assign address to the first 'node' object
	
	for( ; i != NULL; i = i->next){
		
		printf("Value = %d\t", i->val);
	}
	
	node d = {23, NULL};
	c.next = &d;
	
	node *j; // declare a pointer to a 'node' type
	j = &a;  // assign address to the first 'node' object
	
	for( ; j != NULL; j = j->next){  //wouldn't it be nice to have a displaylist() method
		
		printf("Value = %d\t", j->val); 
	}
	
	return 0;
}