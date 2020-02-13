#include<stdio.h>

typedef enum{
	COUNT, POUND, GALLON
} measure;

typedef union{
	int count;
	float weight;
	float volume;
} quantity;

typedef struct{
	char item[20];
	quantity amount;
	measure unit;
} order;

void printorder(order ord){
	if(ord.unit == COUNT)
		printf("You have ordered %d %s\n", ord.amount.count, ord.item);
	if(ord.unit == POUND)
		printf("You have ordered %.2f pound %s\n", ord.amount.weight, ord.item);
	if(ord.unit == GALLON)
		printf("You have ordered %.2f gallons %s\n", ord.amount.volume, ord.item);
}


int main(){
	
	order apples = {"apple", .amount.count=10, COUNT};
	order juice = {"orange-pineapple", .amount.volume=0.5, GALLON};
	order sugar = {"cane sugar", .amount.weight=1, POUND};
	
	printorder(apples);
	printorder(sugar);
	printorder(juice);
	
	return 0;
}