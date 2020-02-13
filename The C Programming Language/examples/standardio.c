/* Example demonstrates the two I/O streams stdout and stderr */
/* Both are default screen output, however, can be redirected to 
other output forms (like files, devices, printers, ports, etc.) */

#include<stdio.h>
#include<stdlib.h>

int main(int argc, char *argv[]){
	int i;
	i = atoi(argv[1]);
	if(i < 1 || i > 10)
	   fprintf(stderr, "Invalid number\n");
	else
	   fprintf(stdout, "Valid number: %d\n", i);
	return 0;
}
