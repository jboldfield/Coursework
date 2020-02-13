#include <stdio.h>
int main(){
    //Make struct
    typedef struct node{
        int value;
        struct node *next;
    } node;

    //Set nodes
    node a = {3, NULL};
    node b = {8, NULL};
    node c = {23, NULL};

    //Set pointers
    a.next = &b;
    b.next = &c;
    c.next = NULL;

    //Iterator
    node *i;
    i = &a;

    //Print list
    displayList(i);

    //New node
    node d = {19, NULL};

    //Set new pointer
    d.next = b.next;
    b.next = &d;

    //Set *i back to a
    i = &a;

    //Print list
    displayList(i);
}

void displayList(node *i){
    
    for(; i != NULL; i = i -> next)
        printf("%d ", *i);
    printf("\n");
}