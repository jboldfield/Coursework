/*
 * Johnnie Oldfield
 * CS 3335
 * Fall 2018
 */

#include <stdio.h>
#include <stdlib.h>
#include "final.h"

int get_size(){

    int size = 0;
    FILE *ifp;

    ifp = fopen("numbs.txt", "r");

    while (fscanf(ifp, "%*d ", NULL) != EOF){
        size++;
    }
    
    fclose(ifp);

    return size;
}

void process_file(int *arrpt){
    FILE *ifp;
    int temp = 0;
    ifp = fopen("numbs.txt", "r");

    while (fscanf(ifp, "%d ", &temp) != EOF){
        *arrpt = temp;
        arrpt++;
    }
    
    fclose(ifp);
}

//
int exists(int *arrpt, int size, int b){
    int i = 0;
    for (i = 0; i < size; i++){
        if(*arrpt == b)
            return i;
        arrpt++;
    }
    return -1;
}

int duplicate(int *arrpt, int size, int b){
    int i = 0;
    for (i = 0; i < size; i++){
        if (*arrpt == b)
            return 1;
        arrpt++;
    }
    return 0;
}

int frequency(int *arrpt, int size, int b){
    int i = 0;
    int f = 0;
    for (i = 0; i < size; i++){
        if(*arrpt == b)
            f++;
        arrpt++;
    }
    if (f > 0)
        return f;
    else
        return 0;
}

void menu(int *stpt, int *arrpt, int size){
    int choice = 5;
    int b = 0;

    typedef int (*fpt)(int *, int, int);

    fpt functions[3] = {&exists, &duplicate, &frequency};

    printf("\n1) Exists.\n");
    printf("2) Duplicate.\n");
    printf("3) Frequency.\n");
    printf("0) To end.");

    while(choice != 0){
        arrpt = stpt;

        printf("\n\nEnter your choice: ");
        scanf("%d", &choice);
        switch(choice){
            case 0:
                return;
            case 1:
                printf("Enter a number. ");
                scanf("%d", &b);
                printf("%d\n", functions[choice - 1](arrpt, size, b));
                break;
            case 2:
                printf("Enter a number. ");
                scanf("%d", &b);
                printf("%d\n", functions[choice - 1](arrpt, size, b));
                break;
                break;
            case 3:
                printf("Enter a number. ");
                scanf("%d", &b);
                printf("%d\n", functions[choice - 1](arrpt, size, b));
                break;
                break;
            default:
                printf("Not a choice.");
                break;
        }
    }
}

int main(){
    // Data field
    int size = 0;
    int *arrpt, *stpt;

    // Set size
    size = get_size();

    // Make array
    int arr[size];
    stpt = arr;
    arrpt = arr;

    // Process file
    process_file(arrpt);

    arrpt = stpt;

    // Menu
    menu(stpt, arrpt, size);

    return 0;
}