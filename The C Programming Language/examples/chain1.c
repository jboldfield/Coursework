#include<stdio.h>
#include<stdlib.h>

typedef struct node{
	int val;
	struct node *next;
}node;

node* create_node(int v){
	node *p = malloc(sizeof(int));
	p->val = v;
	p->next = NULL;
	return p;
}

void displaylist(node* ls){
	node *j = ls;
	for(; j != NULL; j = j->next){
		printf("%d-->", j->val);
	}
	printf("NULL\n");
}

int main(){
	//build a link list
	node *a = create_node(3);
	node *b = create_node(8);
	node *c = create_node(11);
	
	a->next = b;
	b->next = c;
	
	displaylist(a);
	
	return 0;
}