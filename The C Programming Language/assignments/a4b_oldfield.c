/*
 * Johnnie Oldfield
 * CS 3335
 * Fall 2018
 */

#include <stdio.h>
#include <stdlib.h>

int getSize(FILE * ifp){
    //Data field
    int i = 0;

    //Ignore starting strings
    fscanf(ifp, "%*s %*s ", NULL);

    //Go thorugh each number in file and to find number of departures/arrvials 
    while (fscanf(ifp, "%*d:%*d ", NULL, NULL) != EOF){
        i++;
    }

    return i;
}

void processInputFile(FILE *ifp, int *pta, int *ptb){
    //Data field
    int a, b;

    //Reset scan
    rewind(ifp);

    //Ignore starting strings
    fscanf(ifp, "%*s %*s ", NULL);

    //Go thorugh each number in file and to find number of departures/arrvials 
    while (fscanf(ifp, "%d:%d ", &a, &b) != EOF){
        //Store time into time array in minute format
        *pta++ = a;
        *ptb++ = b;
    }
}

int getClosest(int size, int x, int y, int *pta, int *ptb){
   //Data field
    int input = ((x * 60) + y);
    int smallestDifference = abs(input - ((*pta * 60) + *pta));
    int closest = 0, currentDifference, i;

    //Loop thorugh arrays and check the closest based on difference 
    for (i  = 0; i < size; i += 2, pta += 2, ptb += 2){
        currentDifference = abs(input - ((*pta * 60) + *ptb));
        //Make sure it is greater than or equal to input
        if(currentDifference < smallestDifference && ((*pta * 60) + *ptb) >= input){
            smallestDifference = currentDifference;
            closest = i;
        }
    }
    return closest;
}

int main(void){
    //Data field
    int x, y, size, loc, *pta, *ptb;

    //File handler
    FILE *ifp;

    //Open file
    ifp = fopen("flights.txt", "r");

    //Get input
    printf("Enter your time: (16:45)");
    scanf("%d:%d", &x, &y);
    
    //Get the number of flights in the file
    size = getSize(ifp);

    //Create array for a and b and set pointers
    int a[size];
    int b[size]; 
    pta = a;
    ptb = b;

    //Process input file and put time into array.
    processInputFile(ifp, pta, ptb);

    //Get closest 
    loc = getClosest(size, x, y, pta, ptb);

    //Print
    printf("\nCloesest departure from A is %d:%d and arriving at %d:%d in B", a[loc], b[loc], a[loc + 1], b[loc + 1]);

    //Close file
    fclose(ifp);

    return 0;
}