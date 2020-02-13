/*
 * Johnnie Oldfield
 * CS 3335
 * Fall 2018
 */
#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int id;
    double arrival_time;
    int duration;
    int rank;
}proc;

// Function to get number of orders
int get_orders(){
    // Data field
    int orders = 0;
    FILE *ifp;

    // Open file
    ifp = fopen("processes.txt", "r");

    // Ignore starting strings
    fscanf(ifp, "%*s %*s %*s %*s", NULL);
    
    // Go through each process in file and add it to array
    while (fscanf(ifp, "%*d %*lf %*d %*d", NULL) != EOF){
        orders++;
    }
    
    // Close file
    fclose(ifp);

    return orders;
}

// Function that processes the input file
void process_file(proc *arrpt){
    //Data field
    FILE *ifp;

    //Open file
    ifp = fopen("processes.txt", "r");

    //Ignore starting strings
    fscanf(ifp, "%*s %*s %*s %*s\n", NULL);

    //Go through each process in file and add it to array
    proc temp;
    while (fscanf(ifp, "%d %lf %d %d", &temp.id, &temp.arrival_time, &temp.duration, &temp.rank) != EOF){
        *arrpt = temp;
        arrpt++;
    }
    
    //Close file
    fclose(ifp);
}

// Function that sorts array based on arrival time and prints first 5
void fcfs(proc *arrpt, int size){
    // Data field
    int i, j; 
    proc temp = *arrpt;

    // Go through array and sort by earliest arrival time
    for (i = 0; i < size; i++) {
        for (j = i + 1; j < size; j++){
            if ((*(arrpt + i)).arrival_time > (*(arrpt + j)).arrival_time) {
               temp = *(arrpt + i);
               *(arrpt + i) =  *(arrpt + j);
               *(arrpt + j) = temp;
            }
        }
    }

    printf("\nFCFS Order:\nID\tArrival Time\tDuration\tRank\n");

    // Print first 5 
    for (i = 0; i < 5; i ++){
        printf("%d\t%.1lf\t\t%d\t\t%d\n", arrpt->id, arrpt->arrival_time, arrpt->duration, arrpt->rank);
        arrpt++;
    }
}

// Function that sorts array by process duration
void sd(proc *arrpt, int size){
    // Data field
    int i, j; 
    proc temp = *arrpt;

    // Go through array and sort by duration (shortest to longest)
    for (i = 0; i < size; i++) {
        for (j = i + 1; j < size; j++){
            if ((*(arrpt + i)).duration > (*(arrpt + j)).duration) {
               temp = *(arrpt + i);
               *(arrpt + i) =  *(arrpt + j);
               *(arrpt + j) = temp;
            }
        }
    }

    printf("\nFCFS Order:\nID\tArrival Time\tDuration\tRank\n");

    // Print first 5 
    for (i = 0; i < 5; i ++){
        printf("%d\t%.1lf\t\t%d\t\t%d\n", arrpt->id, arrpt->arrival_time, arrpt->duration, arrpt->rank);
        arrpt++;
    }
}

// Function that sorts based on rank and prints first 5
void ranked(proc *arrpt, int size){
    // Data field
    int i, j; 
    proc temp = *arrpt;

    // Go through array and sort by ranked with 1 being the highest
    for (i = 0; i < size; i++) {
        for (j = i + 1; j < size; j++){
            if ((*(arrpt + i)).rank > (*(arrpt + j)).rank) {
               temp = *(arrpt + i);
               *(arrpt + i) =  *(arrpt + j);
               *(arrpt + j) = temp;
            }
        }
    }

    printf("\nRanked Order:\nID\tArrival Time\tDuration\tRank\n");

    // Print first 5 
    for (i = 0; i < 5; i ++){
        printf("%d\t%.1lf\t\t%d\t\t%d\n", arrpt->id, arrpt->arrival_time, arrpt->duration, arrpt->rank);
        arrpt++;
    }
}

// Function that gets user input and prints first 5
void get_input(proc *stpt, proc *arrpt, int size){
     // Data field
    int choice = 5;

    // Print menu
    printf("\n1) For FCFS\n");
    printf("2) For SD\n");
    printf("3) For RANKED.\n");
    printf("0) To END.\n");

    while(choice != 0){
        // Reset array pointer
        arrpt = stpt;

        printf("\nEnter your choice: ");
        scanf("%d", &choice);
        switch(choice){
            case 0:
                return;
            case 1:
                fcfs(arrpt, size);
                break;
            case 2:
                sd(arrpt, size);
                break;
            case 3:
                ranked(arrpt, size);
                break;
            default:
                printf("Not a choice.");
                break;
        }
    }
}

int main(){
    // Data field
    int size, i;
    proc *stpt, *arrpt;

    size = get_orders();

    // Create array of processes and set pointers
    proc processes[size];
    stpt = processes;
    arrpt = stpt;

    process_file(arrpt);

    get_input(stpt, arrpt, size);

    return 0;
}