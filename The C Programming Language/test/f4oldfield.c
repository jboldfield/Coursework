/*
 * Johnnie Oldfield
 * CS 3335
 * Fall 2018
 */

#include <stdio.h>
#include <stdlib.h>

// Struct for data and next node
struct Node {
    // Data
	int i;
    // Pointer to next
	struct Node* next;
};

// Start empty queue
struct Node* front = NULL;
struct Node* back = NULL;

void add(int i) {
    // create a node with space enough for node
    struct Node *temp = (struct Node*)malloc(sizeof(struct Node));

    //Set i
	temp->i = i; 

    // Set next to null (no item yet)
	temp->next = NULL;

	if(back == NULL && front == NULL){
		front = back = temp;
		return;
	}

    // set back
	back->next = temp;
	back = temp;
}

void delete() {
   printf("didn't get to it");
}

//Print the queue
void print_queue() {
    // make front
	struct Node* temp = front;
    // go thorugh queue until the NULL is found
	while(temp != NULL) {
		printf("%d->",temp->i);
		temp = temp->next;
	}
}

void menu(){
    int choice = 5;
    int i = 0;
    printf("\n1) Insert.\n");
    printf("2) Delete.\n");
    printf("3) Print.\n");
    printf("0) To end.");

    while(choice != 0){

        printf("\n\nEnter your choice: ");
        scanf("%d", &choice);
        switch(choice){
            case 0:
                return;
            case 1:
                printf("Enter integer.");
                scanf("%d", &i);
                add(i);
                break;
            case 2:
                delete();
                break;
            case 3:
                print_queue();
                break;
            default:
                printf("Not a choice.");
                break;
        }
    }
}

int main(){
    // go to menu
    menu();

    return 0;
}