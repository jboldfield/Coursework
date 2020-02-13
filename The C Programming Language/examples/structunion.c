/* Example demonstrates idea of 'union' that is similar to 
structures. However, union can hold only one data at a time. */

#include<stdio.h>
#define PI 3.14

typedef struct{
	int length;
	int radius;
	double area;
} object;

typedef union{
	int length;
	int radius;
	double area;
} shape;

int main(){
	
	object o1;  shape  s1;	
	
	o1.length = 3;	o1.area = o1.length*o1.length;
	
	s1.radius = 3; 	s1.area = PI*s1.radius*s1.radius;
	
	printf("Object length = %d and area = %f\n", o1.length, o1.area);
	
	printf("Shape radius = %d and area = %f\n", s1.radius, s1.area);
	
	//printf("Sizeof object = %d\t Sizeof shape = %d\n\n", sizeof(object), sizeof(shape)); // check the amount of mem. space
	
	return 0;
}