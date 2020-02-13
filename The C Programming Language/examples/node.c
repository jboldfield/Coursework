
#include <stdio.h>
typdef struct node{
    int val;
    struct node *next;
}node;

node* create_node(int v){
    node *p = (node *)malloc(sizeof(node));
    p -> val = v;
    p -> next = NULL;
    return p;
}

void display_list(node *ls){
    node *p = ls;
    for(; p != NULL; p = p -> next)
        printf("%d-->", p -> val);
}

int main(){
    node *a = create_node(3);
    node *b = create_node(8);
    node *c = create_node(23);

    a -> next = b;
    b -> next = c;

    display_list(a);
    return 0;
}