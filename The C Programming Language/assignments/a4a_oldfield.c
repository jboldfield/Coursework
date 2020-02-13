/*
 * Johnnie Oldfield
 * CS 3335
 * Fall 2018
 */

#include <stdio.h>
#include <stdlib.h>
#define SIZE 10000
//Array for numbers
int numbers[SIZE];

int main(int argc, char *argv[]){
    //File handlers
    FILE *ifp, *ofp;

    //Process input file and put numbers into array
    processInput(ifp);

    //Open output file
    ofp = fopen(argv[1], "w");

    //Get highest number and print to output file
    getHigh(ofp);

    //Get lowest number and print to output file
    getLow(ofp);

    //Get average and print to output file
    getAverage(ofp);

    //Median
    getMedian(ofp);

    //Print ranges
    printRanges(ofp);

    //Count ranges
    getRanges(ofp);

    //Close output file
    fclose(ofp);

    return 0;
}

void processInput(FILE *ifp){
    //Data field
    int number, i = 0;

    //Open file
    ifp = fopen("Numbers.txt", "r");

    //Go thorugh each number in file and add it to array
    while (fscanf(ifp, "%d", &number) != EOF){
        numbers[i] = number;
        i++;
    }
    
    //Close file
    fclose(ifp);
}

void getHigh(FILE *ofp){
    //Data field
    int high = numbers[0], i;

    //Go through array
    for(i = 0; i < SIZE; i++){
        if(numbers[i] > high)
            high = numbers[i];
    }

    //Print to output file
    fprintf(ofp, "Highest = %-15d", high);
}

void getLow(FILE *ofp){
    //Data field
    int low = numbers[0], i;

    //Go through array
    for(i = 0; i < SIZE; i++){
        if(numbers[i] < low)
            low = numbers[i];
    }

    //Print to output file
    fprintf(ofp, "Lowest = %-15d", low);
}

void getAverage(FILE *ofp){
    //Data field
    int average, sum, i;

    //Go through array
    for(i = 0; i < SIZE; i++)
        sum += numbers[i];

    //Set average
    average = sum / SIZE;

    //Print to output file
    fprintf(ofp, "Average = %-15d", average);
}

void getMedian(FILE *ofp){
    //Data field
    int median, sum, i;

    //Sort numbers array for median
    sort();

    //Get median, average of two spots because size is even
    sum = numbers[4999] + numbers[4998];
    median = sum / 2;

    //Print to output file
    fprintf(ofp, "Median = %-15d", median);
}

void sort(void){
    //Data field
    int i, j, tmp;

    //Loop thorugh and sort array
    for (i = 0; i < SIZE; i++){
		for (j = 0; j < SIZE; j++){
			if (numbers[j] > numbers[i]){
				tmp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = tmp;
			}  
		}
	}
}

void printRanges(FILE *ofp){
    //Data field
    int i;
    char ranges[][10] = {
        {"0-999"}, {"1000-1999"}, {"2000-2999"},
        {"3000-3999"}, {"4000-4999"}, {"5000-5999"},
        {"6000-6999"}, {"7000-7999"}, {"8000-8999"},
        {"9000-9999"}
    };

    //Start print
    fprintf(ofp, "\nRange: \t\t\t\t", NULL);

    //Loop through ranges and print it to output file
    for(i = 0; i < 10; i++)
        fprintf(ofp, "%-13s", ranges[i]);
}

void getRanges(FILE *ofp){
    //Data field
    int i, ranges[10] = {0}; 

    //Count ranges
    for(i = 0; i < SIZE; i++){
        if(numbers[i] >= 0 && numbers[i] <= 999)
            ranges[0]++;
        else if(numbers[i] >= 1000 && numbers[i] <= 1999)
            ranges[1]++;
        else if(numbers[i] >= 2000 && numbers[i] <= 2999)
            ranges[2]++;
        else if(numbers[i] >=3000 && numbers[i] <= 3999)
            ranges[3]++;
        else if(numbers[i] >= 4000 && numbers[i] <= 4999)
            ranges[4]++;
        else if(numbers[i] >= 5000 && numbers[i] <= 5999)
            ranges[5]++;
        else if(numbers[i] >= 6000 && numbers[i] <= 6999)
            ranges[6]++;
        else if(numbers[i] >= 7000 && numbers[i] <= 7999)
            ranges[7]++;
        else if(numbers[i] >= 8000 && numbers[i] <= 8999)
            ranges[8]++;
        else 
            ranges[9]++;
    }

    //Start print
    fprintf(ofp, "\nCount of numbers: \t", NULL);

    //Loop through ranges and print to output file
    for(i = 0; i < 10; i++)
        fprintf(ofp, "%-13d", ranges[i]);
}