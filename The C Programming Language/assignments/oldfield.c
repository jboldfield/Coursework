/*
 * Johnnie Oldfield
 * CS3335
 * Fall 2018
 */

#include <stdio.h>

//Array to store user input
int inputArray[4];

//Make an array for 4 seven-segment digits
char digits[3][16];

//Array to store the 7 segments for 0-9
//Sequence:
//Top, upper left, upper right, middle, lower left, lower right, bottom 
int segments[10][7] = {
    //0
    {1,1,1,0,1,1,1},
    //1
    {0,0,1,0,0,1,0},
    //2
    {1,0,1,1,1,0,1},
    //3
    {1,0,1,1,0,1,1},
    //4
    {0,1,1,1,0,1,0},
    //5
    {1,1,0,1,0,1,1},
    //6
    {1,1,0,1,1,1,1},
    //7 
    {1,0,1,0,0,1,0},
    //8
    {1,1,1,1,1,1,1},
    //9 
    {1,1,1,1,0,1,1}
};

int main() {
    //Variable field
    int i, pos = 0;

    //Call function to get user input
    getInput();

    //Call function to fill array
    fill();

    //Go through each digit 
    for(i = 0; i < 4; i++){
        activateSegments(inputArray[i], pos);
        pos++;
    }

    //Call function to print digits
    print();

    return 0;
}

//Get input
void getInput(){
    //Get input
    int input;
    printf("\nEnter PIN number (Ex: 8073, 9 = 0009): ");
    scanf("%4d", &input);
    //Put input into an array
    int i = 3;
    //Grab right most number and store in array then cut it
    while (input != 0) {
        inputArray[i] = input % 10;
        input /= 10;
        i--;
    } 
}

//Fill digit array with empty space
void fill(){
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < sizeof(digits[i]); j++){
            digits[i][j] = ' ';
        }
    }
}

//Function to turn on segments within digits array
void activateSegments(int digit, int pos){
    //Go through each segment
    for(int i = 0; i < 7; i++){
        //If segment is 1 turn on that segment
        if(segments[digit][i] == 1){
            switch(i){
                //Segment 1 - Top
                case 0: digits[0][1 + pos * 4] = '_';
                    break;
                //Segment 2 - Top left
                case 1: digits[1][0 + pos * 4] = '|';
                    break;
                //Segment 3 - Top right
                case 2: digits[1][2 + pos * 4] = '|';
                    break;
                //Segment 4 - Middle
                case 3: digits[1][1 + pos * 4] = '_';
                    break;
                //Segment 5 - Lower left
                case 4: digits[2][0 + pos * 4] = '|';
                    break;
                //Segment 6 - Lower right
                case 5: digits[2][2 + pos * 4] = '|';
                    break;
                //Segment 7 - Bottom
                case 6: digits[2][1 + pos * 4] = '_';
                    break;
            }
        }
    }
}

//Print digit array 
void print(){
    int i, j;
    for(i = 0; i < 3; i++){
        for(j = 0; j < 16; j++)
            printf("%c", digits[i][j]);
        printf("\n");
    }
    printf("\n");
}