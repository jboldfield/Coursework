/*
 * 	Johnnie Oldfield
 * 	CS 3335
 * 	Fall 2018
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MIN 1
#define MAX 15

void magic(int n){
	//Create magic box of size n
	//and set all elements to 0.
	int magicBox[n][n];
	puts("came");
	//memset(magicBox, 0, sizeof(magicBox[0][0]) * n * n);
	for(int i = 0; i < n; i++){
		puts("snickers");
		for(int j = 0; j < n; j++)
			magicBox[i][j] = 1;
	
		printf("magicBox[%d][%d] = %d\n", i, 0, magicBox[i][n]);
	}

	
	//Print magic box
	for(int i = 0; i < n; i++){
		puts("came to you");
        for(int j = 0; j < j; j++)
            printf("%d\t", magicBox[i][j]);
        puts("\n");
    }
    
    puts("came 4 you");
}

int main (int argc, char *argv[]){
	//set n 
	int n = atoi(argv[1]);
	//check if arguments are correct
	if (n < MIN || n > MAX){
		puts("Invalid argument. (Use an integer 1-15)");
		return 0;
	}
	//If correct run magic
	else{
		magic(n);
		return 0;
	}
}