#include<stdio.h>
#include "encode.h"

int main(){
	char mymsg[80];
	while(fgets(mymsg, 80, stdin)){
		encode(mymsg);
		printf("Output = %s", mymsg);
	}
	
	return 0;
}